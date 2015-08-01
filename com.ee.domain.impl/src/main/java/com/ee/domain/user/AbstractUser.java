package com.ee.domain.user;

import java.util.Collections;
import java.util.Set;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.core.impl.CollectionTools;
import com.ee.domain.person.Person;

public abstract class AbstractUser extends AbstractPersistentObject implements User {

	protected Person person;
	protected String password;
	protected final String userName;
	protected final String email;
	protected Set<UserRole> roles;
	protected boolean enabled = true;
	protected boolean blocked = false;
	
	public AbstractUser(Person person, String userName,
			String password, String email, boolean enabled) {
		super();
		this.person = person;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.enabled = enabled;
	}
	
	public AbstractUser(String id, Person person, String userName,
			String password, String email, boolean enabled) {
		super(id);
		this.person = person;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.enabled = enabled;
	}

	public String getUsername() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public Boolean isBlocked() {
		return blocked;
	}
	

	@Override
	public void blockUser() {
		blocked = true;
		
	}

	public Boolean isPasswordExpired() {
		return false;
	}

	public Set<? extends UserRole> getRoles() {
		return Collections.unmodifiableSet(this.roles);
	}

	public void addRole(UserRole grantedAuthority) {
		assert grantedAuthority != null;
		CollectionTools.initSetAsLinkedHashSetIfNull(this.roles);
		assert this.roles != null;
		this.roles.add(grantedAuthority);
	}

	public void removeRole(UserRole grantedAuthority) {
		assert grantedAuthority != null;
		if (this.roles != null)
			this.roles.remove(grantedAuthority);
	}

	@Override
	public Person getPerson() {
		return this.person;
	}
}
