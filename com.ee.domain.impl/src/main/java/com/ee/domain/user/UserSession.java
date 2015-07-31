package com.ee.domain.user;

import java.util.Date;
import java.util.UUID;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.user.User;

public class UserSession extends AbstractPersistentObject
{
	private User user;
	
	private final String sessionId;
	
	private final Date sessionCreationDate;
	
	private final Date sessionDestroyDate;
	
	private final UserSession previousSessionId;
	
	public UserSession(User user)
	{
		super();
		this.user = user;
		this.sessionId = UUID.randomUUID().toString();
		this.sessionCreationDate = new Date();
		this.sessionDestroyDate = null;
		this.previousSessionId = null;
	}
	
	public UserSession(String guid, User user, Date lastSessionEndDate, UserSession previousSessionId)
	{
		this.user = user;
		this.sessionId = guid;
		this.sessionCreationDate = new Date();
		this.sessionDestroyDate = lastSessionEndDate;
		this.previousSessionId = previousSessionId;
	}


}
