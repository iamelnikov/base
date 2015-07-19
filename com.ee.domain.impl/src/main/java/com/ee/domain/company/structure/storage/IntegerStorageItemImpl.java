package com.ee.domain.company.structure.storage;

import com.ee.domain.product.Product;

public class IntegerStorageItemImpl extends AbstractStorageItemImpl<Integer> implements IntegerStorageItem{

	public IntegerStorageItemImpl(String id, Product product,
			StorageItemLocation location, Integer count) {
		super(id, product, location, count);
	}

}
