package com.infy.validator;

import com.infy.model.Person;
// Boolean b;
// The default value for above line will be null as
// it is of reference type;
// boolean b; // primitive type
// The default value is false
// Boolean b=true;  // Autoboxing 

public class Validator {

	public static Boolean validate(Person person)
	{
		if(ValidateName(person.getName()) && ValidateGender(person.getGender())){
			return true;
		}
		return false;
	}
  // I need to check whether the gender is M or F
	private static boolean ValidateGender(char gender) {
		if(gender =='M'||gender=='F')
		{
			return true;
		}
		return false;
	}

	private static boolean ValidateName(String name) {
		/* for(int i=0;i<name.length();i++) {
			/* if(!((name.charAt(i)>='a' && name.charAt(i)<='z') || (name.charAt(i)>='A' && name.charAt(i)<='Z')))
			{
				return false;
			} 
			
		}*/
		/*
		 * for(int i=0;i<name.length();i++) {
		 * if(!Character.isAlphabetic(name.charAt(i))) { return false; }
		 *   return false;
		 * }
		 */
		String nameRegex = "([A-Za-z ]+)"; 
		if(!name.matches(nameRegex)) {
			return false;
		}
		
		
		return true;
	}
}
