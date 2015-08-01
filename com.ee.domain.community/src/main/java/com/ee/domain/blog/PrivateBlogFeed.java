package com.ee.domain.blog;

public class PrivateBlogFeed extends AbstractBlogFeed {

	@Override
	public String getType() {
		return FEED_TYPE.PRIVATE.toString();
	}

}
