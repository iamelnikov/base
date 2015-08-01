package com.ee.domain.contact;

import com.ee.domain.contacts.EmailAddress;
import com.ee.domain.person.PersonExtended;

//@Document(collection = "EMAIL")
public class EmailAddressImpl extends AbstractContact implements EmailAddress {

	// protected static final String E_JSON_PROPERTY = "e";
	// protected static final String EMAIL_JSON_PROPERTY = "email";
	//
	// protected static final String P_JSON_PROPERTY = "p";
	// protected static final String PERSON_JSON_PROPERTY = "person";
	//
	// protected static final String D_JSON_PROPERTY = "d";
	// protected static final String DESCRIPTION_JSON_PROPERTY = "description";

	// @JsonProperty(E_JSON_PROPERTY)
	// @Field(EMAIL_JSON_PROPERTY)
	// @Indexed

	// @JsonProperty(P_JSON_PROPERTY)
	// @Field(PERSON_JSON_PROPERTY)
	// @Indexed

	// @JsonProperty(D_JSON_PROPERTY)
	// @Field(DESCRIPTION_JSON_PROPERTY)

	private String emailAddress;
	private String description;

	public EmailAddressImpl(String type, String emailAddress, PersonExtended person) {
		super(type, person);
		this.emailAddress = emailAddress;
	}
	
	public EmailAddressImpl(String id, String type, String emailAddress, PersonExtended person) {
		super(id, type, person);
		this.emailAddress = emailAddress;
	}
	
	public EmailAddressImpl(String id, String type, String emailAddress, String contactInfo) {
		super(id, type, contactInfo);
		this.emailAddress = emailAddress;
	}
	
	public EmailAddressImpl(String type, String emailAddress, String contactInfo) {
		super(type, contactInfo);
		this.emailAddress = emailAddress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
