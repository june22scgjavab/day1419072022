package com.infy.pattern.demos;

import java.util.regex.Pattern;

public class PatternDemo1 {

	public static void main(String[] args) {
		// Creating a Pattern through Regular Expression
		String regex = "Hello";
		// String to be compared with RegEx
		String input = "Hello";

		// Pattern Matching done using matches() method
		System.out.println(input.matches(regex));
		// Pattern Matching done using Pattern.matches() method
		System.out.println(Pattern.matches(regex, input));
		/**
		 * Output: true, true
		 */

	}

}
