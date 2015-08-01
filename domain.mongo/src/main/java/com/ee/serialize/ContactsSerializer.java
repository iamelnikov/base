package com.ee.serialize;

import java.io.IOException;
import java.util.Collection;

import com.ee.domain.company.CompanyContacts;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ContactsSerializer extends JsonSerializer<CompanyContacts>
		implements CompanyContactsConstants {

	@Override
	public void serialize(CompanyContacts value, JsonGenerator gen,
			SerializerProvider serializers) throws IOException,
			JsonProcessingException {
		gen.writeStartObject();
		writeCollection(gen, JSON_PHONE_CONTACT_LIST_FIELDNAME, value.getPhoneContactSet());
		writeCollection(gen, JSON_WWWADDRESS_CONTACT_LIST_FIELDNAME, value.getWWWAddressSet());
		writeCollection(gen, JSON_ADDRESS_CONTACT_LIST_FIELDNAME, value.getAddress());
	}

	private void writeCollection(JsonGenerator gen, String fieldName, Collection<?> list) throws IOException {
		if (list!=null && !list.isEmpty()) {
			gen.writeArrayFieldStart(fieldName);
			for(Object o: list) {
				gen.writeObject(o);
			}
			gen.writeEndArray();
		};
	}
}
