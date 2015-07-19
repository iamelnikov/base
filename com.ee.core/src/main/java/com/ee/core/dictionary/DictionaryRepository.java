package com.ee.core.dictionary;

import org.springframework.stereotype.Component;

@Component
public interface DictionaryRepository {
	
	public <T> Dictionary<T> getDictionaryRecord(T id, Class<? extends Dictionary<T>> clazz);
}
