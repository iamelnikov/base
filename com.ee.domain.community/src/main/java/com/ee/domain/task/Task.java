package com.ee.domain.task;

import java.util.Set;

import javax.management.Notification;

import com.ee.domain.community.CommunityActivityEntry;

public interface Task<T> extends CommunityActivityEntry<T> {

	public Boolean getTaskNotificationNeed();

	public Set<Task<?>> getSubtasks();

	public Task<?> getParentTask();

	public Notification getNotification();

	public String getTaskKind();

	public int getStatus();
}
