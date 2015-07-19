package com.ee.domain.product;

import java.util.Map;
import java.util.Set;

public interface ProductComposition<P, N> {

	public void addProduct(P product);
	public void addProduct(P product, N count);
	public void removeProduct(P product);
	public Map<P, N> getCompositionMap();
	public Set<P> getCompositionList();
	public Set<String> getCompositionProductNameList();
}
