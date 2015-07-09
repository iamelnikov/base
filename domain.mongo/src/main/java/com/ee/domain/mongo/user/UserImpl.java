package com.ee.domain.mongo.user;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ee.domain.mongo.PersistentObjectImpl;
import com.ee.domain.person.Person;
import com.ee.domain.user.User;

public abstract class UserImpl extends PersistentObjectImpl implements User, UserDetails{

	private static final long serialVersionUID = -207937805037955399L;
	
	protected Person person;
	protected String password;
	protected final String username;
	protected final Set<GrantedAuthority> authorities;
	protected final boolean accountNonExpired;
	protected final boolean accountNonLocked;
	protected final boolean credentialsNonExpired;
	protected final boolean enabled;
	
	public UserImpl(String id, String userName, String password, ) {
		super(id);
		this.username = userName;
		this.
	}

}
