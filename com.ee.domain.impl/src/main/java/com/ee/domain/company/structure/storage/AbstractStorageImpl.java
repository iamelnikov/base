package com.ee.domain.company.structure.storage;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.company.structure.storage.Storage;

public abstract class AbstractStorageImpl extends AbstractPersistentObject
		implements Storage<AbstractStorageItemImpl<?>> {

	private String name;

	public AbstractStorageImpl(String name) {
		super();
		this.name = name;
	}

	public AbstractStorageImpl(String id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
