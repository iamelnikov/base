package com.ee.repository.mongo.user;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.ee.domain.user.User;

public interface UserRepositoryCustom {

	public List<User> findUserByLastNameAndFirstName(String lastName, String firstName, Sort sort);
	
	public List<User> findUsers(UserFilter filter);
	
}
