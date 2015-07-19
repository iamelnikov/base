package com.ee.domain.mongo.user;

import org.springframework.security.core.GrantedAuthority;

import com.ee.domain.user.AbstractUserRole;
import com.ee.domain.user.UserRole;

public abstract class AbstractMongoUserRole extends AbstractUserRole implements
		UserRole, GrantedAuthority {

	private static final long serialVersionUID = 2178326018338150400L;

	public AbstractMongoUserRole(String name) {
		super(name, null);
	}
	
	public AbstractMongoUserRole(String name, String description) {
		super(name, description);
	}

	public String getAuthority() {
		return name;
	}

}
