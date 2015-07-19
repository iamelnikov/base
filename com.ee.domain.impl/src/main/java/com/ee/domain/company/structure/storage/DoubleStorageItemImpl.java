package com.ee.domain.company.structure.storage;

import com.ee.domain.product.Product;

public class DoubleStorageItemImpl extends AbstractStorageItemImpl<Double> implements DoubleStorageItem{

	public DoubleStorageItemImpl(Product product, StorageItemLocation location, Double count) {
		super(product, location, count);
	}
}
