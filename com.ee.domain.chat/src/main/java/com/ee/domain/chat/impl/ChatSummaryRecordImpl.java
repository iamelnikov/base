package com.ee.domain.chat.impl;

import com.ee.domain.chat.ChatSummaryRecord;
import com.ee.domain.task.Task;

public abstract class ChatSummaryRecordImpl<T> implements ChatSummaryRecord<T> {

	private String comment;

	protected Task<?> task;

	protected int orderNum;

	protected String title;
	
	protected T responsibleUser;
	
	protected T taskExecutor;

	public ChatSummaryRecordImpl(int orderNum, String title, Task<?> task, String comment, 
			T responsibleUser, T taskExecutor) {
		super();
		this.comment = comment;
		this.task = task;
		this.orderNum = orderNum;
		this.title = title;
		this.responsibleUser = responsibleUser;
		this.taskExecutor = taskExecutor;
	}

	@Override
	public int getOrderNum() {
		return orderNum;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public Boolean isTask() {
		return task != null;
	}

	@Override
	public Task<?> getTask() {
		return task;
	}

	@Override
	public String getComment() {
		return comment;
	}
	
	@Override
	public T getTaskExecutor() {
		return taskExecutor;
	}

	@Override
	public T getResponsibleUser() {
		return responsibleUser;
	}

}
