package com.Aartek.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.User;
import com.aartek.repository.RegistrationRepository;

@Service
public class RegistrationService 
{
	@Autowired
	private RegistrationRepository rr;
	public void RegistrationService(User user)
	{
		System.out.println("Inside Registration Service");
		System.out.println(user.getEmail()+" "+user.getPassword());
		rr.RegistrationRepository(user);
	}

}
