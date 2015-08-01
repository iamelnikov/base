package com.ee.domain.person;

import java.util.List;

import com.ee.domain.contacts.Contact;

public interface Person {

	public PersonalData getPersonalData();
	public List<Contact> getContacts();
	
}
