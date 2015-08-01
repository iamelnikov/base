package com.ee.domain.goal;

import java.util.Date;
import java.util.Set;

import com.ee.core.Descriptable;
import com.ee.domain.community.CommunityActivityEntry;

public interface Goal extends CommunityActivityEntry<String>, Descriptable {

	public String getBlockquote();

	public Date getDueDate();

	public String getStatus();

	public Set<Goal> getChildGoalSet();

	public Set<Goal> getParentGoalSet();

	public double getProgress();

}
