package com.ee.domain.mongo.user;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ee.domain.person.Person;
import com.ee.domain.user.AbstractUser;
import com.ee.domain.user.User;
import com.ee.domain.user.UserRole;

public abstract class AbstractMongoUser extends AbstractUser implements User,
		UserDetails {

	private static final long serialVersionUID = -207937805037955399L;

	protected final boolean accountNonExpired;
	protected final boolean accountNonLocked;
	protected final boolean credentialsNonExpired;

	public AbstractMongoUser(String id, String userName, String email,
			String password, boolean accountNonExpired,
			boolean accountNonLocked, boolean credentialsNonExpired,
			boolean enabled, Person person) {
		super(id, person, userName, password, email, enabled);
		this.accountNonExpired = accountNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.credentialsNonExpired = credentialsNonExpired;
		this.enabled = enabled;
		this.person = person;
	}

	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public String getEmail() {
		return this.email;
	}

	public Boolean isBlocked() {
		return !accountNonLocked;
	}

	public Boolean isPasswordExpired() {
		return !credentialsNonExpired;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.roles.stream().map(it -> getGrantedAuthority(it))
				.collect(Collectors.toSet());
	}

	protected abstract GrantedAuthority getGrantedAuthority(UserRole userRole);
}
