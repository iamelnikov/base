package com.ee.serialize;

import static com.ee.domain.company.CompanyRequisits.JSON_INN_FIELDNAME;
import static com.ee.domain.company.CompanyRequisits.JSON_KPP_FIELDNAME;
import static com.ee.domain.company.CompanyRequisits.JSON_OGRN_FIELDNAME;
import static com.ee.domain.company.CompanyRequisits.JSON_OKATO_FIELDNAME;
import static com.ee.domain.company.CompanyRequisits.JSON_OKOPF_FIELDNAME;
import static com.ee.domain.company.CompanyRequisits.JSON_OKVED_FIELDNAME;
import static com.ee.domain.company.CompanyRequisits.JSON_OKPO_FIELDNAME;

import java.io.IOException;

import com.ee.domain.company.CompanyRequisits;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CompanyRequisitsSerializer extends
		JsonSerializer<CompanyRequisits> implements JSONContants {

	@Override
	public void serialize(CompanyRequisits value, JsonGenerator gen,
			SerializerProvider serializers) throws IOException,
			JsonProcessingException {
		assert value != null;
		gen.writeStartObject();
		gen.writeStringField(JSON_ID, value.getId());
		gen.writeStringField(JSON_INN_FIELDNAME, value.getInn());
		gen.writeStringField(JSON_KPP_FIELDNAME, value.getKpp());
		gen.writeStringField(JSON_OKPO_FIELDNAME, value.getOkpo());
		gen.writeStringField(JSON_OGRN_FIELDNAME, value.getOgrn());
		gen.writeStringField(JSON_OKATO_FIELDNAME, value.getOkato());
		gen.writeStringField(JSON_OKOPF_FIELDNAME, value.getOkopf());
		gen.writeStringField(JSON_OKVED_FIELDNAME, value.getOkved());
		gen.writeEndObject();
	}
}
