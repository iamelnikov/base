package com.ee.domain.product;

import com.ee.domain.product.Product;

public class ProductCompositionNoCount<T extends Product> extends
		AbstractProductComposition<Product, Double> {
	
	public ProductCompositionNoCount(String id) {
		super(id);
	}

}
