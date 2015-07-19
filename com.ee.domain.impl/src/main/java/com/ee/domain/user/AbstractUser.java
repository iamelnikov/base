package com.ee.domain.user;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.person.Person;

public class AbstractUser extends AbstractPersistentObject implements User {

	protected Person person;
	protected String password;
	protected final String userName;
	protected final String email;
	protected final Set<UserRole> roles;
	protected boolean enabled = true;
	protected boolean blocked = false;
	protected boolean active = true;

	public AbstractUser(String id, Person person, String userName,
			String password, String email, boolean enabled) {
		super(id);
		this.person = person;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.enabled = enabled;
		this.roles = new LinkedHashSet<UserRole>();
	}

	public String getUsername() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public Boolean isBlocked() {
		return blocked;
	}

	public Boolean isPasswordExpired() {
		return false;
	}

	public Set<? extends UserRole> getRoles() {
		return Collections.unmodifiableSet(this.roles);
	}
	
	public void addRole(UserRole grantedAuthority) {
		this.roles.add(grantedAuthority);
	}
	
	public void removeRole(UserRole grantedAuthority) {
		this.roles.remove(grantedAuthority);
	}

	@Override
	public Person getPerson() {
		return this.person;
	}

}
