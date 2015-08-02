package com.ee.service.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.ee.domain.contacts.Contact;
import com.ee.domain.person.Person;
import com.ee.domain.user.User;
import com.ee.repository.mongo.person.PersonRepository;
import com.ee.repository.mongo.user.UserRepository;

@Service
public class PersonService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PersonRepository personRepository;

	private String getAuthenticatedUserName() {
		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		assert auth != null;
		final String name = auth.getName();
		assert name != null && name.trim().length() > 0;
		return name;
	}

	@PreAuthorize("isAuthenticated()")
	public Person getPerson() {
		final String uName = getAuthenticatedUserName();
		User user = userRepository.findUserByUsername(uName);
		assert user != null && user.getPerson() != null;
		return user.getPerson();
	};

	@PreAuthorize("isAuthenticated()")
	public List<Contact> getContacts() {
		Person person = getPerson();
		return person.getContacts();
	}

	@PreAuthorize("permitAll")
	public Person getPerson(String userName) {
		assert userName != null;
		User user = userRepository.findUserByUsername(userName);
		assert user != null && user.getPerson() != null;
		return user.getPerson();
	}

	// @PreAuthorize("isAuthenticated()")
	// public List<Contact> getContacts(String userName) {
	// // TODO
	// return null;
	// }
	//
	// public void saveContacts(List<Contact> contacts) {
	// if (contacts!=null && !contacts.isEmpty()) {
	// final String userName = getAuthenticatedUserName();
	//
	// }
	// }

}
