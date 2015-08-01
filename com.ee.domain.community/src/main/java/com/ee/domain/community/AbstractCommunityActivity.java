package com.ee.domain.community;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.ee.core.impl.CollectionTools;

public abstract class AbstractCommunityActivity<T> extends AbstractMessage<T>
		implements CommunityActivityEntry<T> {

	protected String title;

	protected String description;

	protected List<Comment<?>> commentsList;

	protected Set<Tag> tagSet;

	protected String type;

	protected boolean commentsAvailable;

	protected boolean newCommentsAddingAvailable;

	public AbstractCommunityActivity(String id, String publisherId,
			String title, String description, T content, Date publishDate,
			Date modifyDate, boolean modified, boolean removed, Date removeDate) {
		super(id, publisherId, content, publishDate, modifyDate, modified,
				removed, removeDate);
		this.title = title;
		this.description = description;
	}

	public AbstractCommunityActivity(String id, String publisherId,
			String title, String description, T content) {
		super(id, publisherId, content);
		this.title = title;
		this.description = description;
	}

	public AbstractCommunityActivity(String publisherId, String title,
			String description, T content) {
		super(publisherId, content);
		this.title = title;
		this.description = description;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public Set<Tag> getTagSet() {
		return this.tagSet;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public boolean isCommentsAvailable() {
		return commentsAvailable;
	}

	@Override
	public boolean isNewCommentsAddingAvailable() {
		return newCommentsAddingAvailable;
	}

	@Override
	public List<Comment<?>> getComments() {
		return commentsList;
	}

	@Override
	public void hideComments() {
		this.commentsAvailable = false;
	}

	@Override
	public void restrictNewComments() {
		this.newCommentsAddingAvailable = false;
	}

	@Override
	public void addTag(Tag tag) {
		assert tag != null;
		CollectionTools.initSetAsLinkedHashSetIfNull(tagSet);
		this.tagSet.add(tag);

	}

	@Override
	public void removeTag(Tag tag) {
		assert tag != null;
		if (tagSet != null)
			tagSet.remove(tag);
	}

	@Override
	public void removeTag(String tagName) {
		if (tagName != null && tagName.trim().length() > 0)
			if (tagSet != null) {
				Tag tag = tagSet.stream()
						.filter(it -> it.getName().equals(tagName)).findFirst()
						.get();
				if (tag != null)
					tagSet.remove(tag);
			}
	}
}
