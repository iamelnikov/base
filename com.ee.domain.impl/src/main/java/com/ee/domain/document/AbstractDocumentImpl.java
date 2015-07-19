package com.ee.domain.document;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.document.Document;

public abstract class AbstractDocumentImpl<T> extends AbstractPersistentObject
		implements Document<T> {

	protected T file;

	public AbstractDocumentImpl(String id, T file) {
		super(id);
		this.file = file;
	}

	public AbstractDocumentImpl(T file) {
		super();
		this.file = file;
	}

	public AbstractDocumentImpl(String id) {
		super(id);
	}

	public AbstractDocumentImpl() {
		super();
	}

	public T getFile() {
		return file;
	}

	public void setFile(T file) {
		this.file = file;
	}
}
