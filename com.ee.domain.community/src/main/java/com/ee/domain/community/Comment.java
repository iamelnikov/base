package com.ee.domain.community;

import com.ee.domain.message.Message;

public interface Comment<T> extends Message<T> {

	public String getTargetObjectId();
	
	public Comment<?> getPreviousComment();
	
}
