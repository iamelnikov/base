package com.ee.domain.mongo.user;

import org.springframework.security.core.GrantedAuthority;

import com.ee.domain.mongo.MongoPersistentDocument;
import com.ee.domain.user.AbstractUserRole;
import com.ee.domain.user.UserRole;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public abstract class AbstractMongoUserRole extends AbstractUserRole implements
		UserRole, GrantedAuthority, MongoPersistentDocument {

	private static final long serialVersionUID = 2178326018338150400L;

	private static final String ROLE_FIELD_NAME = "name";

	public AbstractMongoUserRole(String name) {
		super(name, null);
	}

	public AbstractMongoUserRole(String name, String description) {
		super(name, description);
	}

	public String getAuthority() {
		return name;
	}

	@Override
	public DBObject toDbObject() {
		final BasicDBObject dbObj = new BasicDBObject();
		dbObj.put(MONGO_ID_FIELDNAME, id);
		dbObj.put(ROLE_FIELD_NAME, name);
		return dbObj;
	}

}
