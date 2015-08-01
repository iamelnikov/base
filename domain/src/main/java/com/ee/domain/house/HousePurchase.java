package com.ee.domain.house;

import java.util.List;

import com.ee.domain.person.PersonExtended;

public interface HousePurchase {

	public House getHouse();
	public PersonExtended getRequestInitiator();
	public List<HousePurchaseProductListItem<?>> getPurchaseList();
	public int getPaymentType();
	
	
}
