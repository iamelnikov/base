package com.ee.domain.house;

import java.util.List;

import com.ee.domain.contacts.Address;
import com.ee.domain.contacts.Phone;
import com.ee.domain.person.Person;

public interface House {
	public List<Person> getPerson();
	public Address getAddress();
	public Phone getPhone();
}
