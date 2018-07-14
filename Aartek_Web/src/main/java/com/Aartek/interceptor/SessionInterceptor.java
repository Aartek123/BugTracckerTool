package com.Aartek.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.aartek.model.User;
@Component
public class SessionInterceptor extends HandlerInterceptorAdapter 
{

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception 
	{
		System.out.println("Inside Session:After Completion");
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception 
	{
		System.out.println("Inside Session:Post Handler");
		
	}

	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception 
	{
		System.out.println("inside preHandler");
		
		User user=(User)req.getSession().getAttribute("Users");
		if(user==null || user.equals(""))
		{
			//System.out.println("Inside logout session");
			res.sendRedirect("userSignIn.do");
			//req.setAttribute("LogOutMsg","Invalid Session");
			return false;
		}
		return true;
	}
}
