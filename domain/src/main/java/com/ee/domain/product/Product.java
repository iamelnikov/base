package com.ee.domain.product;

import com.ee.core.PersistentObject;
import com.ee.domain.company.Producer;

public interface Product extends PersistentObject {

	public String getName();
	public String getDescription();
	public String getReference();
	public Producer getProducer();
}
