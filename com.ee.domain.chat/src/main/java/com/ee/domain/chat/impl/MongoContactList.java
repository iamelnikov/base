package com.ee.domain.chat.impl;

import java.util.Set;

import com.ee.core.impl.CollectionTools;
import com.ee.domain.user.User;

public class MongoContactList extends ContactListImpl<String> {

	public MongoContactList(String id, String user) {
		super(id, user);
	}

	public MongoContactList(String user) {
		super(user);
	}

	@Override
	protected String getProtectedUserId() {
		return user;
	}

	@Override
	protected Set<String> getProtectedUserNames() {
		return users;
	}

	@Override
	public void addUser(User user) {
		assert user != null;
		CollectionTools.initSetAsLinkedHashSetIfNull(users);
		this.users.add(user.getUsername());
	}

	@Override
	public void removeUser(User user) {
		assert user != null;
		removeUser(user.getUsername());
	}

	@Override
	public void removeUser(String userName) {
		assert userName != null && userName.trim().length() > 0;
		if (this.users!=null)
			this.users.remove(userName);
	}

}
