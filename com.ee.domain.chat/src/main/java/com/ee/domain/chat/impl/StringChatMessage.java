package com.ee.domain.chat.impl;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import com.ee.core.impl.CollectionTools;
import com.ee.domain.chat.ChatMessage;
import com.ee.domain.community.AbstractMessage;

public abstract class StringChatMessage<T> extends AbstractMessage<String>
		implements ChatMessage<String> {

	protected T chat;
	protected Map<String, Boolean> favoriteMap;

	public StringChatMessage(String id, String publisherId, String content,
			Date publishDate, Date modifyDate, boolean modified,
			boolean removed, Date removeDate) {
		super(id, publisherId, content, publishDate, modifyDate, modified,
				removed, removeDate);
	}

	public StringChatMessage(String id, String publisherId, String content) {
		super(id, publisherId, content);
	}

	public StringChatMessage(String publisherId, String content) {
		super(publisherId, content);
	}

	protected abstract String getProtectedChatId();

	@Override
	public String getChat() {
		return getProtectedChatId();
	}

	@Override
	public void checkAsFavorite(String userId) {
		assert userId != null && userId.trim().length() > 0;
		CollectionTools.initMapIfNull(this.favoriteMap, LinkedHashMap.class);
		this.favoriteMap.put(userId, true);
	}
	
	@Override
	public void uncheckAsFavorite(String userId) {
		assert userId != null && userId.trim().length() > 0;
		if (this.favoriteMap!=null)
			this.favoriteMap.remove(userId);
	}
}
