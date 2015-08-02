package com.ee.service.chat;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ee.core.impl.CollectionTools;
import com.ee.domain.chat.Chat;
import com.ee.domain.chat.impl.BusinessChatImpl;
import com.ee.domain.chat.impl.MongoBusinessChatImpl;
import com.ee.domain.chat.impl.MongoChatImpl;
import com.ee.domain.chat.impl.MongoPrivateChatImpl;
import com.ee.domain.company.Company;
import com.ee.domain.user.User;
import com.ee.repository.mongo.chat.ChatRepository;
import com.ee.service.messages.ChatMessageSender;
import com.ee.service.messages.MessageSender;

@Service
public class ChatServiceImpl implements ChatService<String, String> {

	@Autowired
	private ChatMessageSender messageSender;
	
//	@Override
//	public Chat<?> createNewPrivateChat(String title, User user1, User user2,
//			boolean secure) {
//		assert user1 != null && user1.getUsername() != null
//				&& user1.getUsername().trim().length() > 0;
//		assert user2 != null && user2.getUsername() != null
//				&& user2.getUsername().trim().length() > 0;
//		Chat chat = new MongoPrivateChatImpl(title, user1.getUsername(),
//				user2.getUsername());
//		Chat savedChat = messageSender.sendMessage(messagePayloadObject);.save(chat);
//		return savedChat;
//	}
//
//	@Override
//	public Chat createNewPrivateChat(User user1, User user2, boolean secure) {
//		assert user1 != null && user1.getUsername() != null
//				&& user1.getUsername().trim().length() > 0;
//		assert user2 != null && user2.getUsername() != null
//				&& user2.getUsername().trim().length() > 0;
//		Chat chat = new MongoPrivateChatImpl("chat with "
//				+ user2.getPerson().getPersonalData().getFullName(),
//				user1.getUsername(), user2.getUsername());
//		Chat savedChat = chatRepository.save(chat);
//		return savedChat;
//	}
//
//	@Override
//	public Chat createNewGroupChat(String title, User chatCreator,
//			Set<User> chatParticipants, boolean secure) {
//		assert chatCreator != null;
//		assert chatParticipants != null && !chatParticipants.isEmpty();
//		final Set<String> userNameSet = chatParticipants.stream()
//				.map(it -> ((User) it).getUsername())
//				.collect(Collectors.toSet());
//		assert userNameSet != null && !userNameSet.isEmpty();
//		MongoChatImpl chat = new MongoChatImpl(title, userNameSet);
//		return savedChat;
//	}
//
//	@Override
//	public Chat<?> createNewGroupChat(User chatCreator,
//			Set<User> chatParticipants, boolean secure) {
//		assert chatCreator != null;
//		assert chatParticipants != null && !chatParticipants.isEmpty();
//		final Set<String> userNameSet = chatParticipants.stream()
//				.map(it -> ((User) it).getUsername())
//				.collect(Collectors.toSet());
//		assert userNameSet != null && !userNameSet.isEmpty();
//		MongoChatImpl chat = new MongoChatImpl(null, userNameSet);
//		Chat savedChat = chatRepository.save(chat);
//		return savedChat;
//	}


}
