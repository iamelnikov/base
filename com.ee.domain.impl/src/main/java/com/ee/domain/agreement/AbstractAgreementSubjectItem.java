package com.ee.domain.agreement;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.product.Product;

public abstract class AbstractAgreementSubjectItem<T extends Number> extends
		AbstractPersistentObject implements AgreementSubjectItem<T> {

	protected Product product;
	protected T count;

	public AbstractAgreementSubjectItem(Product product, T count) {
		super();
		this.product = product;
		this.count = count;
	}

	public AbstractAgreementSubjectItem(String id, Product product, T count) {
		super();
		this.product = product;
		this.count = count;
	}

	public Product getProduct() {
		return product;
	}

	public T getCount() {
		return count;
	}
}
