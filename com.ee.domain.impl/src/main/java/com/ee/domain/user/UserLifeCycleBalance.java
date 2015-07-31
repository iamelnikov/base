package com.ee.domain.user;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.person.Person;

public class UserLifeCycleBalance extends AbstractPersistentObject
{
	private Person userInfo; 
	
	private abstract static class LifeCycleBalanceDirection extends AbstractPersistentObject
	{
		public LifeCycleBalanceDirection() {}
		
		private UserLifeCycleBalance balance;
		
		private String directionType;
		
		private Double progress;
	}
	
	private static class HealthLifeCycleDirection extends LifeCycleBalanceDirection{}
	
	private static class FinanceLifeCycleDirection extends LifeCycleBalanceDirection{}
	
	private static class EducationLifeCycleDirection extends LifeCycleBalanceDirection{}

	private static class CareerLifeCycleDirection extends LifeCycleBalanceDirection{}
}
