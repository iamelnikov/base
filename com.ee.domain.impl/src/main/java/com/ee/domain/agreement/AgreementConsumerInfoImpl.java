package com.ee.domain.agreement;

import com.ee.domain.agreement.AgreementConsumerInfo;
import com.ee.domain.company.Consumer;
import com.ee.domain.person.Person;

public class AgreementConsumerInfoImpl implements AgreementConsumerInfo{

	protected Consumer consumer;
	protected Person signer;
	
	public AgreementConsumerInfoImpl(Consumer consumer, Person signer) {
		super();
		this.consumer = consumer;
		this.signer = signer;
	}
	
	@Override
	public Consumer getConsumer() {
		return this.consumer;
	}

	@Override
	public Person getConsumerSigner() {
		return this.signer;
	}

}
