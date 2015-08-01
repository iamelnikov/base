package com.ee.serialize;

import java.io.IOException;

import com.ee.domain.company.Company;
import com.ee.domain.company.CompanyContacts;
import com.ee.domain.company.CompanyRequisits;
import com.ee.domain.company.DefaultCompanyImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompanyDeserializer extends JsonDeserializer<Company> implements
		CompanyJSONConstants {

	private static final ObjectMapper mapper = new ObjectMapper();

	@Override
	public Company deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		final JsonNode node = p.getCodec().readTree(p);
		String cid = node.get(JSON_ID).asText();
		String fullName = node.get(JSON_FULLNAME_FIELDNAME).asText();
		String shortName = node.get(JSON_SHORTNAME_FIELDNAME).asText();
		CompanyRequisits companyRequisits = null;
		if (!node.get(JSON_REQUISITS_FIELDNAME).isNull()
				&& node.get(JSON_REQUISITS_FIELDNAME).isObject()) {
			companyRequisits = mapper.reader(CompanyRequisits.class).readValue(
					node.get(JSON_REQUISITS_FIELDNAME));
		}
		CompanyContacts companyContacts = null;
		if (!node.get(JSON_CONTACTS_FIELDNAME).isNull()
				&& node.get(JSON_CONTACTS_FIELDNAME).isObject()) {
			companyContacts = mapper.reader(CompanyContacts.class).readValue(
					node.get(JSON_CONTACTS_FIELDNAME));
		}
		DefaultCompanyImpl company = new DefaultCompanyImpl(fullName, shortName);
		if (cid != null && cid.trim().length() > 0)
			company.setId(cid);

		if (companyRequisits != null)
			company.setRequisits(companyRequisits);

		if (companyContacts != null)
			company.setContacts(companyContacts);

		return company;
	}
}
