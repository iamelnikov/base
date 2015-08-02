package com.ee.service.mongo;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ee.domain.mongo.user.AbstractMongoUser;
import com.ee.domain.mongo.user.DefaultMongoUser;
import com.ee.domain.user.User;
import com.ee.repository.mongo.user.UserFilter;
import com.ee.repository.mongo.user.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private PasswordEncoder encoder;

	private static final int DEFAULT_PASSWORD_LENGTH = 16;

	public UserService() {

	}

	@PreAuthorize("isAnonymous()")
	public void signUpUser(User user) {
		assert user != null;
		repository.save(user);
	}

	@PreAuthorize("isAuthenticated() && #user.userName == authentication.name")
	public void saveUser(User user) {
		assert user != null;
		repository.save(user);
	}
	
	@PreAuthorize("isAuthenticated() && hasRole('admin')")
	public void saveUserByAdmin(User user) {
		assert user != null;
		repository.save(user);
	}

	
	public User findUserByEmail(String email) {
		return repository.findUserByEmail(email);
	}

	public List<User> findUsers(UserFilter filter) {
		assert filter != null;
		return repository.findUsers(filter);
	}

	public void blockUser(String userName) {
		assert userName != null;
		final User user = repository.findUserByUsername(userName);
		user.blockUser();
	}

	public void disableUser(String userName) {
		assert userName != null;

		final User user = repository.findUserByUsername(userName);
		if (user == null)
			throw new RuntimeException();

		assert AbstractMongoUser.class.isAssignableFrom(user.getClass());

		((AbstractMongoUser) user).disableUser();
	}

	public void enableUser(String userName) {
		assert userName != null;

		final User user = repository.findUserByUsername(userName);
		if (user == null)
			throw new RuntimeException();

		assert AbstractMongoUser.class.isAssignableFrom(user.getClass());

		((AbstractMongoUser) user).enableUser();
	}

	public void resetPasswordForUser(String userName) {
		assert userName != null;
		final String rPassword = RandomStringUtils
				.random(DEFAULT_PASSWORD_LENGTH);
		assert rPassword != null;
		final String encPassword = encoder.encode(rPassword);
		assert encPassword != null;
		DefaultMongoUser user = (DefaultMongoUser) repository.findUserByUsername(userName);
		user.setPassword(encPassword);
		repository.save(user);
	}
}
