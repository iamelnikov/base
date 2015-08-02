package com.ee.domain.chat;

import java.util.Set;

public interface ExtendedBusinessChat<U, C> extends BusinessChat<U,C> {

	public Set<C> getInteractingCompanies();

	public void addCompany(C company);

	public void removeCompany(C company);

	public void removeCompany(String companyId);
}
