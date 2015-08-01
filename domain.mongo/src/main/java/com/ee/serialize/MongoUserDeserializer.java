package com.ee.serialize;

import java.io.IOException;

import com.ee.domain.mongo.user.DefaultMongoUser;
import com.ee.domain.person.Person;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MongoUserDeserializer extends JsonDeserializer<DefaultMongoUser>
		implements MongoUserJSONContants {

	private static final ObjectMapper mapper = new ObjectMapper();

	@Override
	public DefaultMongoUser deserialize(JsonParser p,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode node = p.getCodec().readTree(p);
		final String id = node.get(JSON_ID).asText();
		final String userName = node.get(JSON_USER_USERNAME).asText();
		final String password = node.get(JSON_USER_PASSWORD).asText();
		final String email = node.get(JSON_USER_EMAIL).asText();

		assert !node.get(JSON_USER_PERSON).isNull();
		final Person person = mapper.reader(Person.class).readValue(
				node.get(JSON_USER_PERSON));

		final DefaultMongoUser user = new DefaultMongoUser(id, userName, email,
				password, person);

		return user;
	}
}
