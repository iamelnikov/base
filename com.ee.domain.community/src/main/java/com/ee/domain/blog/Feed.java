package com.ee.domain.blog;

import java.util.List;

import com.ee.core.PersistentObject;
import com.ee.domain.user.User;

public interface Feed extends PersistentObject {

	public String getType();

	public List<String> getFollowers();

	public void addFollower(String followerId);

	public void addFollower(User follower);

	public void removeFollower(String followerId);

	public void removeFollower(User follower);

	static enum FEED_TYPE {
		PRIVATE, PUBLIC, PERSONAL
	}
}
