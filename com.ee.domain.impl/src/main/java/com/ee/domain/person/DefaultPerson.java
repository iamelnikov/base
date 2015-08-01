package com.ee.domain.person;


public class DefaultPerson extends AbstractPerson {

	public DefaultPerson() {
		super();
	}

	public DefaultPerson(PersonalData personalData) {
		super(personalData);
	}

	public DefaultPerson(String id, PersonalData personalData) {
		super(id, personalData);
	}

	public DefaultPerson(String id) {
		super(id);
	}

}
