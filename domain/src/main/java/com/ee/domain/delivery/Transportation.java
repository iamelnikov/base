package com.ee.domain.delivery;

import com.ee.domain.agreement.Agreement;
import com.ee.domain.company.Company;
import com.ee.domain.company.CompanyCar;
import com.ee.domain.company.Employee;

public interface Transportation {

	public Company getTransportCompany();
	
	public CompanyCar getCar();
	
	public Employee getDriver();
	
	public Route getRoute();

	public Agreement<?> getDeliveryAgreement();

}
