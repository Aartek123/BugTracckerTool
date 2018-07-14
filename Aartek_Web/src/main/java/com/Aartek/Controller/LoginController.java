package com.Aartek.Controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Aartek.Service.LoginService;
import com.Aartek.validator.LoginValidator;
import com.aartek.model.User;
//Step Number 7=>2.started
@Controller
public class LoginController 
{
	@Autowired
	private LoginValidator lv;
	
	@Autowired
	private LoginService loginservice;
	
	
	/*@RequestMapping("/login")
	public String showLogin(Map<String,Object> map)
	{
		System.out.println("Inside Controller");
		
		
		map.put("userMap", new User());
			return "login";
	}
	
	@RequestMapping(value="/userSignIn",method = RequestMethod.POST)
	public String SingInAction(@ModelAttribute("userMap") User user,BindingResult result)
	{
		lv.validate(user, result);
		if(result.hasErrors())
		{
		    return "login";
		}
		else 
		{
		System.out.println(user.getEmail()+" "+user.getPassword());
		loginservice.CheckServiceLogin(user);
		return "hello";
		}
	}*/
	
	@RequestMapping(value="/userSignIn",method = {RequestMethod.POST,RequestMethod.GET})
	public String LogingAction(@ModelAttribute("userMap") User user,BindingResult result,HttpServletRequest request,HttpServletResponse response,Map<String,Object> map,Model model)
	{
		System.out.println("inside Login Controller:Login Action");
		
		if("post".equals(request.getMethod().toLowerCase()))
		{
			lv.validate(user, result);
			if(result.hasErrors())
			{
			    return "userSignIn";
			}
			else 
			{
				
				String check=loginservice.CheckServiceLogin(user);
				if(check.equals("Valid"))
				{
					try
					{
						request.getSession().setAttribute("Users",user);
						response.sendRedirect("product.do");
					}
					catch(Exception e)
					{
						System.out.println("something wrong");
					}
				}
				else
				{
					return "userSignIn";
				}
				
			}
		}
		//map.put("userMap",user);
		model.addAttribute("userMap",user);
		return "userSignIn";
	}
	
}
