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
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class CompanyRequisitsDeserializer extends
		JsonDeserializer<CompanyRequisits> implements JSONContants {

	@Override
	public CompanyRequisits deserialize(JsonParser p,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode node = p.getCodec().readTree(p);
		String id = node.get(JSON_ID).asText();
		String inn = node.get(JSON_INN_FIELDNAME).asText();
		String kpp = node.get(JSON_KPP_FIELDNAME).asText();
		String okpo = node.get(JSON_OKPO_FIELDNAME).asText();
		String ogrn = node.get(JSON_OGRN_FIELDNAME).asText();
		String okato = node.get(JSON_OKATO_FIELDNAME).asText();
		String okopf = node.get(JSON_OKOPF_FIELDNAME).asText();
		String okved = node.get(JSON_OKVED_FIELDNAME).asText();
		CompanyRequisits requisits = new CompanyRequisits(inn, kpp, okpo, ogrn,
				okato, okopf, okved);
		if (id!=null && id.trim().length()>0) {
			requisits.setId(id);
		}
		
		return requisits;
	}

}
