package com.ee.domain.community;

import com.ee.domain.person.Person;

public abstract class AbstractVoter implements Voter {
	
	private Person userInfo;

//	private Task taskToVoting;

//	private Date startSupportingDate;

	public AbstractVoter() {
		super();
	}

/*	public Task getTaskToSupport() {
		return taskToVoting;
	}

	public void setTaskToSupport(Task taskToSupport) {
		this.taskToVoting = taskToSupport;
	}

	public Date getStartSupportingDate() {
		return startSupportingDate;
	}

	public void setStartSupportingDate(Date startSupportingDate) {
		this.startSupportingDate = startSupportingDate;
	}*/

}
