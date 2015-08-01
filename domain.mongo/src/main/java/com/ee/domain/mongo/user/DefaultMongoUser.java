package com.ee.domain.mongo.user;

import com.ee.domain.person.Person;
import com.ee.serialize.MongoUserDeserializer;
import com.ee.serialize.MongoUserSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mongodb.DBObject;

@JsonSerialize(using = MongoUserSerializer.class)
@JsonDeserialize(using = MongoUserDeserializer.class)
public class DefaultMongoUser extends AbstractMongoUser {

	private static final long serialVersionUID = -452779657630201109L;

	public DefaultMongoUser(String userName, String email,
			String password, boolean expired,
			boolean blocked, boolean credentialsNonExpired,
			boolean enabled, Person person) {
		super(userName, email, password, expired,
				blocked, credentialsNonExpired, enabled, person);
	}
	
	public DefaultMongoUser(String id, String userName, String email,
			String password, boolean accountNonExpired,
			boolean blocked, boolean expired,
			boolean enabled, Person person) {
		super(id, userName, email, password, accountNonExpired,
				blocked, expired, enabled, person);
	}
	
	public DefaultMongoUser(String id, String userName, String email,
			String password, Person person) {
		super(id, userName, email, password, true,
				true, true, true, person);
	}

	public DefaultMongoUser(DBObject dbObject) {
		super(dbObject);
	}

}
