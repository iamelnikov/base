package com.ee.core.impl;

import java.util.UUID;

import com.ee.core.PersistentObject;

public class AbstractPersistentObject implements PersistentObject {

	protected String id;
	
	public AbstractPersistentObject() {
		this.id = UUID.randomUUID().toString();
	}
	
	public AbstractPersistentObject(String id) {
		this.id = id;
	}
	
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPersistentObject other = (AbstractPersistentObject) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
