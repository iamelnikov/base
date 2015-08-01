package com.ee.domain.company;

import com.ee.domain.company.structure.Subdivision;
import com.ee.domain.person.PersonExtended;

public interface Employee {

	public PersonExtended getPerson();
	public EmployeePosition getPosition();
	public Subdivision getSubdivision();
	
	
}
