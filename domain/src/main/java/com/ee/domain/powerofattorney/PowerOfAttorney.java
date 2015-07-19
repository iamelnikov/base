package com.ee.domain.powerofattorney;

import java.util.Date;

import com.ee.core.PersistentObject;
import com.ee.domain.document.Document;
import com.ee.domain.person.Person;

/**
 * 
 * @author ilya
 *	Интерфейс "доверенность"
 */
public interface PowerOfAttorney<T> extends Document<T>,PersistentObject{
	
	/**
	 * @return String - номер доверенности
	 */
	public String getNumber();
	
	/**
	 * @return Инстанс класса Person - лицо, выдавшее доверенность
	 * @see Person 
	 */
	public Person getIssuePerson();
	/**
	 * @return Date - дата выдачи доверенности
	 */
	public Date getIssueDate();
	/**
	 * @return Date - дата окончания доверенности
	 */
	public Date getEndDate();
	/**
	 * @return Инстанс класса Person - доверенное лицо
	 * @see Person
	 */
	public Person getAuthorizedPerson();
	
	/**
	 * @return String - предмет доверенности
	 */
	public String getSubject();

}
