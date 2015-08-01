package com.ee.domain.community;

import java.util.List;

import com.ee.domain.blog.Feed;

public interface SocialPage {

	public List<Feed> getFeedList();

	public void addFeed(Feed feed);

	public void removeFeed(Feed feed);

	public void removeFeed(String feedId);
}
