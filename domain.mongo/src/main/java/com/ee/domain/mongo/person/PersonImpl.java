package com.ee.domain.mongo.person;

public abstract class PersonImpl {

	protected PersonalDataImpl personalData;

	public PersonImpl(PersonalDataImpl personalData) {
		this.personalData = personalData;
	}
	
	public PersonalDataImpl getPersonalData(){
		return this.personalData;
	}
	
	public void setPersonData(PersonalDataImpl personalData){
		this.personalData = personalData;
	}
}
