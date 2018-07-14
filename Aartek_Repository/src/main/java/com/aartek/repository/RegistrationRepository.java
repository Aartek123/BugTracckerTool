package com.aartek.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.User;

@Repository
public class RegistrationRepository {
	@Autowired
	HibernateTemplate ht;
	
	
	public void RegistrationRepository(User user1)
	{
		System.out.println("Inside Registration Repository");
		System.out.println(user1.getFirstName()+" "+user1.getLastName()+" "+user1.getMobile()+user1.getEmail()+" "+user1.getPassword());
		ht.save(user1);
		System.out.println("Registration is Successfully:");
	}
	public String findEmail(String Email)
	{
		String email=null;
		List<User> l=ht.find("from User u where u.Email=?",Email);
		Iterator<User> itr=l.iterator();
		while(itr.hasNext())
		{
			User u=(User)itr.next();
			email=u.getEmail();
		}
		return email;
	}
	
}

