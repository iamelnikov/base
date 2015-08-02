package com.ee.domain.chat.impl;

import java.util.Set;

import com.ee.core.impl.CollectionTools;
import com.ee.domain.chat.ChatPurpose;
import com.ee.domain.chat.ChatSummary;
import com.ee.domain.chat.ExtendedChat;
import com.ee.domain.goal.Goal;
import com.ee.domain.task.Task;

public abstract class ExtendedChatImpl<T> extends ChatImpl<T> implements
		ExtendedChat<T> {

	protected String secretaryUserName;

	protected int status;

	protected Set<Task<?>> taskSet;

	protected Set<ChatPurpose> purposeSet;

	protected ChatSummary<?> summary;

	protected Set<Goal> goalSet;

	protected String description;

	public ExtendedChatImpl(String id, String title, T originator,
			Set<T> participantIdSet, String secretaryUserName, int status,
			Set<Task<?>> taskSet, Set<ChatPurpose> purposeSet,
			ChatSummary<?> summary, Set<Goal> goalSet, String description) {
		super(id, title,  originator, participantIdSet);
		this.secretaryUserName = secretaryUserName;
		this.status = status;
		this.taskSet = taskSet;
		this.purposeSet = purposeSet;
		this.summary = summary;
		this.goalSet = goalSet;
		this.description = description;
	}

	public ExtendedChatImpl(String title, T originator,
			Set<T> participantIdSet, String secretaryUserName, int status,
			Set<Task<?>> taskSet, Set<ChatPurpose> purposeSet,
			ChatSummary<?> summary, Set<Goal> goalSet, String description) {
		super(title, originator, participantIdSet);
		this.secretaryUserName = secretaryUserName;
		this.status = status;
		this.taskSet = taskSet;
		this.purposeSet = purposeSet;
		this.summary = summary;
		this.goalSet = goalSet;
		this.description = description;
	}

	@Override
	public Set<ChatPurpose> getChatPurposes() {
		return purposeSet;
	}

	@Override
	public Set<Goal> getGoalSet() {
		return goalSet;
	}

	@Override
	public Set<Task<?>> getTaskSet() {
		return taskSet;
	}

	@Override
	public ChatSummary<?> getSummary() {
		return summary;
	}

	@Override
	public String getSecretaryUserName() {
		return secretaryUserName;
	}

	@Override
	public int getStatus() {
		return status;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void addChatPurpose(ChatPurpose chatPurpose) {
		assert chatPurpose != null;
		CollectionTools.initSetAsLinkedHashSetIfNull(this.purposeSet);
		this.purposeSet.add(chatPurpose);
	}

	@Override
	public void removeChatPurpose(ChatPurpose chatPurpose) {
		assert chatPurpose != null;
		if (this.purposeSet != null)
			this.purposeSet.remove(chatPurpose);
	}

	@Override
	public void addGoal(Goal goal) {
		assert goal != null;
		CollectionTools.initSetAsLinkedHashSetIfNull(goalSet);
		this.goalSet.add(goal);
	}

	@Override
	public void removeGoal(Goal goal) {
		assert goal != null;
		if (this.goalSet != null)
			this.goalSet.remove(goal);
	}

	@Override
	public void addTask(Task<?> task) {
		assert task != null;
		CollectionTools.initSetAsLinkedHashSetIfNull(taskSet);
		this.taskSet.add(task);
	}

	@Override
	public void removeTask(Task<?> task) {
		assert task != null;
		if (this.taskSet != null)
			this.taskSet.remove(task);
	}

}
