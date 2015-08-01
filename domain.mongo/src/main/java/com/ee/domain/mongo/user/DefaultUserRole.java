package com.ee.domain.mongo.user;



public class DefaultUserRole extends AbstractMongoUserRole {

	private static final long serialVersionUID = 7256420074159916089L;

	public DefaultUserRole(String name) {
		super(name);
	}

	public DefaultUserRole(String name, String description) {
		super(name, description);
	}
}
