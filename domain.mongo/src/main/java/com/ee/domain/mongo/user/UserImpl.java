package com.ee.domain.mongo.user;

import com.ee.domain.mongo.PersistentObjectImpl;
import com.ee.domain.user.User;

public abstract class UserImpl extends PersistentObjectImpl implements User{

	public UserImpl(String id) {
		super(id);
	}

}
