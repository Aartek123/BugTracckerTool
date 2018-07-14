package com.Aartek.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.User;
import com.aartek.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginrepo;
	
	
	public String CheckServiceLogin(User user)
	{
		
		System.out.println("Inside Service");
		
		String check=loginrepo.findPassword(user.getEmail(),user.getPassword());
		if(check.equals("Valid"))
		{
			//System.out.println(check);
			
			return check;
		}
		else
		{

			//System.out.println(check);
			return "check";
		}
	}
}
