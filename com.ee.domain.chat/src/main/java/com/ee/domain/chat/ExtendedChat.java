package com.ee.domain.chat;

import java.util.Set;

import com.ee.domain.goal.GoalImpl;
import com.ee.domain.task.TaskImpl;

public interface ExtendedChat extends Chat{

	public Set<ChatPurpose> getChatPurposes(); 

	public Set<GoalImpl> getTalkAimSet();

	public Set<TaskImpl> getTaskSet();

	public ChatSummary getSummary();

	public ChatParticipant<?> getTalkSecretary();

	public int getTalkStatus();

	public String getDescription();
}
