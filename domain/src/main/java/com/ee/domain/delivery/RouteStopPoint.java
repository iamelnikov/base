package com.ee.domain.delivery;

import java.util.Date;

import org.junit.runner.Describable;

import com.ee.domain.contacts.Address;

public interface RouteStopPoint extends Describable {

	public int getNumber();

	public Address getAddress();

	public Date getArrivalDate();

	public Date getDepartureDate();

}
