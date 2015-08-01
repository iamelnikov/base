package com.ee.serialize;

import java.io.IOException;

import com.ee.domain.person.Person;
import com.ee.domain.person.PersonalData;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class PersonSerialized extends JsonSerializer<Person> implements
		MongoPersonJSONConstants {

	@Override
	public void serialize(Person value, JsonGenerator gen,
			SerializerProvider serializers) throws IOException,
			JsonProcessingException {
		gen.writeStartObject();
		assert value != null && value.getPersonalData() != null;
		PersonalData pd = value.getPersonalData();
		gen.writeStringField(JSON_ID, pd.getId());
		gen.writeStringField(PERSON_DATA_ID_FIELDNAME, pd.getId());
		gen.writeStringField(PERSON_LASTNAME_FIELDNAME, pd.getLastName());
		gen.writeStringField(PERSON_FIRSTNAME_FIELDNAME, pd.getFirstName());
		gen.writeStringField(PERSON_MIDDLENAME_FIELDNAME, pd.getMiddleName());
		gen.writeStringField(PERSON_FULLNAME_FIELDNAME, pd.getFullName());
		gen.writeStringField(PERSON_SHORTNAME_FIELDNAME, pd.getShortName());
		
		if (pd.getBirthDate()!=null)
			gen.writeNumberField(PERSON_BIRTHDATE_FIELDNAME, pd.getBirthDate().getTime());
		
		gen.writeStringField(PERSON_BIRTHPLACE_FIELDNAME, pd.getBirthPlace());
		gen.writeNumberField(PERSON_GENDER_FIELDNAME, pd.getGender());
		
		gen.writeEndObject();
	}

}
