package com.ee.domain.mongo;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

public @interface MongoDbPersistentObjectFieldConfig {
	
	public String classFieldName();
	
	public Field mongodbFieldName();
	
	public DBRef mongodbRef();
	
}
