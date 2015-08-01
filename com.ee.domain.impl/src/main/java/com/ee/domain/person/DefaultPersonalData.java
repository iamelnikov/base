package com.ee.domain.person;

import java.util.Date;

public class DefaultPersonalData extends AbstractPersonalData {

	public DefaultPersonalData() {
		super();
	}

	public DefaultPersonalData(String firstName, String lastName, String middleName,
			Date birthDate) {
		super(firstName, lastName, middleName, birthDate);
	}

	public DefaultPersonalData(String firstName, String lastName, String middleName,
			int gender, Date birthDate) {
		super(firstName, lastName, middleName, gender, birthDate);
	}

	public DefaultPersonalData(String id, String firstName, String lastName,
			String middleName, int gender, Date birthDate) {
		super(id, firstName, lastName, middleName, gender, birthDate);
	}

	public DefaultPersonalData(String firstName, String lastName, String middleName,
			int gender) {
		super(firstName, lastName, middleName, gender);
	}

	public DefaultPersonalData(String firstName, String lastName, String middleName) {
		super(firstName, lastName, middleName);
	}

}
