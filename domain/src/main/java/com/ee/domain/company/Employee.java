package com.ee.domain.company;

import com.ee.domain.company.structure.Subdivision;
import com.ee.domain.person.Person;

public interface Employee {

	public Person getPerson();
	public EmployeePosition getPosition();
	public Subdivision getSubdivision();
	
	
}
