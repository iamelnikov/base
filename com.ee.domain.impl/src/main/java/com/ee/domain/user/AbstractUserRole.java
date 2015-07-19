package com.ee.domain.user;

import com.ee.core.Descriptable;
import com.ee.core.impl.AbstractPersistentObject;

public abstract class AbstractUserRole extends AbstractPersistentObject
		implements UserRole, Descriptable {

	protected String name;
	protected String description;

	public AbstractUserRole(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
