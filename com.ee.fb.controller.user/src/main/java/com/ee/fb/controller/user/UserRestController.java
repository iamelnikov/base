package com.ee.fb.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ee.domain.mongo.user.DefaultMongoUser;
import com.ee.service.mongo.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/signup", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.CREATED)
	public void signUpUser(@RequestBody DefaultMongoUser user) {
		userService.signUpUser(user);
	}
	
	

}
