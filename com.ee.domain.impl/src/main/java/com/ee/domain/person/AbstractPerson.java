package com.ee.domain.person;

import java.util.List;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.core.impl.CollectionTools;
import com.ee.domain.contacts.Contact;

public abstract class AbstractPerson extends AbstractPersistentObject implements
		Person {

	protected PersonalData personalData;
	protected List<Contact> contactList;

	public AbstractPerson() {
		super();
	}

	public AbstractPerson(String id) {
		super(id);
	}

	public AbstractPerson(PersonalData personalData) {
		super();
		this.personalData = personalData;
	}

	public AbstractPerson(String id, PersonalData personalData) {
		super(id);
		this.personalData = personalData;
	}

	@Override
	public PersonalData getPersonalData() {
		return personalData;
	}

	@Override
	public List<Contact> getContacts() {
		return contactList;
	}

	public void addContact(Contact contact) {
		assert contact != null;
		CollectionTools.initListAsArrayListIfNull(contactList);
		assert contactList != null;
		contactList.add(contact);
	}
	
	public void removeContact(Contact contact) {
		assert contact != null;
		if (contactList!=null)
			contactList.remove(contact);
	}

}
