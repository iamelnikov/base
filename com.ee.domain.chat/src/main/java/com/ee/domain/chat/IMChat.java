package com.ee.domain.chat;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sgmi.goalguide.core.entities.SystemObject;
import com.sgmi.goalguide.core.entities.goal.Goal;
import com.sgmi.goalguide.core.entities.task.Task;

public class IMChat extends SystemObject
{
	private String title;
	
	private String desctiption;
	
	private Set<Goal> chatTODOGoalSet;
	
	private Set<Task> talkTaskSet;
	
	private Set<IMParticipant> participantSet;
	
	private Set<IMChatMessage> ChatMessageSet;
	
	private IMTalkSummary talkSummary;
	
	private IMParticipant chatSecretary;
	
	private int talkStatus;
	
	public IMChat()
	{
		
	}

	public String getTalkTitle() {
		return title;
	}

	public void setTalkTitle(String talkTitle) {
		this.title = talkTitle;
	}

	public Set<Goal> getTalkAimSet() {
		return chatTODOGoalSet;
	}

	public void setTalkAimSet(Set<Goal> talkAimSet) {
		this.chatTODOGoalSet = talkAimSet;
	}

	public Set<Task> getTalkTaskSet() {
		return talkTaskSet;
	}

	public void setTalkTaskSet(Set<Task> talkTaskSet) {
		this.talkTaskSet = talkTaskSet;
	}

	public Set<IMParticipant> getParticipantSet() {
		return participantSet;
	}

	public void setParticipantSet(Set<IMParticipant> participantSet) {
		this.participantSet = participantSet;
	}

	public Set<IMChatMessage> getTalkMessages() {
		return ChatMessageSet;
	}

	public void setTalkMessages(Set<IMChatMessage> talkMessages) {
		this.ChatMessageSet = talkMessages;
	}

	public IMTalkSummary getTalkSummary() {
		return talkSummary;
	}

	public void setTalkSummary(IMTalkSummary talkSummary) {
		this.talkSummary = talkSummary;
	}

	public IMParticipant getTalkSecretary() {
		return chatSecretary;
	}

	public void setTalkSecretary(IMParticipant talkSecretary) {
		this.chatSecretary = talkSecretary;
	}

	public int getTalkStatus() {
		return talkStatus;
	}

	public void setTalkStatus(int talkStatus) {
		this.talkStatus = talkStatus;
	}

	public String getDesctiption() {
		return desctiption;
	}

	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}
	
	
}
