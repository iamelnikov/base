package com.ee.domain.person;

import java.util.List;

import com.ee.core.PersistentObject;
import com.ee.domain.contacts.Contact;
import com.ee.domain.job.JobPlacement;

public interface Person extends PersistentObject {

	public PersonalData getPersonalData();
	public List<PersonIdentityDocument> getIdentityDocuments();
	public PersonMaritalStatus getMaritalStatus();
	public PersonMilitaryStatus getMilitaryStatus();
	public List<PersonEducation> getEducationList();
	public List<JobPlacement> getJobPlacements(); 
	public List<Contact> getContacts();
}
