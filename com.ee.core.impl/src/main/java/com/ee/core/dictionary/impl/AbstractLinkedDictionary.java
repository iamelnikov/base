package com.ee.core.dictionary.impl;

import com.ee.core.dictionary.LinkedDictionary;


public abstract class AbstractLinkedDictionary<T, K> extends AbstractDictionary<T> implements LinkedDictionary<T, K>{

	private K linkedObject;
	
	public AbstractLinkedDictionary(String id, T value, K linkedObj) {
		super(id, value);
		assert linkedObj != null;
		this.linkedObject = linkedObj;
	}
	
	public AbstractLinkedDictionary(T value, K linkedObj) {
		super(value);
		assert linkedObj != null;
		this.linkedObject = linkedObj;
	}
	
	@Override
	public T getValue() {
		return this.value;
	}

	@Override
	public K getLinkedObject() {
		return this.linkedObject;
	}

}
