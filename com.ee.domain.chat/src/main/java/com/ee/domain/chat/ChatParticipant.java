package com.ee.domain.chat;

import java.util.Set;

public interface ChatParticipant<T> {

	public T getPersonInfo();

	public Set<T> getContactList();
}
