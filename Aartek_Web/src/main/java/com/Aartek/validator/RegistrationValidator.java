package com.Aartek.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.aartek.model.User;
import com.aartek.repository.RegistrationRepository;

@Component
public class RegistrationValidator implements Validator {
	@Autowired
	private RegistrationRepository regrep;

	public boolean supports(Class<?> clazz) {

		return User.class.isAssignableFrom(clazz);

	}

	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		/* Email Validation */
		String EmailCheck = ValidationUtil.EmailChecker(user.getEmail());
		if (!user.getEmail().equals("")) 
		{
			if (EmailCheck.equals("InValid")) {
				errors.rejectValue("Email","error.Email.format");
			} else {
				String Emailid = regrep.findEmail(user.getEmail());
				if (user.getEmail().equals(Emailid) == true) {
					errors.rejectValue("Email","error.Email.exists");
				}
			}
		} else {
			errors.rejectValue("Email","error.Email.empty");
		}
		/*****************************************************************************************************************/

		/* First Name */
		if (!user.getFirstName().equals("")) {
			if (user.getFirstName().length() > 50/* ||user.getEmail().matches("[0-9]")==true */) {
				errors.rejectValue("FirstName","error.FirstName.length");
			}
		} else {
			errors.rejectValue("FirstName","error.FirstName.empty");
		}

		/*****************************************************************************************************************/

		/* Last Name */
		if (!user.getLastName().equals("")) {
			if (user.getLastName().length() > 50) {
				errors.rejectValue("LastName","error.LastName.length");
			}
		} else {
			errors.rejectValue("LastName","error.LastName.empty");
		}

		/*****************************************************************************************************************/
		
		/*Mobile*/
		
		if (user.getMobile() != null) {
			System.out.println(user.getMobile());
			if (user.getMobile().toString().length() != 10) {
				System.out.println("le " + user.getMobile());
				errors.rejectValue("Mobile","error.Mobile.length");
			}
		} else {
			errors.rejectValue("Mobile","error.Mobile.empty");
		}

		/*****************************************************************************************************************/

		/* Password */
		String PasswordChecker = ValidationUtil.PasswordChecker(user.getPassword());
		if (!user.getPassword().equals("")) {
			if (PasswordChecker.equals("InValid")) {
				errors.rejectValue("Password","error.Password.format");
			}
		} else {
			errors.rejectValue("Password","error.Password.empty");
		}
		
		/*****************************************************************************************************************/

	}

}
