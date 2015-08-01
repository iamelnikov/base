package com.ee.domain.mongo.company;

import com.ee.domain.company.AbstractCompany;
import com.ee.domain.company.Company;
import com.ee.domain.company.CompanyContacts;
import com.ee.domain.company.CompanyRequisits;

public abstract class AbstractMongoCompany extends AbstractCompany implements
		Company {

	public AbstractMongoCompany(String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(fullName, shortName, requisits, contacts);
	}

	public AbstractMongoCompany(String id, String fullName, String shortName,
			CompanyRequisits requisits, CompanyContacts contacts) {
		super(id, fullName, shortName, requisits, contacts);
	}

	public AbstractMongoCompany(String id, String fullName, String shortName) {
		super(id, fullName, shortName);
	}

	public AbstractMongoCompany(String fullName, String shortName) {
		super(fullName, shortName);
	}
}
