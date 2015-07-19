package com.ee.domain.document;

import com.ee.core.PersistentObject;


public interface Document<T> extends PersistentObject{

	public T getFile();
	public void setFile(T file);
}
