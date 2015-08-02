package com.ee.domain.chat.impl;

import java.util.Set;

public class MongoBusinessChatImpl extends BusinessChatImpl<String, String> {

	public MongoBusinessChatImpl(String title, String originatorUserName,
			String originatorCompanyId, Set<String> participantIdSet) {
		super(title, originatorUserName, originatorCompanyId, participantIdSet);
	}

	public MongoBusinessChatImpl(String title, String originatorUserName,
			String originatorCompanyId) {
		super(title, originatorUserName, originatorCompanyId);
	}

	public MongoBusinessChatImpl(String id, String title, String originatorUserName,
			String originatorCompanyId, Set<String> participantIdSet) {
		super(id, title, originatorUserName, originatorCompanyId, participantIdSet);
	}

	public MongoBusinessChatImpl(String id, String title, String originatorUserName,
			String originatorCompanyId) {
		super(id, title, originatorUserName, originatorCompanyId);
	}

	@Override
	protected String getIdentifiedStringFromUserObject(String user) {
		return user;
	}
}
