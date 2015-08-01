package com.ee.domain.blog;

import java.util.Date;
import java.util.List;

import com.ee.domain.community.Like;
import com.ee.domain.community.Tag;
import com.ee.domain.user.User;

public interface FeedEntry<T> {

	public String getBlogFeedId();
	
	public User getPublisher();

	public Date getDate();

	public String getTitle();

	public String getSubtitle();

	public T getContent();

	public List<Tag> getTags();
	
	public void addLike(Like like);
	
	public void removeLike(Like like);

}
