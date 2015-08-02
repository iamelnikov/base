package com.ee.domain.chat.impl;

import java.util.Collections;
import java.util.Set;

import com.ee.core.impl.CollectionTools;
import com.ee.domain.chat.BusinessChat;
import com.ee.domain.chat.ChatPurpose;
import com.ee.domain.chat.ChatSummary;
import com.ee.domain.goal.Goal;
import com.ee.domain.task.Task;

public abstract class BusinessChatImpl<T, C> extends ChatImpl<T> implements BusinessChat<T, C> {

	protected C company;
	
	protected Set<ChatPurpose> purposeSet;

	protected Set<Goal> goalSet;

	protected Set<Task<?>> taskSet;
	
	protected ChatSummary<?> chatSummary;
	
	protected String secretaryUserName;
	
	protected int status; 
	
	protected String description;

	public BusinessChatImpl(String title, T originator, C company, Set<T> participantIdSet) {
		super(title, originator, participantIdSet);
		this.company = company;
	}

	public BusinessChatImpl(String id, String title,  T originator, C company, Set<T> participantIdSet) {
		super(id, title, originator, participantIdSet);
		this.company = company;
	}

	public BusinessChatImpl(String id, String title,  T originator, C company) {
		super(id, title, originator);
		this.company = company;
	}

	public BusinessChatImpl(String title,  T originator, C company) {
		super(title, originator);
		this.company = company;
	}

	@Override
	public Set<ChatPurpose> getChatPurposes() {
		return Collections.unmodifiableSet(purposeSet);
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
		if (purposeSet != null)
			purposeSet.remove(chatPurpose);
	}

	@Override
	public Set<Goal> getGoalSet() {
		return Collections.unmodifiableSet(this.goalSet);
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
		if (goalSet != null)
			this.goalSet.remove(goal);
	}

	@Override
	public Set<Task<?>> getTaskSet() {
		return Collections.unmodifiableSet(this.taskSet);
	}

	@Override
	public void addTask(Task<?> task) {
		assert task!=null;
		CollectionTools.initSetAsLinkedHashSetIfNull(taskSet);
		taskSet.add(task);
	}

	@Override
	public void removeTask(Task<?> task) {
		assert task!=null;
		if (task!=null)
		taskSet.remove(task);
	}

	@Override
	public ChatSummary<?> getSummary() {
		return chatSummary;
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
	public C getCompany() {
		return company;
	}
}
