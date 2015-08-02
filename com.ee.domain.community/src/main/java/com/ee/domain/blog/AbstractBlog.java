package com.ee.domain.blog;

import java.util.List;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.core.impl.CollectionTools;

public abstract class AbstractBlog<T> extends AbstractPersistentObject
		implements Blog {

	protected T owner;
	protected List<Feed> feedList;

	public AbstractBlog(String ownerId) {
		super();
	}

	public AbstractBlog(String id, String ownerId) {
		super(id);
	}

	protected abstract String getProtectedOwnerId();

	@Override
	public List<Feed> getFeedList() {
		return feedList;
	}

	@Override
	public void addFeed(Feed feed) {
		assert feed != null;
		CollectionTools.initListAsArrayListIfNull(feedList);
		this.feedList.add(feed);
	}

	@Override
	public void removeFeed(Feed feed) {
		assert feed != null;
		if (feedList != null)
			feedList.remove(feed);
	}

	@Override
	public void removeFeed(String feedId) {
		assert feedId != null && feedId.trim().length() > 0;
		if (feedList != null) {
			Feed f = this.feedList.stream()
					.filter(it -> it.getId().equals(feedId)).findFirst().get();
			feedList.remove(f);
		}

	}

	@Override
	public String getOwnerId() {
		return getProtectedOwnerId();
	}

}
