package com.ee.domain.community;

import com.ee.domain.task.Task;

public class Notification {
	private Task<?> linkedTask;
	private String notificationData;
	private Boolean isRepeatableNotification;
	private String scheduleTaskId;

	public Task<?> getLinkedTask() {
		return linkedTask;
	}

	public void setLinkedTask(Task<?> linkedTask) {
		this.linkedTask = linkedTask;
	}

	public String getNotificationData() {
		return notificationData;
	}

	public void setNotificationData(String notificationData) {
		this.notificationData = notificationData;
	}

	public Boolean getIsRepeatableNotification() {
		return isRepeatableNotification;
	}

	public void setIsRepeatableNotification(Boolean isRepeatableNotification) {
		this.isRepeatableNotification = isRepeatableNotification;
	}

	public String getScheduleTaskId() {
		return scheduleTaskId;
	}

	public void setScheduleTaskId(String scheduleTaskId) {
		this.scheduleTaskId = scheduleTaskId;
	}
}
