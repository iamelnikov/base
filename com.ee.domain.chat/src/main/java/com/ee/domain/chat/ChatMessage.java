package com.ee.domain.chat;

import com.ee.domain.message.Message;


public interface ChatMessage<T> extends Message<T> {

	public String getChatId();
	
	public Chat getChat();
	
	public ChatParticipant<?> getSender();

	public String getSenderId();

	public void markAsFavorite();
	
}
