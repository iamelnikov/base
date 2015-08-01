package com.ee.domain.mongo;

import com.mongodb.DBObject;

public interface MongoPersistentDocument {
	
	public final static String MONGO_ID_FIELDNAME = "_id";
	
	public DBObject toDbObject();
	
}
