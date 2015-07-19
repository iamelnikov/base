package com.ee.core.dictionary.impl;

import com.ee.core.dictionary.Dictionary;
import com.ee.core.impl.AbstractPersistentObject;


public abstract class AbstractDictionary<T> extends AbstractPersistentObject
		implements Dictionary<T> {

	protected T value;

	public AbstractDictionary() {
		super();
		this.value = null;
	}

	public AbstractDictionary(String id, T value) {
		super(id);
		this.value = value;
	}
	
	public AbstractDictionary(T value) {
		super();
		this.value = value;
	}

	@Override
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}

}
