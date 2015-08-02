package com.ee.domain.chat.impl;

import java.util.Date;

public class MongoStringChatMessage extends StringChatMessage<String> {

	public MongoStringChatMessage(String id, String publisherId,
			String content, Date publishDate, Date modifyDate,
			boolean modified, boolean removed, Date removeDate) {
		super(id, publisherId, content, publishDate, modifyDate, modified,
				removed, removeDate);
	}

	public MongoStringChatMessage(String id, String publisherId, String content) {
		super(id, publisherId, content);
	}

	public MongoStringChatMessage(String publisherId, String content) {
		super(publisherId, content);
	}

	@Override
	protected String getProtectedChatId() {
		return chat;
	}

}
