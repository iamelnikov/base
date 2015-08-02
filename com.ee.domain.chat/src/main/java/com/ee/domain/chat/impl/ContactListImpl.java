package com.ee.domain.chat.impl;

import java.util.Set;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.chat.ContactList;

public abstract class ContactListImpl<T> extends AbstractPersistentObject
		implements ContactList {

	protected T user;

	protected Set<T> users;

	public ContactListImpl(T user) {
		super();
		this.user = user;
	}
	
	public ContactListImpl(String id, T user) {
		super(id);
		this.user = user;
	}

	protected abstract String getProtectedUserId();

	protected abstract Set<String> getProtectedUserNames();

	@Override
	public String getOwnerUserName() {
		return getProtectedUserId();
	}

	@Override
	public Set<String> getUserNames() {
		return getProtectedUserNames();
	}
}
