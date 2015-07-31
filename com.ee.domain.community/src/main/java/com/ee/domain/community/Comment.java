package com.ee.domain.community;

import com.ee.domain.message.Message;

public interface Comment<T, C> extends Message<C> {

	public T getTargetObject();
	
	public Comment<T, ?> getPreviousComment();
	
}
