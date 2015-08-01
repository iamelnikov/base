package com.ee.domain.agreement;

import com.ee.domain.agreement.AgreementConsumerInfo;
import com.ee.domain.company.Consumer;
import com.ee.domain.person.PersonExtended;

public class AgreementConsumerInfoImpl implements AgreementConsumerInfo{

	protected Consumer consumer;
	protected PersonExtended signer;
	
	public AgreementConsumerInfoImpl(Consumer consumer, PersonExtended signer) {
		super();
		this.consumer = consumer;
		this.signer = signer;
	}
	
	@Override
	public Consumer getConsumer() {
		return this.consumer;
	}

	@Override
	public PersonExtended getConsumerSigner() {
		return this.signer;
	}

}
