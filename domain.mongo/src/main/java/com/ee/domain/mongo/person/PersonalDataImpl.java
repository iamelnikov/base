package com.ee.domain.mongo.person;

import java.util.Date;

public abstract class PersonalDataImpl {
	protected String firstName;
	protected String lastName;
	protected String middleName;
	protected byte gender;
	protected Date birthDate;
	
	public PersonalDataImpl(){
		super();
	}
	
	public PersonalDataImpl(String firstName, String lastName, String middleName,
			byte gender, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.birthDate = birthDate;
	}
	
	public PersonalDataImpl(String firstName, String lastName, String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
	public PersonalDataImpl(String firstName, String lastName, String middleName,
			byte gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
	}
	
	public PersonalDataImpl(String firstName, String lastName, String middleName,
			Date birthDate) {
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

	public byte getGender() {
		return gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
