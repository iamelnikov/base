package com.ee.repository.mongo.chat;

import org.springframework.data.repository.CrudRepository;

import com.ee.domain.message.Message;

public interface MessageRepository extends CrudRepository<Message<?>, String>{

}
