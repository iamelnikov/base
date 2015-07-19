package com.ee.domain.agreement;

import java.util.Date;

import com.ee.domain.agreement.Agreement;
import com.ee.domain.agreement.AgreementConsumerInfo;
import com.ee.domain.agreement.AgreementProducerInfo;
import com.ee.domain.agreement.AgreementSubject;
import com.ee.domain.agreement.AgreementTerms;
import com.ee.domain.document.AbstractDocumentImpl;

public abstract class AbstractAgreementImpl<T> extends AbstractDocumentImpl<T>
		implements Agreement<T> {

	static enum AgreementState {
		DRAFT(0), ACTIVE(1), CLOSED(1);

		private AgreementState(int code) {
			this.code = code;
		}

		private int code;
	}

	protected String city;

	protected String number;

	protected AgreementProducerInfo producerInfo;

	protected AgreementConsumerInfo consumerInfo;

	protected Date signDate;

	protected Date startDate;

	protected Date endDate;

	protected AgreementTerms agreementTerms;

	protected AgreementState state;

	public AbstractAgreementImpl(String id, AgreementProducerInfo producerInfo,
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
