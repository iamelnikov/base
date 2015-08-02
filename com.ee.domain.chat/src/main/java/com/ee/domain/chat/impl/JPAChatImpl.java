package com.ee.domain.chat.impl;

import java.util.Set;

import com.ee.domain.user.User;

public class JPAChatImpl extends ChatImpl<User> {

	public JPAChatImpl(String title, User originator, Set<User> participantIdSet) {
		super(title, originator, participantIdSet);
	}

	public JPAChatImpl(String id, String title, User originator, Set<User> participantIdSet) {
		super(id, title, originator, participantIdSet);
	}

	@Override
	protected String getIdentifiedStringFromUserObject(User user) {
		assert user!=null;
		return user.getUsername();
	}
}
