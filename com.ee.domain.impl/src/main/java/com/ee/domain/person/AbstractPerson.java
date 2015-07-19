package com.ee.domain.person;

import java.util.Date;

import com.ee.domain.person.Person;
import com.ee.domain.person.PersonalData;

public abstract class AbstractPerson<T extends PersonalData> implements
		Person {

	protected String lastName;
	protected String firstName;
	protected String middleName;
	protected Date birthDate;
	protected int gender;
	protected String birthPlace;
	protected T personalData;

	public AbstractPerson(T personalData) {
		this.personalData = personalData;
	}

	public T getPersonalData() {
		return this.personalData;
	}

	public void setPersonData(T personalData) {
		this.personalData = personalData;
	}


	public String getBirthPlace(){
		return birthPlace;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public int getGender() {
		return gender;
	};
}
