package com.ee.domain.community;

import java.util.Date;

public abstract class AbstractComment<T> extends AbstractMessage<T> implements
		Comment<T> {

	protected String targetObjectId;
	protected Comment<?> previousComment;

	public AbstractComment(String id, String publisherId, T content,
			Date publishDate, Date modifyDate, boolean modified,
			boolean removed, Date removeDate, String targetObjectId,
			Comment<?> previousComment) {
		super(id, publisherId, content, publishDate, modifyDate, modified,
				removed, removeDate);
		this.targetObjectId = targetObjectId;
		this.previousComment = previousComment;
	}

	public AbstractComment(String id, String publisherId, T content,
			String targetObjectId, Comment<?> previousComment) {
		super(id, publisherId, content);
		this.targetObjectId = targetObjectId;
		this.previousComment = previousComment;
	}

	public AbstractComment(String publisherId, T content,
			String targetObjectId, Comment<?> previousComment) {
		super(publisherId, content);
		this.targetObjectId = targetObjectId;
		this.previousComment = previousComment;
	}

	@Override
	public String getTargetObjectId() {
		return targetObjectId;
	}

	@Override
	public Comment<?> getPreviousComment() {
		return previousComment;
	}
}
