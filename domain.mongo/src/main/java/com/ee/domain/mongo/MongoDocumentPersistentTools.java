package com.ee.domain.mongo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.mongodb.DBObject;

public abstract class MongoDocumentPersistentTools {

	public static List<DBObject> convertList(List<? extends MongoPersistentDocument> list) {
		if (list!=null) {
			return list.stream().map(it -> it.toDbObject()).collect(Collectors.toList());
		}
		else
			return Collections.emptyList();
	}
	
	public static boolean isObjectIsMongoPersistentDocument(Object obj){
		assert obj != null; 
		return MongoPersistentDocument.class.isAssignableFrom(obj.getClass());
	}
}
