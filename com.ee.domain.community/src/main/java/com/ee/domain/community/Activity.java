package com.ee.domain.community;

import java.util.Date;

import com.ee.core.impl.AbstractPersistentObject;


public abstract class Activity extends AbstractPersistentObject 
{
	protected String title;
	
	protected String description;
	
	protected Date creationDate;
	
	private String priority;
	
	protected Date lastUpdatedDate;
	
	public Activity()
	{
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
}
