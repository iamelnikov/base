package com.ee.domain.agreement;

import com.ee.domain.product.Product;

public class DoubleAgreementSubjectItem extends AbstractAgreementSubjectItem<Double> {

	public DoubleAgreementSubjectItem(Product product, Double count) {
		super(product, count);
	}
	
	public DoubleAgreementSubjectItem(String id, Product product, Double count) {
		super(id, product, count);
	}

}
