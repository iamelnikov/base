package com.ee.domain.agreement;


import com.ee.domain.company.Consumer;
import com.ee.domain.person.Person;


public interface AgreementConsumerInfo {
	
	public Consumer getConsumer();
	public Person getConsumerSigner();

}
