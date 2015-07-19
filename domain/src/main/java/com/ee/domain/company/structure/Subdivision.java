package com.ee.domain.company.structure;

import java.util.List;

import com.ee.core.PersistentObject;
import com.ee.domain.company.Employee;

public interface Subdivision extends PersistentObject {

	public String getName();
	public Employee getHeadOfSubdivision();
	public List<Employee> getEmployees();
}
