package com.Aartek.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController 
{
	@RequestMapping(value="/logout")
	public void CheckLogOut(HttpServletRequest request,HttpServletResponse res) throws IOException
	{
		System.out.println("Inside Logout Controller");/*
		User user=(User)request.getSession().getAttribute("Users");*/
		
		request.getSession().removeAttribute("Users");
		res.sendRedirect("userSignIn.do");
			
	}

}
