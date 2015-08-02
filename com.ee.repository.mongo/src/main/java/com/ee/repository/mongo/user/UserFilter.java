package com.ee.repository.mongo.user;

import java.util.Date;

import com.ee.domain.contacts.Address;

public interface UserFilter {

	public String getLastName();
	public String getFirstName();
	public String getMiddleName();
	public Date getBirthDateFrom();
	public Date getBirthDateTo();
	public int getGender();
	public Address getAddress();
	
}
