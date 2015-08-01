package com.ee.domain.person;

import java.util.Date;

import com.ee.core.impl.AbstractPersistentObject;

public abstract class AbstractPersonalData extends AbstractPersistentObject
		implements PersonalData {
	protected String firstName;
	protected String lastName;
	protected String middleName;
	protected int gender;
	protected Date birthDate;
	protected String birthPlace;

	public AbstractPersonalData() {
		super();
	}

	public AbstractPersonalData(String firstName, String lastName,
			String middleName, int gender, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public AbstractPersonalData(String id, String firstName, String lastName,
			String middleName, int gender, Date birthDate) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public AbstractPersonalData(String firstName, String lastName,
			String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	public AbstractPersonalData(String firstName, String lastName,
			String middleName, int gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
	}

	public AbstractPersonalData(String firstName, String lastName,
			String middleName, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.birthDate = birthDate;
	}

	public String getFullName() {
		StringBuffer sb = new StringBuffer();
		if (lastName != null)
			sb.append(lastName).append(" ");
		if (firstName != null)
			sb.append(lastName).append(" ");
		if (middleName != null)
			sb.append(middleName);

		return sb.toString();
	}

	public String getShortName() {
		StringBuffer sb = new StringBuffer();
		if (lastName != null)
			sb.append(lastName).append(" ");
		if (firstName != null)
			sb.append(lastName.charAt(0)).append(". ");
		if (middleName != null)
			sb.append(middleName.charAt(0)).append('.');

		return sb.toString();
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
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

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
