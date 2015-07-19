package com.ee.core.dictionary;

import com.ee.core.PersistentObject;

public interface Dictionary<T> extends PersistentObject{
	
	public T getValue();
	
}
