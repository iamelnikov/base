package com.ee.domain.request;

import com.ee.core.Descriptable;
import com.ee.core.PersistentObject;
import com.ee.domain.company.Consumer;

public interface ConsumerRequest extends PersistentObject, Descriptable {

	public Consumer getConsumer();

	public void close();

	public String getProductName(); 


}
