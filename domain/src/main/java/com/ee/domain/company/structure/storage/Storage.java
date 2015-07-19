package com.ee.domain.company.structure.storage;

import java.util.Set;

import com.ee.domain.company.structure.Subdivision;
import com.ee.domain.product.Product;

public interface Storage<T extends StorageItem<?>> extends Subdivision {

	public Set<T> getItems();

	public void unloadGoods(Set<Product> products);
	
	public void unloadGoods(Set<Product> products, StorageItemLocation location);

	public void shipGoods(Set<Product> products);
	
	public void contains(Product product);
	
	public void contains(T storageItem);
}
