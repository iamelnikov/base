package com.ee.domain.task;

import java.util.Date;
import java.util.Set;

import javax.management.Notification;

import com.ee.domain.community.AbstractCommunityActivity;

public class TaskImpl extends AbstractCommunityActivity<String> implements
		Task<String> {

	private Boolean taskNotificationNeed;

	private Set<Task<?>> subtasks;

	private Task<?> parentTask;

	private Notification notification;

	private String taskKind;

	private int status;

	public TaskImpl(String id, String publisherId, String title,
			String description, String content, Date publishDate,
			Date modifyDate, boolean modified, boolean removed, Date removeDate) {
		super(id, publisherId, title, description, content, publishDate,
				modifyDate, modified, removed, removeDate);
	}

	public TaskImpl(String id, String publisherId, String title,
			String description, String content) {
		super(id, publisherId, title, description, content);
	}

	public TaskImpl(String publisherId, String title, String description,
			String content) {
		super(publisherId, title, description, content);
	}

	@Override
	public String[] getAttachments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getTaskNotificationNeed() {
		return taskNotificationNeed;
	}

	@Override
	public Set<Task<?>> getSubtasks() {
		return subtasks;
	}

	@Override
	public Task<?> getParentTask() {
		return parentTask;
	}

	@Override
	public Notification getNotification() {
		return notification;
	}

	@Override
	public String getTaskKind() {
		return taskKind;
	}

	@Override
	public int getStatus() {
		return status;
	}

	public void setTaskNotificationNeed(Boolean taskNotificationNeed) {
		this.taskNotificationNeed = taskNotificationNeed;
	}

	public void setSubtasks(Set<Task<?>> subtasks) {
		this.subtasks = subtasks;
	}

	public void setParentTask(Task<?> parentTask) {
		this.parentTask = parentTask;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public void setTaskKind(String taskKind) {
		this.taskKind = taskKind;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
