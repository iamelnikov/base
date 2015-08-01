package com.ee.domain.contact;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.contacts.Contact;
import com.ee.domain.person.PersonExtended;

public abstract class AbstractContact extends AbstractPersistentObject implements Contact{

	protected String type;
	protected String contactInfo;
	protected boolean basic = true;
	protected boolean active = true;
	protected boolean confirmed = true;
	
	public AbstractContact(String id, String type, PersonExtended person) {
		super(id);
		this.type = type;
		this.contactInfo = getContactInfo(person);
	}
	
	public AbstractContact(String id, String type, String contactInfo) {
		super(id);
		this.type = type;
		this.contactInfo = contactInfo;
	}
	
	public AbstractContact(String type, PersonExtended person) {
		super();
		this.type = type;
		this.contactInfo = getContactInfo(person);
	}
	
	public AbstractContact(String type, String contactInfo) {
		super();
		this.type = type;
		this.contactInfo = contactInfo;
	}
	
	protected String getContactInfo(PersonExtended person) {
		if (person == null || person.getPersonalData()== null)
			return null;
		else
			return person.getPersonalData().getFullName();
	}
	
	public void setBasic(boolean basic) {
		this.basic = basic;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public boolean isConfirmed() {
		return confirmed;
	}

	public boolean isBasic() {
		return basic;
	}

	public boolean isActive() {
		return active;
	}
	
	public String getContactInfo() {
		return contactInfo;
	}
	
	public String getType() {
		return this.type;
	}
	
}
