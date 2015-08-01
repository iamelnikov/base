package com.ee.domain.message;

import java.util.Date;

import com.ee.core.PersistentObject;

public interface Message<T> {
	
	public T getContent();
	
	public String getPublisherId();

	public Date getPublishDate();

	public boolean isModified();

	public Date getModifyDate();
	
	public boolean isRemoved();
	
	public Date getRemoveDate();
	
}
