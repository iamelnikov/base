package com.ee.domain.house;

import com.ee.domain.product.Product;

public interface HousePurchaseProductListItem<T extends Number> {

	public Product getProduct();
	public T getCount();
}
