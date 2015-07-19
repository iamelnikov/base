package com.ee.domain.agreement;

import java.util.Date;

import com.ee.core.impl.AbstractPersistentObject;

//@Document(collection = "AGREEMENT")
public abstract class AbstractAgreement<T> extends AbstractPersistentObject implements
		Agreement<T> {

	static enum AgreementState {
		DRAFT(0), ACTIVE(1), CLOSED(1);

		private AgreementState(int code) {
			this.code = code;
		}

		private int code;
	}

//	private static final String PRD_JSON_PROPERTY = "prd";
//	private static final String PRODUCER_JSON_PROPERTY = "producer";
//
//	private static final String CNS_JSON_PROPERTY = "cns";
//	private static final String CONSUMER_JSON_PROPERTY = "consumer";
//
//	private static final String C_JSON_PROPERTY = "c";
//	private static final String CITY_JSON_PROPERTY = "city";
//
//	private static final String N_JSON_PROPERTY = "n";
//	private static final String NUMBER_JSON_PROPERTY = "number";
//	
//	private static final String SD_JSON_PROPERTY = "sd";
//	private static final String STARTDATE_JSON_PROPERTY = "startDate";
//	
//	private static final String EN_JSON_PROPERTY = "ed";
//	private static final String ENDDATE_JSON_PROPERTY = "endDate";
//	
//	private static final String SID_JSON_PROPERTY = "sid";
//	private static final String SIGNDATE_JSON_PROPERTY = "signDate";

//	@Field(CITY_JSON_PROPERTY)
//	@JsonProperty(C_JSON_PROPERTY)

//	@Field(NUMBER_JSON_PROPERTY)
//	@JsonProperty(N_JSON_PROPERTY)

//	@Field(PRD_JSON_PROPERTY)
//	@JsonProperty(PRODUCER_JSON_PROPERTY)

//	@Field(CNS_JSON_PROPERTY)
//	@JsonProperty(CONSUMER_JSON_PROPERTY)

//	@Field(SIGNDATE_JSON_PROPERTY)
//	@JsonProperty(SID_JSON_PROPERTY)
	
//	@Field(STARTDATE_JSON_PROPERTY)
//	@JsonProperty(SD_JSON_PROPERTY)
	
//	@Field(ENDDATE_JSON_PROPERTY)
//	@JsonProperty(EN_JSON_PROPERTY)
	
//	@DBRef
//	@Field("terms")
//	@JsonProperty("t")
	
//	@JsonIgnore
//	@Field
	
	
	protected String city;
	protected String number;
	protected AgreementProducerInfo producerInfo;
	protected AgreementConsumerInfo consumerInfo;
	protected Date signDate;
	protected Date startDate;
	protected Date endDate;
	protected AgreementTerms agreementTerms;
	protected AgreementState state;

	public AbstractAgreement(String id, AgreementProducerInfo producerInfo,
			AgreementConsumerInfo consumerInfo, Date signDate, Date startDate,
			Date endDate) {
		super(id);
		this.producerInfo = producerInfo;
		this.consumerInfo = consumerInfo;
		this.signDate = signDate;
		this.endDate = endDate;
		this.startDate = startDate;
	}

	@Override
	public String getCity() {
		return this.city;
	}

	@Override
	public String getNumber() {
		return this.number;
	}

	@Override
	public AgreementProducerInfo getProducerInfo() {
		return this.producerInfo;
	}

	@Override
	public AgreementConsumerInfo getConsumerInfo() {
		return this.consumerInfo;
	}

	@Override
	public int getState() {
		return this.state.code;
	}

	@Override
	public void activate() {
		this.state = AgreementState.ACTIVE;
	}

	@Override
	public void close() {
		this.state = AgreementState.CLOSED;
	}

	@Override
	public Date getSignDate() {
		return this.signDate;
	}

	@Override
	public Date getStartDate() {
		return this.startDate;
	}

	@Override
	public Date getEndDate() {
		return this.endDate;
	}
	
	@Override
	public double getSum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCurrency() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AgreementTerms getTerms() {
		return agreementTerms;
	}
	
	@Override
	public AgreementSubject getSubject() {
		// TODO Auto-generated method stub
		return null;
	}
}
