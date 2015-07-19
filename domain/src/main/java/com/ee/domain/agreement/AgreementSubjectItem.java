package com.ee.domain.agreement;

import com.ee.core.PersistentObject;
import com.ee.domain.product.Product;

public interface AgreementSubjectItem<T extends Number> extends PersistentObject{

	public Product getProduct();
	public T getCount();
}
