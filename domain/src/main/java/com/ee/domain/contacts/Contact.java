package com.ee.domain.contacts;

public interface Contact {

	public boolean isConfirmed();

	public boolean isBasic();

	public boolean isActive();
	
	public String getContactInfo();
}
