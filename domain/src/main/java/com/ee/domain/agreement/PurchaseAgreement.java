package com.ee.domain.agreement;

import java.util.Set;


public interface PurchaseAgreement<T> extends Agreement<T>{

	public int getPurchaseType();
	public String[] getDocuments();
	public Set<PurchaseItem<?>> getPurchaseItems();
}
