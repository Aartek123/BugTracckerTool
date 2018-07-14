package com.Aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.User;

@Component
public class LoginValidator implements Validator {


	public boolean supports(Class<?> clazz) {

		return User.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		User user = (User) target;
		ValidationUtils.rejectIfEmpty(errors, "Password","error.Password.empty");

		/* Email Validation */
		String EmailCheck = ValidationUtil.EmailChecker(user.getEmail());
		if (!user.getEmail().equals("")) {
			if (EmailCheck.equals("InValid")) {
				errors.rejectValue("Email","error.Email.format");
			}
		} else {
			errors.rejectValue("Email","error.Email.empty");
		}
		/*****************************************************************************************************************/

	}

}
