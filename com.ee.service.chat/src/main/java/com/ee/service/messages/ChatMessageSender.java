package com.ee.service.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import com.ee.domain.chat.ChatMessage;

@Service
@Transactional
public class ChatMessageSender implements MessageSender<ChatMessage<?>> {

	@Autowired
	private MessagingTemplate messagingTemplate;
	
	@Autowired
	@Qualifier(value = "ChatMessageQueueDestination")
	private QueueChannel channel;

	@Override
	public void sendMessage(ChatMessage<?> messagePayloadObject) {
		assert messagePayloadObject != null;
		Message<ChatMessage<?>> message = new GenericMessage<ChatMessage<?>>(messagePayloadObject);
		messagingTemplate.send(channel, message);
	}
}
