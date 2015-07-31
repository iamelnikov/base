package com.ee.domain.message;

import java.util.Date;

import com.ee.core.PersistentObject;

public interface Message<T> extends PersistentObject {
	
	public T getContent();

	public Date getCreationDate();

	public boolean wasModified();

	public Date getModifyDate();
	
	public boolean isRemoved();
	
	public Date getRemoveDate();
	
}
