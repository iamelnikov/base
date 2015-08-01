package com.ee.domain.user;

import com.ee.domain.person.PersonExtended;

public class DefaultUser extends AbstractUser {

	public DefaultUser(String id, PersonExtended person, String userName,
			String password, String email, boolean enabled) {
		super(id, person, userName, password, email, enabled);
	}
}
