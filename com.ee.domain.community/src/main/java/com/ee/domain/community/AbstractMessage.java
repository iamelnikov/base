package com.ee.domain.community;

import java.util.Date;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.message.Message;

public abstract class AbstractMessage<T> extends AbstractPersistentObject implements Message<T> {

	protected String publisherId;
	
	protected T content;

	protected Date publishDate;
	

	protected Date modifyDate;

	protected boolean modified;
	
	protected boolean removed;

	protected Date removeDate;
	

	public AbstractMessage(String id, String publisherId, T content, Date publishDate,
			Date modifyDate, boolean modified, boolean removed, Date removeDate) {
		super(id);
		this.publisherId = publisherId;
		this.content = content;
		this.publishDate = publishDate;
		this.modifyDate = modifyDate;
		this.modified = modified;
		this.removed = removed;
		this.removeDate = removeDate;
	}

	public AbstractMessage(String id, String publisherId, T content) {
		super(id);
		this.publisherId = publisherId;
		this.content = content;
		this.publishDate = new Date();
	}
	
	public AbstractMessage(String publisherId, T content) {
		super();
		this.publisherId = publisherId;
		this.content = content;
		this.publishDate = new Date();
	}

	public void setContent(T content) {
		this.content = content;
	}

	@Override
	public T getContent() {
		return content;
	}

	@Override
	public String getPublisherId() {
		return publisherId;
	}

	@Override
	public Date getPublishDate() {
		return publishDate;
	}

	@Override
	public boolean isModified() {
		return modified;
	}

	@Override
	public Date getModifyDate() {
		return modifyDate;
	}

	@Override
	public boolean isRemoved() {
		return removed;
	}

	@Override
	public Date getRemoveDate() {
		return removeDate;
	}

	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public void setModified(boolean modified) {
		this.modified = modified;
	}

	public void setRemoved(boolean removed) {
		this.removed = removed;
	}

	public void setRemoveDate(Date removeDate) {
		this.removeDate = removeDate;
	}

}
