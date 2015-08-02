package com.ee.domain.chat.impl;


public class MongoPrivateChatImpl extends PrivateChat<String>{

	public MongoPrivateChatImpl(String id, String title, String participant1,
			String participant2) {
		super(id, title, participant1, participant2);
	}

	public MongoPrivateChatImpl(String title, String participant1,
			String participant2) {
		super(title, participant1, participant2);
	}

	@Override
	protected String getIdentifiedStringFromUserObject(String user) {
		return user;
	}
}
