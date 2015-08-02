package com.ee.domain.user;

import java.util.Date;

public interface UserSession {

	public String getUserId();

	public Date getCreationDate();
	
	public Date getDestroyDate();
	
	public String getPreviousSessionId();
	
	public void destroy();
}
