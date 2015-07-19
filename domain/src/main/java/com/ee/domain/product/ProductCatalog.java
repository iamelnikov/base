package com.ee.domain.product;

import java.util.List;

import com.ee.core.PersistentObject;
import com.ee.domain.company.Producer;

public interface ProductCatalog extends PersistentObject {

	public Producer getProducer();

	public List<ProductCatalogItem> getProductCatalogItems();
	
	public void addProductCatalogItem(ProductCatalogItem item);
}
