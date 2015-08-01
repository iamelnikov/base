package com.ee.domain.powerofattorney;

import java.util.Date;

import com.ee.domain.document.AbstractDocumentImpl;
import com.ee.domain.person.PersonExtended;

/**
 * 
 * @author ilya
 *	Реализация интерфейса "доверенность"
 */
public abstract class AbstractPowerOfAttorney<T> extends AbstractDocumentImpl<T> implements
		PowerOfAttorney<T> {

//	private static final String N_JSON_CONSTANT = "n";
//	private static final String NUMBER_JSON_CONSTANT = "number";
//	
//	private static final String IP_JSON_CONSTANT = "ip";
//	private static final String ISSUEPERSON_JSON_CONSTANT = "issuePerson";
//	
//	private static final String ID_JSON_CONSTANT = "id";
//	private static final String ISSUEDATE_JSON_CONSTANT = "issueDate";
//	
//	private static final String AP_JSON_CONSTANT = "ap";
//	private static final String AUTHORIZEDPERSON_JSON_CONSTANT = "authorizedPerson";
//	
//	private static final String ED_JSON_CONSTANT = "ed";
//	private static final String ENDDATE_JSON_CONSTANT = "endDate";
//	
//	private static final String S_JSON_CONSTANT = "s";
//	private static final String SUBJECT_JSON_CONSTANT = "subject";
	
	/**
	 * Номер доверенности
	 */
//	@JsonProperty(N_JSON_CONSTANT)
//	@Field(NUMBER_JSON_CONSTANT)
	protected String number;
	
	/**
	 * Лицо, выдавшее доверенность
	 */
//	@JsonProperty(IP_JSON_CONSTANT)
//	@Field(ISSUEPERSON_JSON_CONSTANT)
	protected PersonExtended issuePerson;

	/**
	 * Дата выдачи доверенности
	 */
//	@JsonProperty(ID_JSON_CONSTANT)
//	@Field(ISSUEDATE_JSON_CONSTANT)
	protected Date issueDate;
	
	/**
	 * Доверенное лицо
	 */
//	@JsonProperty(AP_JSON_CONSTANT)
//	@Field(AUTHORIZEDPERSON_JSON_CONSTANT)
	protected PersonExtended authorizedPerson;
	
	/**
	 * Дата окончания действия доверенности
	 */
//	@JsonProperty(ED_JSON_CONSTANT)
//	@Field(ENDDATE_JSON_CONSTANT)
	protected Date endDate;
	
	/**
	 * Предмет доверенности
	 */
//	@JsonProperty(S_JSON_CONSTANT)
//	@Field(SUBJECT_JSON_CONSTANT)
	protected String subject;

	public AbstractPowerOfAttorney(String id, String number, PersonExtended issuePerson,
			Date issueDate, PersonExtended authorizedPerson, Date endDate, String subject) {
		super(id);
		this.number = number;
		this.issuePerson = issuePerson;
		this.issueDate = issueDate;
		this.authorizedPerson = authorizedPerson;
		this.endDate = endDate;
		this.subject = subject;
	}

	@Override
	public String getNumber() {
		return this.number;
	}

	@Override
	public PersonExtended getIssuePerson() {
		return issuePerson;
	}

	@Override
	public Date getIssueDate() {
		return issueDate;
	}

	@Override
	public Date getEndDate() {
		return endDate;
	}

	@Override
	public PersonExtended getAuthorizedPerson() {
		return authorizedPerson;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setIssuePerson(PersonExtended issuePerson) {
		this.issuePerson = issuePerson;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public void setAuthorizedPerson(PersonExtended authorizedPerson) {
		this.authorizedPerson = authorizedPerson;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
