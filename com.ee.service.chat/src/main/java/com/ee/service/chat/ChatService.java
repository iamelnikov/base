package com.ee.service.chat;

import java.util.Set;

import com.ee.domain.chat.Chat;

public interface ChatService<U, C> {

	public Chat<U> createNewPrivateChat(String title, U user1, U user2,
			boolean secure);

	public Chat<U> createNewPrivateChat(U user1, U user2, boolean secure);

	public Chat<U> createNewGroupChat(String title, U chatCreator,
			Set<U> chatParticipants, boolean secure);

	public Chat<U> createNewGroupChat(U chatCreator,
			Set<U> chatParticipants, boolean secure);

	public Chat<U> createNewBusinessDiscussion(C company, U user,
			Set<U> chatSet);

	public Chat<U> createNewExtendedBusinessDiscussion(C company, U user,
			Set<U> chatSet);

	public void addParticipantToChat(Chat<U> chat, String userName);

	public void addParticipantToChat(Chat<U> chat, U user);

	public void removeParticipantFromChat(Chat<U> chat, String userName);

	public void removeParticipantFromChat(Chat<U> chat, U user);
	

}
