package com.ee.domain.chat;

import com.ee.domain.message.Message;


public interface ChatMessage<T> extends Message<T> {

	public T getChat();
	
	public void checkAsFavorite(String userId);
	
	public void uncheckAsFavorite(String userId);
	
}
