package com.ee.domain.mongo.document;

import com.ee.core.impl.AbstractPersistentObject;
import com.mongodb.gridfs.GridFSDBFile;

public class DefaultMongoDocument extends AbstractPersistentObject
		implements MongoDocument {

	protected GridFSDBFile file;

	public DefaultMongoDocument() {
		super();
	}

	public DefaultMongoDocument(String id) {
		super(id);
	}

	public DefaultMongoDocument(String id, GridFSDBFile file) {
		super(id);
		this.file = file;
	}

	public GridFSDBFile getFile() {
		return file;
	}

	public void setFile(GridFSDBFile file) {
		this.file = file;
	}
}
