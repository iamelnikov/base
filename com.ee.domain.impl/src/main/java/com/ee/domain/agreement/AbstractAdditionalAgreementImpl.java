package com.ee.domain.agreement;

import com.ee.domain.agreement.AdditionalAgreement;
import com.ee.domain.agreement.Agreement;
import com.ee.domain.agreement.AgreementConsumerInfo;
import com.ee.domain.agreement.AgreementProducerInfo;

public abstract class AbstractAdditionalAgreementImpl<T> extends AbstractAgreementImpl<T> implements
		AdditionalAgreement<T> {

	protected Agreement<T> agreement;

	public AbstractAdditionalAgreementImpl(String id,
			AgreementProducerInfo producerInfo,
			AgreementConsumerInfo consumerInfo, Agreement<T> agreement) {
		super(id, producerInfo, consumerInfo, null, null, null);
		this.agreement = agreement;
	}

	@Override
	public Agreement<T> getAgreement() {
		return agreement;
	}


}
