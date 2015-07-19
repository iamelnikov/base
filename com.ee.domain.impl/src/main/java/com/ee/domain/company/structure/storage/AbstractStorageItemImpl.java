package com.ee.domain.company.structure.storage;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.company.structure.storage.StorageItem;
import com.ee.domain.company.structure.storage.StorageItemLocation;
import com.ee.domain.product.Product;

public abstract class AbstractStorageItemImpl<T extends Number> extends AbstractPersistentObject implements
		StorageItem<T> {

	protected Product product;
	protected StorageItemLocation location;
	protected T count;

	public AbstractStorageItemImpl(String id, Product product,
			StorageItemLocation location, T count) {
		super(id);
		this.product = product;
		this.location = location;
		this.count = count;
	}

	public AbstractStorageItemImpl(Product product, StorageItemLocation location, T count) {
		super();
		this.product = product;
		this.location = location;
		this.count = count;
	}

	@Override
	public Product getProduct() {
		return this.product;
	}

	@Override
	public StorageItemLocation getItemLocation() {
		return this.location;
	}
	
	public T getCount() {
		return count;
	}

	public void setCount(T count) {
		this.count = count;
	}
	

}
