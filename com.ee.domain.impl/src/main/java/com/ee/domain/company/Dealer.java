package com.ee.domain.company;


public class Dealer extends AbstractCompany {

	public Dealer(String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(fullName, shortName, requisits, contacts);
	}

	public Dealer(String id, String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(id, fullName, shortName, requisits, contacts);
	}

	public Dealer(String id, String fullName, String shortName) {
		super(id, fullName, shortName);
	}

	public Dealer(String fullName, String shortName) {
		super(fullName, shortName);
	}

}
