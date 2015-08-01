package com.ee.domain.person;

public class DefaultPersonMaritalStatusExtended extends AbstractPersonMaritalStatusExtended{

	public DefaultPersonMaritalStatusExtended(String status, Integer childrenCount,
			Integer familyMemberCount, Integer marriageCount) {
		super(status, childrenCount, familyMemberCount, marriageCount);
	}

	public DefaultPersonMaritalStatusExtended(String id, String status,
			Integer childrenCount, Integer familyMemberCount,
			Integer marriageCount) {
		super(id, status, childrenCount, familyMemberCount, marriageCount);
	}
}
