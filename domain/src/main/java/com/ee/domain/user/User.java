package com.ee.domain.user;

import java.util.Set;

import com.ee.core.PersistentObject;
import com.ee.domain.person.Person;

public interface User extends PersistentObject {
	public String getUsername();

	public String getPassword();

	public String getEmail();

	public Boolean isBlocked();

	public Boolean isPasswordExpired();

	public Set<? extends UserRole> getRoles();

	public Person getPerson();

	public void addRole(UserRole grantedAuthority);

	public void removeRole(UserRole grantedAuthority);
}
