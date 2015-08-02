package com.ee.domain.chat.impl;

import java.util.Collections;
import java.util.Set;

import com.ee.domain.chat.ExtendedBusinessChat;

public abstract class InteractingCompaniesChat<U, C> extends
		BusinessChatImpl<U, C> implements ExtendedBusinessChat<U, C> {

	protected Set<C> interactingCompanies;

	public InteractingCompaniesChat(String title, U originator,
			C originatorCompany, Set<C> interactingCompanies,
			Set<U> participantIdSet) {
		super(title, originator, originatorCompany, participantIdSet);
		this.interactingCompanies = interactingCompanies;
	}

	public InteractingCompaniesChat(String title, U originator,
			C originatorCompany, Set<C> interactingCompanies) {
		super(title, originator, originatorCompany);
		this.interactingCompanies = interactingCompanies;
	}

	public InteractingCompaniesChat(String id, String title, U originator,
			C originatorCompany, Set<C> interactingCompanies,
			Set<U> participantIdSet) {
		super(id, title, originator, originatorCompany, participantIdSet);
		this.interactingCompanies = interactingCompanies;
	}

	public InteractingCompaniesChat(String id, String title, U originator,
			C originatorCompany, Set<C> interactingCompanies) {
		super(id, title, originator, originatorCompany);
		this.interactingCompanies = interactingCompanies;
	}

	@Override
	public Set<C> getInteractingCompanies() {
		return Collections.unmodifiableSet(interactingCompanies);
	}
}
