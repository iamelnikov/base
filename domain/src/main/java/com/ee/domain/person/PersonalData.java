package com.ee.domain.person;

import java.util.Date;

import com.ee.core.PersistentObject;

/**
 * Interface represents Personal Data of Human
 * <p>
 * </p>
 * 
 * @author Ilya A Melnikov
 * @since 18-07-2015
 * @version 1.0
 */
public interface PersonalData extends PersistentObject {

	/**
	 * Вовращает информацию об имени человека
	 * 
	 * @return Имя человека
	 */
	public String getFirstName();

	/**
	 * Возращает информацию о фамилии человека
	 * 
	 * @return Фамилия человека
	 */
	public String getLastName();

	public String getMiddleName();

	public String getFullName();

	public String getShortName();

	public Date getBirthDate();

	public int getGender();

	public String getBirthPlace();
}
