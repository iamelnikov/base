package com.ee.domain.chat.impl;

import java.util.Set;

import com.ee.core.impl.CollectionTools;
import com.ee.domain.chat.ExtendedBusinessChat;

public abstract class ExtendedBusinessChatImpl<U, C> extends
		BusinessChatImpl<U, C> implements ExtendedBusinessChat<U, C> {

	protected Set<C> interactingCompanies;

	public ExtendedBusinessChatImpl(String title, U originator, C company,
			Set<U> participantIdSet) {
		super(title, originator, company, participantIdSet);
	}

	public ExtendedBusinessChatImpl(String title, U originator, C company) {
		super(title, originator, company);
	}

	public ExtendedBusinessChatImpl(String id, String title, U originator, C company,
			Set<U> participantIdSet) {
		super(id, title, originator, company, participantIdSet);
	}

	public ExtendedBusinessChatImpl(String id, String title, U originator, C company) {
		super(id, title, originator, company);
	}

	@Override
	public Set<C> getInteractingCompanies() {
		return interactingCompanies;
	}

	@Override
	public void addCompany(C company) {
		assert company != null;
		CollectionTools.initSetAsLinkedHashSetIfNull(interactingCompanies);
		this.interactingCompanies.add(company);
	}

	@Override
	public void removeCompany(C company) {
		assert company != null;
		if (this.interactingCompanies != null)
			this.interactingCompanies.remove(company);
	}

	protected abstract C getCompanyObjectById(String id);

	@Override
	public void removeCompany(String companyId) {
		assert companyId != null && companyId.trim().length() > 0;
		final C companyObject = getCompanyObjectById(companyId);
		if (this.interactingCompanies != null)
			this.interactingCompanies.remove(companyObject);
	}
}
