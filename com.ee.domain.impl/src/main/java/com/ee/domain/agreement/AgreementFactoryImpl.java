package com.ee.domain.agreement;

import java.util.UUID;

import com.ee.domain.company.Consumer;
import com.ee.domain.company.Employee;
import com.ee.domain.company.Producer;
import com.ee.domain.product.Product;

public class AgreementFactoryImpl implements AgreementFactory {

	@Override
	public Agreement<?> createPurchaseAgreement(Producer producer, Employee producerResponsiblePerson, Consumer consumer, Employee consumerSigner, Product... product) {
		String uuid = UUID.randomUUID().toString();
		AgreementProducerInfo pi = new AgreementProducerInfoImpl(producer, producerResponsiblePerson);
//		AgreementConsumerInfo ci = new AgreementConsumerInfoImpl(consumer, consumerSigner);
//		Agreement<T> agreement = new PurchaseAgreementImpl(uuid, pi, ci);
//		return agreement;
		return null;
	}

	@Override
	public Agreement<?> createAdditionalAgreement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agreement<?> createDeliveryAgreement() {
		// TODO Auto-generated method stub
		return null;
	}

}
