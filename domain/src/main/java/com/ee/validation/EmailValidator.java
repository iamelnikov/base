package com.ee.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.ee.domain.user.User;

public class EmailValidator implements ConstraintValidator<Email, User> {
	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public EmailValidator() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	@Override
	public void initialize(Email constraintAnnotation) {
	}

	@Override
	public boolean isValid(User value, ConstraintValidatorContext context) {
		if (value == null || value.getEmail() == null
				|| value.getEmail().trim().length() == 0)
			return false;
		matcher = pattern.matcher(value.getEmail());
		return matcher.matches();
	}
}
