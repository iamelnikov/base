package com.ee.domain.person;

import java.util.List;

import com.ee.domain.job.JobPlacement;

public interface PersonExtended extends Person {

	public List<PersonIdentityDocument> getIdentityDocuments();
	public void addPersonIdentityDocument(PersonIdentityDocument personIdentityDocument);
	public void removePersonIdentityDocument(PersonIdentityDocument personIdentityDocument);
	
	public PersonMaritalStatusExtended getMaritalStatus();
	public PersonMilitaryStatus getMilitaryStatus();
	
	public List<PersonEducation> getEducationList();
	public void addPersonEducation(PersonEducation personEducation);
	public void removePersonEducation(PersonEducation personEducation);
	
	public List<JobPlacement> getJobPlacements();
	public void addJobPlacement(JobPlacement jobPlacement);
	public void removeJobPlacement(JobPlacement jobPlacement);
}
