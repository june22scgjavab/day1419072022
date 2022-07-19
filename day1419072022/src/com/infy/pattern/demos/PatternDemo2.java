package com.infy.pattern.demos;

import java.util.Scanner;

public class PatternDemo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scan.nextLine(); // space
		String pattern="([A-Za-z ]+)";
       if(name.matches(pattern))
       {
    	   System.out.println("valid name");
       }
       else
       {
    	   System.out.println("Invalid name");
       }
	}

}
