package com.ee.domain.product;

import java.util.LinkedList;
import java.util.List;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.company.Producer;
import com.ee.domain.product.ProductCatalog;
import com.ee.domain.product.ProductCatalogItem;

public class ProductCatalogImpl extends AbstractPersistentObject implements ProductCatalog{

	private Producer producer;
	private List<ProductCatalogItem> items;

	public ProductCatalogImpl(Producer producer, List<ProductCatalogItem> items) {
		this.producer = producer;
		this.items = items;
	}

	public ProductCatalogImpl(Producer producer) {
		this.producer = producer;
		this.items = new LinkedList<ProductCatalogItem>();
	}

	public Producer getProducer() {
		return this.producer;
	}

	public List<ProductCatalogItem> getProductCatalogItems() {
		if (this.items == null)
			this.items = new LinkedList<ProductCatalogItem>();
		return this.items;
	}

	public void addProductCatalogItem(ProductCatalogItem item) {
		this.getProductCatalogItems().add(item);
	}

}
