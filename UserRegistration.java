package com.bl.LamdaUserReg;

import java.util.regex.Pattern;

interface Validation {
	public String validate(String regex, String userDetails);
}

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem using lambda");

		Validation isValidFirstName = (pattern, firstName) -> {
			return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
		};
		System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Saikat"));

		Validation isValidLastName = (pattern, lastName) -> {
			return "Last Name is " + Pattern.compile(pattern).matcher(lastName).matches();
		};
		System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Chakraborty"));

		Validation isValidEmail = (pattern, email) -> {
			return "Email is " + Pattern.compile(pattern).matcher(email).matches();
		};
		System.out.println(isValidEmail.validate("^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$",
				"Saikatchakraborty@gmail.com"));
	}
	
}