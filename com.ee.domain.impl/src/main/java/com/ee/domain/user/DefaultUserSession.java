package com.ee.domain.user;

import java.util.Date;

import com.ee.core.impl.AbstractPersistentObject;

public class DefaultUserSession extends AbstractPersistentObject implements
		UserSession {
	private String userId;

	private final Date creationDate;

	private Date destroyDate;

	private final String previousSessionId;

	public DefaultUserSession(String userId) {
		super();
		this.userId = userId;
		this.creationDate = new Date();
		this.destroyDate = null;
		this.previousSessionId = null;
	}

	public DefaultUserSession(String userId, String previousSessionId) {
		super();
		this.userId = userId;
		this.creationDate = new Date();
		this.destroyDate = null;
		this.previousSessionId = previousSessionId;
	}

	@Override
	public String getUserId() {
		return userId;
	}

	@Override
	public Date getCreationDate() {
		return creationDate;
	}

	@Override
	public Date getDestroyDate() {
		return destroyDate;
	}

	@Override
	public String getPreviousSessionId() {
		return previousSessionId;
	}

	@Override
	public void destroy() {
		this.destroyDate = new Date();
	}
}
