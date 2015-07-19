package com.ee.domain.person;

import java.util.Date;

import com.ee.core.impl.AbstractPersistentObject;

public abstract class AbstractPersonalDataImpl extends AbstractPersistentObject
		implements PersonalData {
	protected String firstName;
	protected String lastName;
	protected String middleName;
	protected String gender;
	protected Date birthDate;

	public AbstractPersonalDataImpl() {
		super();
	}

	public AbstractPersonalDataImpl(String firstName, String lastName,
			String middleName, String gender, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public AbstractPersonalDataImpl(String id, String firstName,
			String lastName, String middleName, String gender, Date birthDate) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public AbstractPersonalDataImpl(String firstName, String lastName,
			String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	public AbstractPersonalDataImpl(String firstName, String lastName,
			String middleName, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
	}

	public AbstractPersonalDataImpl(String firstName, String lastName,
			String middleName, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
