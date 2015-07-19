package com.ee.core.dictionary;

public interface SpecificDictionary<T,S> extends Dictionary<T> {

	public S getSpecifiableObject();
}
