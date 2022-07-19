package com.infy.pattern.demos;

public class PatternDemo5 {

	public static void main(String[] args) {
		//String pattern="([^0-9]+)";
		String pattern="\\D+";
		String str="hello";
		System.out.println(str.matches(pattern));
		String str2="h123f";
		System.out.println(str2.matches(pattern));
		String pattern2="\\w+";
		String str3="-abc";
		System.out.println(str3.matches(pattern2));
		String searchStr = "App";
		String regexStr = "App.*";
		System.out.println(searchStr.matches(regexStr));   
		String repeatRegex = "([A-Za-z0-9]+) (\\d+) ([A-Z]+) [:] \\1 \\2";
		String repeatStr = "Pom123 9090 JERRY : Pom123 9090";//Output: true
       System.out.println(repeatStr.matches(repeatRegex));
	}

}
