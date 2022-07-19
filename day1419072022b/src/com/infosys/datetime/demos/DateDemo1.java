package com.infosys.datetime.demos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate dateObj = LocalDate.of(1997, 8, 29); // of() returns the instance of LocalDate
		// with specified arguements
		System.out.println(dateObj); // output : 1997-08-29
		LocalDate dateObj2 = LocalDate.of(1997, 8, 29);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy"); 
		//ofPattern() creates a formatter using the specified pattern.
				
		System.out.println(df.format(dateObj2)); //output 29/08/97

	}

}
