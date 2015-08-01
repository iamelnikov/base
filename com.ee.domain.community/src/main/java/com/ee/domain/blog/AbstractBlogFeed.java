package com.ee.domain.blog;

import java.util.LinkedList;
import java.util.List;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.user.User;

public abstract class AbstractBlogFeed extends AbstractPersistentObject
		implements Feed {

	protected List<String> followers;

	public AbstractBlogFeed(String id) {
		super(id);
		this.followers = new LinkedList<String>();
	}

	public AbstractBlogFeed() {
		super();
		this.followers = new LinkedList<String>();
	}

	@Override
	public void addFollower(String followerId) {
		assert followerId != null && followerId.trim().length() > 0;
		assert this.followers != null;

		this.followers.add(followerId);

	}

	@Override
	public void addFollower(User follower) {
		assert follower != null;
		this.addFollower(follower.getId());
	}

	@Override
	public void removeFollower(String followerId) {
		assert followerId != null && followerId.trim().length() > 0;
		assert this.followers != null;

		this.followers.remove(followerId);
	}

	@Override
	public void removeFollower(User follower) {
		assert follower != null;
		this.removeFollower(follower.getId());
	}

	@Override
	public List<String> getFollowers() {
		return followers;
	}

	public void setFollowers(List<String> followers) {
		this.followers = followers;
	}
}
