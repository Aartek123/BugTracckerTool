package com.Aartek.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil 
{
	private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	private static Pattern pattern;
	private static Matcher matcher;
	private static final String pwd = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
	
	public static String EmailChecker(String Email)
	{
		String EmailCheck="InValid";
		pattern = Pattern.compile(EMAIL_REGEX,Pattern.CASE_INSENSITIVE);
		matcher=pattern.matcher(Email);
		if(matcher.matches()==true)
		{
			EmailCheck="Valid";
			return EmailCheck; 
		}
		else
		{
			return EmailCheck;
		}
	}
	
	
	public static String PasswordChecker(String Password)
	{
		String PasswordCheck="InValid";
		pattern=Pattern.compile(pwd);
		matcher =pattern.matcher(Password);
		if(matcher.matches()==true)
		{
			PasswordCheck="Valid";
			return PasswordCheck; 
		}
		else
		{
			return PasswordCheck;
		}
	}

}
