package com.ee.domain.company;


public class DefaultCompanyImpl extends AbstractCompany {

	public DefaultCompanyImpl(String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(fullName, shortName, requisits, contacts);
	}

	public DefaultCompanyImpl(String id, String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(id, fullName, shortName, requisits, contacts);
	}

	public DefaultCompanyImpl(String id, String fullName, String shortName) {
		super(id, fullName, shortName);
	}

	public DefaultCompanyImpl(String fullName, String shortName) {
		super(fullName, shortName);
	}



}
