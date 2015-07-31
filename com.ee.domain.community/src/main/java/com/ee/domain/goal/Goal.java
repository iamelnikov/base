package com.ee.domain.goal;

import java.util.Date;
import java.util.Set;

import com.ee.domain.community.Activity;
import com.ee.domain.community.ActivityRecord;
import com.ee.domain.community.CommentObject;
import com.ee.domain.community.Tag;
import com.ee.domain.person.Person;

public class Goal extends Activity implements ActivityRecord
{
	protected Date dueDate;
	
	protected String blockquote;
	
	private Person owner;

	private Person assigee;
	
	private String type;
	
	private String status; 
	
	private Set<Tag> tagSet;
	
	protected Set<Goal> childGoalSet;

	protected Set<Goal> parentGoalSet;
	
	protected Set<CommentObject<?>> userCommentSet;
	
	protected double progress;
	
	public Goal() 
	{
		super();
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getBlockquote() {
		return blockquote;
	}

	public void setBlockquote(String blockquote) {
		this.blockquote = blockquote;
	}

	public Person getAimOwner() {
		return owner;
	}

	public void setAimOwner(Person aimOwner) {
		this.owner = aimOwner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Tag> getTagSet() {
		return tagSet;
	}

	public void setTagSet(Set<Tag> tagSet) {
		this.tagSet = tagSet;
	}

	public Set<Goal> getChildGoalSet() {
		return childGoalSet;
	}

	public void setChildGoalSet(Set<Goal> childGoalSet) {
		this.childGoalSet = childGoalSet;
	}

	public Set<Goal> getParentGoalSet() {
		return parentGoalSet;
	}

	public void setParentGoalSet(Set<Goal> parentGoalSet) {
		this.parentGoalSet = parentGoalSet;
	}

	public Set<CommentObject<?>> getUserCommentSet() {
		return userCommentSet;
	}

	public void setUserCommentSet(Set<CommentObject<?>> userCommentSet) {
		this.userCommentSet = userCommentSet;
	}

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

	public Date getUpdateDate() 
	{
		return this.getLastUpdatedDate();
	}

	public String getData() 
	{
		return this.getTitle();
	}
}
