package com.ee.repository.mongo.chat;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ee.domain.chat.Chat;

public interface ChatRepository extends CrudRepository<Chat<?>, Serializable>{

	
}
