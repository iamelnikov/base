package com.ee.domain.agreement;

import java.util.Set;

public interface AgreementSubject {
	
	public String getSubjectAsString();
	
	public Set<AgreementSubjectItem<Number>> getItems();
}
