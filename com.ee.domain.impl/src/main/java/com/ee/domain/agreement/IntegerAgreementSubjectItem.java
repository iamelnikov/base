package com.ee.domain.agreement;

import com.ee.domain.product.Product;

public class IntegerAgreementSubjectItem extends
		AbstractAgreementSubjectItem<Integer> {

	public IntegerAgreementSubjectItem(Product product, Integer cnt) {
		super(product, cnt);
	}
	
	public IntegerAgreementSubjectItem(String id, Product product, Integer cnt) {
		super(id, product, cnt);
	}
}
