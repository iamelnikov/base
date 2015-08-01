package com.ee.domain.blog;

public class PublicBlogFeed extends AbstractBlogFeed {

	@Override
	public String getType() {
		return FEED_TYPE.PUBLIC.toString();
	}

}
