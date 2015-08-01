package com.ee.domain.person;

public interface PersonMaritalStatusExtended extends PersonMaritalStatus {

	public int getChildrenCount();
	public int getFamilyMemberCount();
	public int getMarriageCount();
}
