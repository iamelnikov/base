package com.ee.domain.chat;

import java.util.Set;

import com.ee.domain.person.Person;
import com.ee.domain.task.TaskImpl;

public interface ChatSummary {

	public Set<ChatSummaryRecord> getRecords();

	interface ChatSummaryRecord {

		public int getOrderNum();

		public String getTitleTitle();

		public Boolean getIsTask();

		public TaskImpl getTask();

		public Person getTaskExecutor();

		public Person getResponsibleUser();

		public String getComment();

	}
}
