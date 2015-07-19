package com.ee.domain.agreement;

import com.ee.domain.agreement.AgreementProducerInfo;
import com.ee.domain.company.Employee;
import com.ee.domain.company.Producer;

public class AgreementProducerInfoImpl implements AgreementProducerInfo {

	protected Producer producer;
	protected Employee person;
	
	public AgreementProducerInfoImpl(Producer producer, Employee person) {
		this.producer = producer;
		this.person = person;
	}
	
	@Override
	public Producer getProducer() {
		return producer;
	}

	@Override
	public Employee getPerson() {
		return person;
	}
}
