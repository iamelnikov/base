package com.ee.domain.product;

import com.ee.core.PersistentObject;

public interface ProductCatalogItem extends PersistentObject {

	public Product getProduct();
	public Double getPrice();
	public int getCurrency();
}
