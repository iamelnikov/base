package com.ee.domain.company.structure;

import java.util.Set;

import com.ee.domain.company.structure.storage.Storage;
import com.ee.domain.product.Product;

public interface PointOfSales extends Branch {

	public Storage<?> getStorage();
	public void exhibitItems(Set<PointOfSalesItem<?>> items);
	public void saleItems(Product product, Integer count);
	public void saleItems(Product product, Double count);
	
}

