package com.ee.domain.agreement;

import com.ee.domain.company.Consumer;
import com.ee.domain.company.Employee;
import com.ee.domain.company.Producer;
import com.ee.domain.product.Product;

public interface AgreementFactory {

	public Agreement<?> createPurchaseAgreement(Producer producer, Employee producerResponsibleEmployee, Consumer consumer, Employee consumerSigner, Product... product);
	public Agreement<?> createAdditionalAgreement();
	public Agreement<?> createDeliveryAgreement();
}
