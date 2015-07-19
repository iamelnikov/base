package com.ee.domain.contacts;

import com.ee.core.Descriptable;
import com.ee.core.PersistentObject;
import com.ee.core.StringTyped;

public interface EmailAddress extends Contact,
		PersistentObject, StringTyped, Descriptable {

	public String getEmailAddress();

}
