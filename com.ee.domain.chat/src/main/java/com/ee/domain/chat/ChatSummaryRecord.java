package com.ee.domain.chat;

import com.ee.domain.task.Task;

public interface ChatSummaryRecord<T> {

	public int getOrderNum();

	public String getTitle();

	public Boolean isTask();

	public Task<?> getTask();

	public T getTaskExecutor();

	public T getResponsibleUser();

	public String getComment();

}
