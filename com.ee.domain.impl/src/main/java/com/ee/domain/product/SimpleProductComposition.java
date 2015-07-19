package com.ee.domain.product;

import java.util.Map;
import java.util.Set;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.product.ProductComposition;


public class SimpleProductComposition extends AbstractPersistentObject implements 
		ProductComposition<String, Double> {

	public SimpleProductComposition(String id) {
		super(id);
	}

	@Override
	public void addProduct(String product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProduct(String product, Double count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduct(String product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Double> getCompositionMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getCompositionList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getCompositionProductNameList() {
		// TODO Auto-generated method stub
		return null;
	}

}
