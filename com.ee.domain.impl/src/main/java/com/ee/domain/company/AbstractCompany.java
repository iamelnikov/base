package com.ee.domain.company;

import com.ee.core.impl.AbstractPersistentObject;

public abstract class AbstractCompany extends AbstractPersistentObject
		implements Company {

	protected String fullName;
	protected String shortName;
	protected CompanyRequisits requisits;
	protected CompanyContacts contacts;

	public AbstractCompany(String fullName, String shortName) {
		super();
		this.fullName = fullName;
		this.shortName = shortName;
	}

	public AbstractCompany(String id, String fullName, String shortName) {
		super(id);
		this.fullName = fullName;
		this.shortName = shortName;
	}
	
	public AbstractCompany(String fullName, String shortName, CompanyRequisits requisits, CompanyContacts contacts) {
		super();
		this.fullName = fullName;
		this.shortName = shortName;
		this.contacts = contacts;
		this.requisits = requisits;
	}

	public AbstractCompany(String id, String fullName, String shortName, CompanyRequisits requisits, CompanyContacts contacts) {
		super(id);
		this.fullName = fullName;
		this.shortName = shortName;
		this.contacts = contacts;
		this.requisits = requisits;
	}

	@Override
	public String getFullName() {
		return fullName;
	}

	@Override
	public String getShortName() {
		return shortName;
	}

	@Override
	public CompanyRequisits getRequisits() {
		return requisits;
	}

	@Override
	public CompanyContacts getContacts() {
		return contacts;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setRequisits(CompanyRequisits requisits) {
		this.requisits = requisits;
	}

	public void setContacts(CompanyContacts contacts) {
		this.contacts = contacts;
	}
}
