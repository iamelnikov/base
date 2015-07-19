package com.ee.domain.company;

import java.util.LinkedHashSet;
import java.util.Set;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.contacts.Address;
import com.ee.domain.contacts.EmailAddress;
import com.ee.domain.contacts.Phone;

public abstract class AbstractCompanyContacts extends AbstractPersistentObject implements CompanyContacts{

//	protected static final String ADDRESS_JSON_CONSTANT = "a";
//	protected static final String PHONE_JSON_CONSTANT = "p";
//	protected static final String EMAIL_JSON_CONSTANT = "e";
//	protected static final String WEBADDRESS_JSON_CONSTANT = "w";

//	@JsonProperty(ADDRESS_JSON_CONSTANT)
//	@Field(ADDRESS_JSON_CONSTANT)

//	@JsonProperty(PHONE_JSON_CONSTANT)
//	@Field(PHONE_JSON_CONSTANT)

//	@JsonProperty(EMAIL_JSON_CONSTANT)
//	@Field(EMAIL_JSON_CONSTANT)

//	@JsonProperty(WEBADDRESS_JSON_CONSTANT)
//	@Field(WEBADDRESS_JSON_CONSTANT)
//	@Indexed
	
	protected Set<Address> locationSet = new LinkedHashSet<Address>();
	protected Set<Phone> phoneSet = new LinkedHashSet<Phone>();
	protected Set<EmailAddress> emailSet = new LinkedHashSet<EmailAddress>();
	protected String webAddress;

	public AbstractCompanyContacts(String id) {
		super(id);
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	public Set<Address> getLocationSet() {
		if (this.locationSet == null)
			this.locationSet = new LinkedHashSet<Address>();

		return locationSet;
	}

	public Set<Phone> getPhoneSet() {
		if (this.phoneSet == null)
			this.phoneSet = new LinkedHashSet<Phone>();

		return phoneSet;
	}

	public Set<EmailAddress> getEmailSet() {
		if (this.emailSet == null)
			this.emailSet = new LinkedHashSet<EmailAddress>();

		return emailSet;
	}
}
