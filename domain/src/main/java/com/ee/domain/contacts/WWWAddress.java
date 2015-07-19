package com.ee.domain.contacts;

import com.ee.core.PersistentObject;
import com.ee.core.StringTyped;

/**
 * 
 * @author ilya Интерфейс "Интернет адрес"
 */
public interface WWWAddress extends
		PersistentObject, Contact, StringTyped {

	public String getAddress();
}
