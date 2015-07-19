package com.ee.domain.house;

import java.util.List;

import com.ee.domain.person.Person;

public interface HousePurchase {

	public House getHouse();
	public Person getRequestInitiator();
	public List<HousePurchaseProductListItem<?>> getPurchaseList();
	public int getPaymentType();
	
	
}
