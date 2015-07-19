package com.ee.domain.contacts;


import java.util.Locale;

import com.ee.core.Descriptable;
import com.ee.core.PersistentObject;
import com.ee.core.StringTyped;


public interface Address extends Contact, PersistentObject, StringTyped, Descriptable{
	
	public String getZipCode();
	public String getCountry();
	public String getRegion();
	public String getCity();
	public String getStreet();
	public int getHouse();
	public String getBuilding();
	public String getBlock();
	public double[] getGeoLocation();
	public String getFullAddress();
	public String getFullAddress(Locale locale);
}
