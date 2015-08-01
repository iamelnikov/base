package com.ee.serialize;

import java.io.IOException;

import com.ee.domain.mongo.user.AbstractMongoUser;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class MongoUserSerializer extends JsonSerializer<AbstractMongoUser> implements MongoUserJSONContants {

	@Override
	public void serialize(AbstractMongoUser value, JsonGenerator gen,
			SerializerProvider serializers) throws IOException,
			JsonProcessingException {
		assert value != null;
		gen.writeStartObject();
		gen.writeStringField(JSON_ID, value.getId());
		gen.writeStringField(JSON_USER_USERNAME, value.getUsername());
		//We Ignore Password When Serialize Object To String
		//gen.writeStringField(fieldName, value.getPassword());
		gen.writeStringField(JSON_USER_EMAIL, value.getEmail());
		gen.writeObjectField(JSON_USER_PERSON, value.getPerson());
		gen.writeEndObject();
	}

}
