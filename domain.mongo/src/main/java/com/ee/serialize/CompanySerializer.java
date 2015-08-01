package com.ee.serialize;

import java.io.IOException;

import com.ee.domain.company.Company;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CompanySerializer extends JsonSerializer<Company> implements
		CompanyJSONConstants {

	@Override
	public void serialize(Company value, JsonGenerator gen,
			SerializerProvider serializers) throws IOException,
			JsonProcessingException {
		assert value != null;

		gen.writeStartObject();
		gen.writeStringField(JSON_ID, value.getId());
		gen.writeStringField(JSON_FULLNAME_FIELDNAME, value.getFullName());
		gen.writeStringField(JSON_SHORTNAME_FIELDNAME, value.getShortName());

		if (value.getRequisits() != null)
			gen.writeObjectField(JSON_REQUISITS_FIELDNAME, value.getRequisits());

		if (value.getContacts() != null)
			gen.writeObjectField(JSON_CONTACTS_FIELDNAME, value.getContacts());
		
		gen.writeEndObject();
	}

}
