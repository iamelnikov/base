package com.ee.domain.chat;

import java.util.Set;

import com.ee.core.PersistentObject;

public interface Chat<U> extends PersistentObject {

	public String getTitle();
	
	public Set<String> getParticipantUserNames();
	
	public void addParticipant(U chatParticipant);
	
	public void removeParticipant(U chatParticipant);
	
	public void removeParticipantByIdentifiedString(String chatParticipantUserName);
	
	public boolean isSecure();
	
}
