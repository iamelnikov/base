package com.ee.domain.company;

import java.util.Set;

import com.ee.domain.contacts.Address;
import com.ee.domain.contacts.Phone;
import com.ee.domain.contacts.WWWAddress;

/**
 * 
 * @author ilya Интерфейс "Контакты организации"
 */
public interface CompanyContacts {
	/**
	 * @return {@link Set} из {@link Phone} организации Возвращает множество
	 *         телефонов организации
	 */
	public Set<Phone> getPhoneContactSet();

	/**
	 * @return {@link Set} из {@link WWWAddress} организации Возвращает
	 *         множество интернет-адресов компании
	 */
	public Set<WWWAddress> getWWWAddressSet();

	/**
	 * @return {@link Set} из {@link Address} организации Возвращает множество
	 *         адресов компании
	 */
	public Set<Address> getAddress();
}
