package com.ee.domain.house;

import java.util.List;

import com.ee.domain.contacts.Address;
import com.ee.domain.contacts.Phone;
import com.ee.domain.person.PersonExtended;

public interface House {
	public List<PersonExtended> getPerson();
	public Address getAddress();
	public Phone getPhone();
}
