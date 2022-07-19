package com.infy.pattern.demos;

public class PatternDemo4 {
// . is replaced by any character 
	
	public static void main(String[] args) {
		String pattern=".*";
		String str="Hello1@";
		String str2="";
		System.out.println(str.matches(pattern));
        System.out.println(str2.matches(pattern));
        System.out.println(str2.isEmpty());
        System.out.println(str.isEmpty());
	}

}
