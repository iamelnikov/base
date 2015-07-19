package com.ee.domain.company.structure.storage;

import com.ee.core.PersistentObject;
import com.ee.domain.product.Product;

public interface StorageItem<T extends Number> extends PersistentObject{
	
	public Product getProduct();
	public T getCount();
	public StorageItemLocation getItemLocation();
		
}
