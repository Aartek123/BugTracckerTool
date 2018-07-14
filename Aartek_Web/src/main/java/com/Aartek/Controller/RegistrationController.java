package com.Aartek.Controller;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Aartek.Service.RegistrationService;
import com.Aartek.validator.RegistrationValidator;
import com.aartek.model.User;

@Controller
public class RegistrationController 
{
	@Autowired
	private RegistrationValidator rv;
	@Autowired
	private RegistrationService rs;
	
/*	@RequestMapping("/SignUp")
	public String showLogin(Map<String,Object> map)
	{
		System.out.println("Inside Registration Controller");
		
		
		map.put("userRegistrationMap", new User());
			return "registration";
	}
	
	@RequestMapping("/userSignUp")
	public String RegistrationAction(@ModelAttribute("userRegistrationMap") User user1, BindingResult result)
	{
		rv.validate(user1, result);
		if(result.hasErrors())
		{
		    return "registration";
		}
		//else
	//	{
			System.out.println(user1.getFirstName()+" "+user1.getLastName()+" "+user1.getMobile()+user1.getEmail()+" "+user1.getPassword());
			rs.RegistrationService(user1);
		    return "hello";
		 //}
	}
*/	

@RequestMapping("/SignUp")
public String RegistrationAction(@ModelAttribute("userRegistrationMap") User user, BindingResult result,HttpServletRequest request,Map<String,Object> map)
{
	
	if("post".equals(request.getMethod().toLowerCase()))
	{
		rv.validate(user, result);
		if(result.hasErrors())
		{
		    return "SignUp";
		}
		else
		{
			rs.RegistrationService(user);
		    return "hello";
		 }
	}
	map.put("userRegistrationMap",user);
	return "SignUp";
}
}
