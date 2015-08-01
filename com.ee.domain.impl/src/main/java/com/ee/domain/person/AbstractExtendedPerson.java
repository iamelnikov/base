package com.ee.domain.person;

import java.util.Date;
import java.util.List;

import com.ee.core.impl.CollectionTools;
import com.ee.domain.job.JobPlacement;

public abstract class AbstractExtendedPerson extends AbstractPerson implements
		PersonExtended {

	protected String lastName;
	protected String firstName;
	protected String middleName;
	protected Date birthDate;
	protected int gender;
	protected String birthPlace;
	protected PersonalData personalData;
	protected List<PersonEducation> personEducationList;
	protected List<JobPlacement> jobPlacementList;
	protected List<PersonIdentityDocument> personIdentityDocumentList;

	public AbstractExtendedPerson(PersonalData personalData) {
		this.personalData = personalData;
	}

	public PersonalData getPersonalData() {
		return this.personalData;
	}

	public void setPersonData(PersonalData personalData) {
		this.personalData = personalData;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public int getGender() {
		return gender;
	};

	@Override
	public List<PersonIdentityDocument> getIdentityDocuments() {
		return this.personIdentityDocumentList;
	}

	@Override
	public PersonMaritalStatusExtended getMaritalStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonMilitaryStatus getMilitaryStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonEducation> getEducationList() {
		return personEducationList;
	}

	@Override
	public void addPersonEducation(PersonEducation personEducation) {
		assert personEducation != null;
		CollectionTools.initListAsArrayListIfNull(personEducationList);
		assert this.personEducationList != null;
		this.personEducationList.add(personEducation);
	}

	@Override
	public void removePersonEducation(PersonEducation personEducation) {
		assert personEducation != null;
		if (this.personEducationList != null)
			this.personEducationList.remove(personEducation);
	}

	@Override
	public List<JobPlacement> getJobPlacements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPersonIdentityDocument(
			PersonIdentityDocument personIdentityDocument) {
		assert personIdentityDocument != null;
		CollectionTools.initListAsArrayListIfNull(jobPlacementList);

	}

	@Override
	public void removePersonIdentityDocument(
			PersonIdentityDocument personIdentityDocument) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addJobPlacement(JobPlacement jobPlacement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeJobPlacement(JobPlacement jobPlacement) {
		// TODO Auto-generated method stub

	}
}
