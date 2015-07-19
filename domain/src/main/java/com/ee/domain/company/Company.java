package com.ee.domain.company;

import com.ee.core.PersistentObject;

public interface Company extends PersistentObject {

	/**
	 * @return String 
	 * Полное наименование организации
	 */
	public String getFullName();
	/**
	 * 
	 * @return String
	 * Название организации
	 */
	public String getShortName();
	/**
	 * 
	 * @return {@link CompanyRequisits}
	 * Возвращает объект реквизиты организации
	 */
	public CompanyRequisits getRequisits();
	
	/**
	 * @return {@link CompanyContacts}
	 * Возвращает объект с контактной информацией организации
	 */
	public CompanyContacts getContacts();
}
