package com.infy.pattern.demos;

import java.util.Scanner;

public class PatternDemo3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the email");
		String email=scan.nextLine(); // space
		
		String pattern="([A-Za-z0-9-_]+)[@]([a-z]+)[.](com|in)";
       if(email.matches(pattern))
       {
    	   System.out.println("valid email");
       }
       else
       {
    	   System.out.println("Invalid email");
       }
	}

}
