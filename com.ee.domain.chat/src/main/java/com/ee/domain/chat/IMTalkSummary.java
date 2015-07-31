package com.ee.domain.chat;

import java.util.Date;
import java.util.Set;

import com.ee.core.impl.AbstractPersistentObject;
import com.ee.domain.person.Person;

import entities.task.Task;

public class IMTalkSummary extends AbstractPersistentObject 
{
	private Chat chat;
	
	private Set<ITalkSummaryRecord> records;
	
	public Chat getTalk() {
		return chat;
	}

	public void setTalk(Chat talk) {
		this.chat = talk;
	}

	public Set<ITalkSummaryRecord> getRecords() {
		return records;
	}

	public void setRecords(Set<ITalkSummaryRecord> records) {
		this.records = records;
	}

	private static class ITalkSummaryRecord extends AbstractPersistentObject
	{
		
		private int orderNum;
		
		private String recordTitle;
		
		private Boolean isTask;
		
		private Task task;
		
		private Person TaskExecutor;
		
		private Person responsibleUser;
		
		private String comment;
		
		private Date taskDate;

		public int getOrderNum() {
			return orderNum;
		}

		public void setOrderNum(int orderNum) {
			this.orderNum = orderNum;
		}

		public String getRecordTitle() {
			return recordTitle;
		}

		public void setRecordTitle(String recordTitle) {
			this.recordTitle = recordTitle;
		}

		public Boolean getIsTask() {
			return isTask;
		}

		public void setIsTask(Boolean isTask) {
			this.isTask = isTask;
		}

		public Task getTask() {
			return task;
		}

		public void setTask(Task task) {
			this.task = task;
		}

		public Person getTaskExecutor() {
			return TaskExecutor;
		}

		public void setTaskExecutor(Person taskExecutor) {
			TaskExecutor = taskExecutor;
		}

		public Person getResponsibleUser() {
			return responsibleUser;
		}

		public void setResponsibleUser(Person responsibleUser) {
			this.responsibleUser = responsibleUser;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Date getTaskDate() {
			return taskDate;
		}

		public void setTaskDate(Date taskDate) {
			this.taskDate = taskDate;
		}
	}
}
