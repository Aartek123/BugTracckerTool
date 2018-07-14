package com.aartek.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.User;

import javassist.bytecode.Descriptor.Iterator;

@Repository
public class LoginRepository {

	@Autowired
	HibernateTemplate ht;
	
	public void CheckRepositoryLogin(User user)
	{
		System.out.println("Welcome To Login Page");
	}
	
	public String findPassword(String email,String psw)
	{
		System.err.println("inside Repository:FindWord()");
		String uemail=null;
		String pass=null;
		String check=null;
		
		List<User> l=ht.find("from User u where u.Email=? and u.Password=?",email,psw);
		java.util.Iterator<User> itr1=l.iterator();
		while(itr1.hasNext())
		{
			User u=(User)itr1.next();
			uemail=u.getEmail();
			pass=u.getPassword();
		//	System.out.println("EmailID: "+uemail);
		}
	
		if(email.equals(uemail) && psw.equals(pass))
		{
			System.out.println("Successfully Login");
			System.out.println("EmailID: "+email);
			check="Valid";
		}
		else
		{
			System.out.println("Not Valid ID and Password");
			check="Not Valid";
		}
		
		//System.out.println(check);
		return check;

	}
	
	
	
}
