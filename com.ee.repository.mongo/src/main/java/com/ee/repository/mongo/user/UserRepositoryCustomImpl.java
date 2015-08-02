package com.ee.repository.mongo.user;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ee.domain.mongo.MongoPersistentDocumentsConfiguration;
import com.ee.domain.mongo.user.DefaultMongoUser;
import com.ee.domain.user.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class UserRepositoryCustomImpl implements UserRepositoryCustom {

	@Autowired
	private MongoDbFactory dbFactory;

	@Autowired
	private UserRepository repository;

	@Autowired
	private MongoOperations mongoTemplate;

	@Autowired
	private MongoPersistentDocumentsConfiguration configuration;

	public UserRepositoryCustomImpl() {
		super();
	}

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return (UserDetails) repository.findUserByUsername(username);
	}

	public List<User> findUserByLastNameAndFirstName(String lastName,
			String firstName, Sort sort) {
		BasicDBObject dobj = new BasicDBObject();
		if (lastName != null && lastName.trim().length() > 0)
			dobj.put("person.personData.lastName", lastName);
		if (firstName != null && firstName.trim().length() > 0)
			dobj.put("person.personData.firstName", firstName);
		String cName = configuration
				.getCollectionNameForClass(DefaultMongoUser.class);

		assert cName != null && cName.trim().length() > 0;

		final DBCursor cursor = dbFactory.getDb().getCollection(cName)
				.find(dobj);
		List<User> list = new LinkedList<User>();
		while (cursor.hasNext()) {
			DBObject dObj = cursor.next();
			DefaultMongoUser user = new DefaultMongoUser(dObj);
			list.add(user);
		}
		return list;

	}

	private Query getQuery(UserFilter filter) {
		assert filter != null;
		Criteria criteria = new Criteria();
		if (filter.getLastName() != null)
			criteria.andOperator(Criteria.where("lastName").regex(
					filter.getLastName()));
		if (filter.getFirstName() != null)
			criteria.andOperator(Criteria.where("firstName").regex(
					filter.getFirstName()));
		if (filter.getMiddleName() != null)
			criteria.andOperator(Criteria.where("middleName").regex(
					filter.getMiddleName()));

		if (filter.getBirthDateFrom() != null)
			criteria.andOperator(Criteria.where("birthDate").gte(
					filter.getBirthDateFrom()));

		if (filter.getBirthDateTo() != null)
			criteria.andOperator(Criteria.where("birthDate").lte(
					filter.getBirthDateTo()));

		criteria.andOperator(Criteria.where("gender").is(filter.getGender()));

		return new Query(criteria);
	}

	@Override
	public List<User> findUsers(UserFilter filter) {
		Query query = getQuery(filter);
		return mongoTemplate.find(query, User.class);
	}
}
