package com.ee.domain.chat.impl;

import com.ee.domain.task.Task;

public class MongoChatSummaryRecordImpl extends ChatSummaryRecordImpl<String> {

	public MongoChatSummaryRecordImpl(int orderNum, String title, Task<?> task,
			String comment, String responsibleUserName,
			String taskExecutorUserName) {
		super(orderNum, title, task, comment, responsibleUserName,
				taskExecutorUserName);
	}
}
