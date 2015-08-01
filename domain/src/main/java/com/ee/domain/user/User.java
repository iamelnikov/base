package com.ee.domain.user;

import java.util.Set;

import com.ee.core.PersistentObject;
import com.ee.domain.person.Person;
import com.ee.validation.Email;
import com.sun.istack.internal.NotNull;

@Email
public interface User extends PersistentObject {
	
	@NotNull
	public String getUsername();

	@NotNull
	public String getPassword();

	@NotNull
	public String getEmail();

	public Boolean isBlocked();

	public void blockUser();

	public Boolean isPasswordExpired();

	public Set<? extends UserRole> getRoles();

	@NotNull
	public Person getPerson();

	public void addRole(UserRole grantedAuthority);

	public void removeRole(UserRole grantedAuthority);
}
