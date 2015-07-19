package com.ee.domain.mongo.user;

import org.springframework.security.core.GrantedAuthority;

import com.ee.domain.person.Person;
import com.ee.domain.user.UserRole;

public class DefaultUserImpl extends AbstractMongoUser{

	private static final long serialVersionUID = -452779657630201109L;
	
	public DefaultUserImpl(String id, String userName, String email,
			String password, boolean accountNonExpired,
			boolean accountNonLocked, boolean credentialsNonExpired,
			boolean enabled, Person person) {
		super(id, userName, email, password, accountNonExpired, accountNonLocked,
				credentialsNonExpired, enabled, person);
	}

	@Override
	protected GrantedAuthority getGrantedAuthority(UserRole userRole) {
		if (GrantedAuthority.class.isAssignableFrom(userRole.getClass()))
			return (GrantedAuthority) userRole;
		else
			return null;
	}

}
