package com.ee.domain.mongo.agreement;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.ee.domain.agreement.AgreementConsumerInfo;
import com.ee.domain.agreement.AgreementProducerInfo;
import com.ee.domain.agreement.AgreementSubject;
import com.ee.domain.agreement.AgreementTerms;
import com.ee.domain.agreement.PurchaseAgreement;
import com.ee.domain.agreement.PurchaseItem;
import com.mongodb.gridfs.GridFSDBFile;

public class PurchaseAgreementImpl extends AbstractMongoAgreement implements
		PurchaseAgreement<GridFSDBFile> {

	@DBRef
	protected Set<PurchaseItem<?>> items;
	protected int type;

	public PurchaseAgreementImpl(String id, AgreementProducerInfo producerInfo,
			AgreementConsumerInfo consumerInfo) {
		super(id, producerInfo, consumerInfo, null, null, null);
		this.items = new LinkedHashSet<PurchaseItem<?>>();
	}

	public PurchaseAgreementImpl(String id, AgreementProducerInfo producerInfo,
			AgreementConsumerInfo consumerInfo, Set<PurchaseItem<?>> items) {
		super(id, producerInfo, consumerInfo, null, null, null);
		this.items = new LinkedHashSet<PurchaseItem<?>>(items);
	}

	@Override
	public AgreementTerms getTerms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AgreementSubject getSubject() {
		// TODO Auto-generated method stub
		return null;
	}

	// TODO for ex.: 1 = single purchase, 2 = regular purchase.
	public int getPurchaseType() {
		return type;
	}

	public String[] getDocuments() {
		return null;
	}

	public Set<PurchaseItem<?>> getPurchaseItems() {
		return Collections.unmodifiableSet(items);
	}
}