package com.ee.domain.person;

import com.ee.core.impl.AbstractPersistentObject;

public class AbstractPersonMaritalStatus extends AbstractPersistentObject
		implements PersonMaritalStatus {

	protected String status;
	
	public AbstractPersonMaritalStatus(String status) {
		super();
		this.status = status;
	}

	public  AbstractPersonMaritalStatus(String id, String status) {
		super(id);
		this.status = status;
	}

	@Override
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

}
