package com.ee.domain.community;

import com.ee.core.PersistentObject;
import com.ee.domain.person.Person;

public interface LikeObject extends PersistentObject 
{

	public Person getPerson();
	
	public Object getType();

}
