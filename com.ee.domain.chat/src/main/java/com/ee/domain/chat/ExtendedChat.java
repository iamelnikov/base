package com.ee.domain.chat;

import java.util.Set;

import com.ee.core.Descriptable;
import com.ee.domain.goal.Goal;
import com.ee.domain.task.Task;

public interface ExtendedChat<U> extends Chat<U>, Descriptable {

	public Set<ChatPurpose> getChatPurposes();
	
	public void addChatPurpose(ChatPurpose chatPurpose);
	
	public void removeChatPurpose(ChatPurpose chatPurpose);

	public Set<Goal> getGoalSet();
	
	public void addGoal(Goal goal);
	
	public void removeGoal(Goal goal);

	public Set<Task<?>> getTaskSet();
	
	public void addTask(Task<?> task);
	
	public void removeTask(Task<?> task);

	public ChatSummary<?> getSummary();

	public String getSecretaryUserName();

	public int getStatus();

}
