package com.ee.service.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import com.ee.repository.mongo.chat.MessageRepository;

@Service
public class ChatMessageReceiver implements MessageReceiver {

	@Autowired
	private MessagingTemplate messagingTemplate;

	@Autowired
	private MessageRepository messageRepository;
	
	@Override
	public void handleMessage() {
		Message<?> message = messagingTemplate.receive();
		com.ee.domain.message.Message<?> message1 = (com.ee.domain.message.Message<?>) message.getPayload();
		messageRepository.save(message1);
	}

}
