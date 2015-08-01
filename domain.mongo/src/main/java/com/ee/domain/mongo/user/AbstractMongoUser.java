package com.ee.domain.mongo.user;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ee.domain.mongo.MongoDocumentPersistentTools;
import com.ee.domain.mongo.MongoPersistentDocument;
import com.ee.domain.person.Person;
import com.ee.domain.user.AbstractUser;
import com.ee.domain.user.User;
import com.ee.domain.user.UserRole;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public abstract class AbstractMongoUser extends AbstractUser implements User,
		UserDetails, MongoPersistentDocument {

	private static final long serialVersionUID = -207937805037955399L;

	protected boolean accountNonExpired;
	protected boolean credentialsNonExpired;

	protected static final String PERSON_FIELDNAME = "person";
	protected static final String USERNAME_FIELDNAME = "userName";
	protected static final String PASSWORD_FIELDNAME = "password";
	protected static final String EMAIL_FIELDNAME = "email";
	protected static final String ENABLED_FIELDNAME = "enabled";
	protected static final String ACCOUNTNONEXPIRED_FIELDNAME = "accountNonExpired";
	protected static final String BLOCKED_FIELDNAME = "blocked";
	protected static final String CREDENTIALSNONEXPIRED_FIELDNAME = "credentialsNonExpired";
	protected static final String ROLES_FIELDNAME = "roles";

	public AbstractMongoUser(			
			String userName, String email, String password,
			boolean accountNonExpired, boolean blocked,
			boolean credentialsNonExpired, boolean enabled, Person person) {
		super(person, userName, password, email, enabled);
		this.accountNonExpired = accountNonExpired;
		this.blocked = blocked;
		this.credentialsNonExpired = credentialsNonExpired;
	}
	
	public AbstractMongoUser(
			String id,
			String userName, String email, String password,
			boolean accountNonExpired, boolean blocked,
			boolean credentialsNonExpired, boolean enabled, Person person) {
		super(id, person, userName, password, email, enabled);
		this.accountNonExpired = accountNonExpired;
		this.blocked = blocked;
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public AbstractMongoUser(DBObject dbObject) {
		super((String) dbObject.get(MONGO_ID_FIELDNAME), (Person) dbObject
				.get(PERSON_FIELDNAME), (String) dbObject
				.get(USERNAME_FIELDNAME), (String) dbObject
				.get(PASSWORD_FIELDNAME), (String) dbObject
				.get(EMAIL_FIELDNAME), (boolean) dbObject
				.get(ENABLED_FIELDNAME));
		this.accountNonExpired = (boolean) dbObject
				.get(ACCOUNTNONEXPIRED_FIELDNAME);
		this.blocked = (boolean) dbObject
				.get(BLOCKED_FIELDNAME);
		this.credentialsNonExpired = (boolean) dbObject
				.get(CREDENTIALSNONEXPIRED_FIELDNAME);
	}

	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return !this.blocked;
	}

	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void disableUser() {
		this.enabled = false;
	}

	public void enableUser() {
		this.enabled = true;
	}

	public Boolean isBlocked() {
		return blocked;
	}

	@Override
	public void blockUser() {
		blocked = true;

	}

	public Boolean isPasswordExpired() {
		return !credentialsNonExpired;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.roles.stream().map(it -> getGrantedAuthority(it))
				.collect(Collectors.toSet());
	}

	@SuppressWarnings("unchecked")
	@Override
	public DBObject toDbObject() {
		BasicDBObject dobj = new BasicDBObject();
		assert id != null;
		assert userName != null;
		assert password != null;
		assert email != null;
		assert person != null;

		dobj.put(MONGO_ID_FIELDNAME, id);
		dobj.put(PERSON_FIELDNAME, person);
		dobj.put(USERNAME_FIELDNAME, userName);
		dobj.put(PASSWORD_FIELDNAME, password);
		dobj.put(EMAIL_FIELDNAME, email);

		dobj.put(ENABLED_FIELDNAME, enabled);
		dobj.put(ACCOUNTNONEXPIRED_FIELDNAME, accountNonExpired);
		dobj.put(BLOCKED_FIELDNAME, blocked);
		dobj.put(CREDENTIALSNONEXPIRED_FIELDNAME, credentialsNonExpired);
		dobj.put(
				ROLES_FIELDNAME,
				MongoDocumentPersistentTools
						.convertList((List<? extends MongoPersistentDocument>) getRoles()));
		return dobj;
	}

	protected GrantedAuthority getGrantedAuthority(UserRole userRole) {
		if (GrantedAuthority.class.isAssignableFrom(userRole.getClass()))
			return (GrantedAuthority) userRole;
		else
			return null;
	}

	@Override
	public void addRole(UserRole grantedAuthority) {
		assert grantedAuthority != null;
		assert MongoDocumentPersistentTools
				.isObjectIsMongoPersistentDocument(grantedAuthority);
		super.addRole(grantedAuthority);
	}
}
