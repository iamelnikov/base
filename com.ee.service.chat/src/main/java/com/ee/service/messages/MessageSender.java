package com.ee.service.messages;

public interface MessageSender<T> {

	public void sendMessage(T messagePayloadObject);
}
