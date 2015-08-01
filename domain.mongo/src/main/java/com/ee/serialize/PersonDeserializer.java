package com.ee.serialize;

import java.io.IOException;
import java.util.Date;

import com.ee.domain.person.DefaultPerson;
import com.ee.domain.person.DefaultPersonalData;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class PersonDeserializer extends JsonDeserializer<DefaultPerson>
		implements MongoPersonJSONConstants {

	@Override
	public DefaultPerson deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		 JsonNode node = p.getCodec().readTree(p);
		 final String id = node.get(JSON_ID).asText();
		 final String pdid = node.get(PERSON_DATA_ID_FIELDNAME).asText();
		 final String lastName = node.get(PERSON_LASTNAME_FIELDNAME).asText();
		 final String firstName = node.get(PERSON_FIRSTNAME_FIELDNAME).asText();
		 final String middleName = node.get(PERSON_MIDDLENAME_FIELDNAME).asText();
		 final long birthDate = node.get(PERSON_BIRTHDATE_FIELDNAME).asLong();
		 final String birthPlace = node.get(PERSON_BIRTHPLACE_FIELDNAME).asText();
		 final int gender = node.get(PERSON_GENDER_FIELDNAME).asInt();
		 
		 DefaultPersonalData pd;
		 if (pdid!=null && pdid.trim().length()>0) 
			 pd = new DefaultPersonalData(pdid, firstName, lastName, middleName, gender, new Date(birthDate));
		  else 
			 pd = new DefaultPersonalData(firstName, lastName, middleName, gender, new Date(birthDate));

		 pd.setBirthPlace(birthPlace);
		 if (id!=null && id.trim().length()>0)
			 return new DefaultPerson(id, pd);
		 else
			 return new DefaultPerson(pd);
	}
}
