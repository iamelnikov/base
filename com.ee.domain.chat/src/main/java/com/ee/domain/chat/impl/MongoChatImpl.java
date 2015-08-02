package com.ee.domain.chat.impl;

import java.util.Set;

public class MongoChatImpl extends ChatImpl<String> {

	public MongoChatImpl(String title, String originatorId, Set<String> participantIdSet) {
		super(title, originatorId, participantIdSet);
	}

	public MongoChatImpl(String id, String title, String originatorId, Set<String> participantIdSet) {
		super(id, title, originatorId, participantIdSet);
	}

	@Override
	protected String getIdentifiedStringFromUserObject(String user) {
		return user;
	}
}
