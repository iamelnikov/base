package com.ee.domain.delivery;

import java.util.Date;

import com.ee.core.Descriptable;
import com.ee.domain.contacts.Address;

public interface RouteStopPoint extends Descriptable {

	public Route getRoute();
	
	public int getNumber();

	public Address getAddress();

	public Date getArrivalDate();

	public Date getDepartureDate();
	
	public Date getPreferedArrivalDate();
	
	public void getAction(RouteStopPointAction actionObject);
}
