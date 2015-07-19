package com.ee.domain.company.structure;

import com.ee.domain.product.Product;

public interface PointOfSalesItem<T extends Number> {

	public Product getProduct();
	public T getCount();
}
