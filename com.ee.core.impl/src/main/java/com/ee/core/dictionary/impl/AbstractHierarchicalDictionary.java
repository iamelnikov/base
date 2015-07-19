package com.ee.core.dictionary.impl;

import com.ee.core.dictionary.HierarchicalDictionary;


public class AbstractHierarchicalDictionary<T, K extends AbstractHierarchicalDictionary<T, K>> extends
		AbstractLinkedDictionary<T, K> implements HierarchicalDictionary<T, K> {

	public AbstractHierarchicalDictionary(T value, K parentObject) {
		super(value, parentObject);
	}
	
	public AbstractHierarchicalDictionary(String id, T value, K parentObject) {
		super(id, value, parentObject);
	}

}
