package com.ee.domain.company;


public class LogisticCompany extends AbstractCompany{

	public LogisticCompany(String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(fullName, shortName, requisits, contacts);
	}

	public LogisticCompany(String id, String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(id, fullName, shortName, requisits, contacts);
	}

	public LogisticCompany(String id, String fullName, String shortName) {
		super(id, fullName, shortName);
	}

	public LogisticCompany(String fullName, String shortName) {
		super(fullName, shortName);
	}



}
