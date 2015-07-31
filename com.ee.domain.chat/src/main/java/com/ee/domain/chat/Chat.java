package com.ee.domain.chat;

import java.util.Set;

import com.ee.core.PersistentObject;

public interface Chat extends PersistentObject {

	public String getTitle();
	
	public Set<String> getParticipantIds();

	public Set<ChatParticipant<?>> getParticipants();

	public Set<ChatMessage<?>> getMessages();
}
