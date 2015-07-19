package com.ee.domain.product;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.product.Product;
import com.ee.domain.product.ProductComposition;

public abstract class AbstractProductComposition<P extends Product, N> extends
		AbstractPersistentObject implements ProductComposition<P, N> {

	protected Map<P, N> compositionMap;

	public AbstractProductComposition() {
		super();
		this.compositionMap = new LinkedHashMap<P, N>();
	}

	public AbstractProductComposition(String id) {
		super(id);
		this.compositionMap = new LinkedHashMap<P, N>();
	}

	@Override
	public void addProduct(P product) {
		assert product != null;
		this.compositionMap.put(product, null);
	}

	@Override
	public void addProduct(P product, N count) {
		assert product != null;
		this.compositionMap.put(product, count);

	}

	@Override
	public void removeProduct(P product) {
		assert product != null;
		this.compositionMap.remove(product);
	}

	@Override
	public Map<P, N> getCompositionMap() {
		return Collections.unmodifiableMap(this.compositionMap);
	}

	@Override
	public Set<P> getCompositionList() {
		return this.compositionMap.keySet();
	}

	public Set<String> getCompositionProductNameList() {
		Set<String> set = new LinkedHashSet<String>();
		if (this.compositionMap != null
				&& !this.compositionMap.isEmpty()) {
			Set<String> existingProductNameSet = this.compositionMap
					.entrySet().stream().map(e -> e.getKey().getName())
					.collect(Collectors.toSet());
			set.addAll(existingProductNameSet);
		}

		return Collections.unmodifiableSet(set);
	};
}
