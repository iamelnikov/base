package com.ee.domain.person;

public abstract class AbstractPersonMaritalStatusExtended extends AbstractPersonMaritalStatus implements
		PersonMaritalStatusExtended {
	
	protected int childrenCount;
	protected int familyMemberCount;
	protected int marriageCount;
	
	public AbstractPersonMaritalStatusExtended(String id, String status) {
		super(id, status);
	}

	public AbstractPersonMaritalStatusExtended(String status) {
		super(status);
	}
	
	public AbstractPersonMaritalStatusExtended(String id, String status, Integer childrenCount, Integer familyMemberCount, Integer marriageCount) {
		super(id, status);
		this.childrenCount = childrenCount;
		this.familyMemberCount = familyMemberCount;
		this.marriageCount = marriageCount;
	}

	public AbstractPersonMaritalStatusExtended(String status, Integer childrenCount, Integer familyMemberCount, Integer marriageCount) {
		super(status);
		this.childrenCount = childrenCount;
		this.familyMemberCount = familyMemberCount;
		this.marriageCount = marriageCount;
	}

	@Override
	public int getChildrenCount() {
		return childrenCount;
	}

	@Override
	public int getFamilyMemberCount() {
		return familyMemberCount;
	}

	@Override
	public int getMarriageCount() {
		return marriageCount;
	}

	public void setChildrenCount(int childrenCount) {
		this.childrenCount = childrenCount;
	}

	public void setFamilyMemberCount(int familyMemberCount) {
		this.familyMemberCount = familyMemberCount;
	}

	public void setMarriageCount(int marriageCount) {
		this.marriageCount = marriageCount;
	}
}
