package com.ee.domain.company;


public class Consumer extends AbstractCompany {

	public Consumer(String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(fullName, shortName, requisits, contacts);
	}

	public Consumer(String id, String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(id, fullName, shortName, requisits, contacts);
	}

	public Consumer(String id, String fullName, String shortName) {
		super(id, fullName, shortName);
	}

	public Consumer(String fullName, String shortName) {
		super(fullName, shortName);
	}
}
