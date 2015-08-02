package com.ee.repository.mongo.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.ee.domain.user.User;

public interface UserRepository extends UserDetailsService,
		UserRepositoryCustom, CrudRepository<User, String> {

	public User findUserByUsername(String userName);

	public User findUserByEmail(String email);
	
}
