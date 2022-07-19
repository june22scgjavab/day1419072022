package com.infy.pattern.demos;

public class SplitDemo {
	//String[] split("delimiter") 
	public static void main(String[] args) {
	String str="Hello-hi-bye";
	String array[]=str.split("-");
	System.out.println(array.length);//3
	for(String str1 : array)
	{
		System.out.println(str1);
	}
	str="Hello12hi45bye";
	array=str.split("\\d");
	for(String str1 : array)
	{
		System.out.println(str1);
	}
	}

}
