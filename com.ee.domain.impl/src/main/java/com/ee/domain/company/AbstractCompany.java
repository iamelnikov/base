package com.ee.domain.company;

import java.util.List;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.company.RusEGRULRequisits.RusEGRULRequisitesEnum;
import com.ee.domain.contacts.Address;
import com.ee.domain.contacts.Phone;

//@Document(collection = "COMPANY")
public abstract class AbstractCompany extends AbstractPersistentObject implements Company {

//	private static final String FN_JSON_CONSTЕANT = "fn";
//	private static final String FULL_NAME_JSON_CONSTANT = "fullName";
//	
//	private static final String SN_JSON_CONSTANT = "sn";
//	private static final String SHORT_NAME_JSON_CONSTANT = "shortName";
//	
//	private static final String RQS_JSON_CONSTANT = "rqs";
//	private static final String REQUISITS_JSON_CONSTANT = "requisits";
//	
//	private static final String CLB_JSON_CONSTANT = "clb";
//	private static final String COLLABORATION_JSON_CONSTANT = "collaboration";
//	
//	private static final String SL_JSON_CONSTANT = "sl";
//	private static final String SMALL_LABEL_JSON_CONSTANT = "smallLabel";
//	
//	private static final String BL_JSON_CONSTANT = "bl";
//	private static final String BIGLABEL_JSON_CONSTANT = "bigLabel";
	
//	@JsonProperty(FN_JSON_CONSTANT)
//	@Field(FULL_NAME_JSON_CONSTANT)
//	@TextIndexed
	protected String fullName;
	protected String shortName;
	protected CompanyRequisits requisits;
	protected CompanyContacts contacts;
//	protected GridFSDBFile smallLabel;
//	protected GridFSDBFile bigLabel;
	
//	@JsonProperty(SN_JSON_CONSTANT)
//	@Field(SHORT_NAME_JSON_CONSTANT)
//	@TextIndexed
	
//	@JsonProperty(RQS_JSON_CONSTANT)
//	@Field(REQUISITS_JSON_CONSTANT)
//	@DBRef
	
//	@JsonProperty(CLB_JSON_CONSTANT)
//	@Field(COLLABORATION_JSON_CONSTANT)
//	@DBRef
	
//	@JsonProperty(SL_JSON_CONSTANT)
//	@Field(SMALL_LABEL_JSON_CONSTANT)
	
//	@JsonProperty(BL_JSON_CONSTANT)
//	@Field(BIGLABEL_JSON_CONSTANT)
	
	
	public AbstractCompany() {
		super();
	}
	
//	@PersistenceConstructor
	public AbstractCompany(String id, String friendlyName, String fullName, String shortName,
			Address legalAddress, Address actualAddress,
			List<Phone> phoneList, String website, int industry) {
		super(id);
		this.fullName = fullName;
		this.shortName = shortName;
	}
	
	public String serialize(String[] properties, RusEGRULRequisitesEnum[] requisits){
		//TODO
		return null;
	};
	

	@Override
	public String getFullName() {
		return fullName;
	}

	@Override
	public String getShortName() {
		return shortName;
	}

	@Override
	public CompanyRequisits getRequisits() {
		return requisits;
	}

	@Override
	public CompanyContacts getContacts() {
		return contacts;
	}
}
