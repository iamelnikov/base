package com.ee.domain.goal;

import java.util.Date;
import java.util.Set;

import com.ee.domain.community.AbstractCommunityActivity;

public class GoalImpl extends AbstractCommunityActivity<String> implements Goal {
	protected Date dueDate;

	protected String blockquote;

	protected String status;

	protected Set<Goal> childGoalSet;

	protected Set<Goal> parentGoalSet;

	protected double progress;

	public GoalImpl(String id, String publisherId, String title,
			String description, String content, Date publishDate,
			Date modifyDate, boolean modified, boolean removed, Date removeDate) {
		super(id, publisherId, title, description, content, publishDate, modifyDate,
				modified, removed, removeDate);
	}

	public GoalImpl(String id, String publisherId, String title,
			String description, String content) {
		super(id, publisherId, title, description, content);
	}

	public GoalImpl(String publisherId, String title, String description,
			String content) {
		super(publisherId, title, description, content);
	}

	@Override
	public String getBlockquote() {
		return blockquote;
	}

	@Override
	public Date getDueDate() {
		return dueDate;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public Set<Goal> getChildGoalSet() {
		return childGoalSet;
	}

	@Override
	public Set<Goal> getParentGoalSet() {
		return parentGoalSet;
	}

	@Override
	public double getProgress() {
		return progress;
	}

	@Override
	public String[] getAttachments() {
		// TODO Auto-generated method stub
		return null;
	}

}
