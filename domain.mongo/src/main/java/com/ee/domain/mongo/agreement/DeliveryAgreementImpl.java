package com.ee.domain.mongo.agreement;

import com.ee.domain.agreement.AgreementConsumerInfo;
import com.ee.domain.agreement.AgreementProducerInfo;

public class DeliveryAgreementImpl extends AbstractMongoAgreement {

	public DeliveryAgreementImpl(String id, AgreementProducerInfo producerInfo, AgreementConsumerInfo consumerInfo) {
		super(id, producerInfo, consumerInfo, null, null,null);
	}

}
