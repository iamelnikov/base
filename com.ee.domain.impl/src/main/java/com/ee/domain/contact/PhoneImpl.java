package com.ee.domain.contact;

import com.ee.domain.contacts.Phone;
import com.ee.domain.person.Person;

//@Document(collection = "PHONE")
public class PhoneImpl extends AbstractContact implements Phone{
	
//	protected static final String T_JSON_PROPERTY = "t";
//	protected static final String TYPE_JSON_PROPERTY = "type";
//	
//	protected static final String P_JSON_PROPERTY = "p";
//	protected static final String PHONE_JSON_PROPERTY = "phone";
	
//	@JsonProperty(T_JSON_PROPERTY)
//	@Field(TYPE_JSON_PROPERTY)
	
	
//	@JsonProperty(P_JSON_PROPERTY)
//	@Field(PHONE_JSON_PROPERTY)
	
	private String number;
	private String description;
	
	public PhoneImpl(String type, String number, Person person) {
		super(type, person);
		this.number = number;
	}
	
	public PhoneImpl(String id, String type, String number, Person person) {
		super(id, type, person);
		this.number = number;
	}
	
	public PhoneImpl(String type, String number, String contactInfo) {
		super(type, contactInfo);
		this.number = number;
	}
	
	public PhoneImpl(String id, String type, String number, String contactInfo) {
		super(id, type, contactInfo);
		this.number = number;
	}


	@Override
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}