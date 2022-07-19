package com.infosys.datetime.demos;

import java.time.LocalDate;

public class DateDemo2 {

	public static void main(String[] args) {
		LocalDate newDate = LocalDate.now();
		System.out.println(newDate);
		//newDate = newDate.plusDays(4); 
		//System.out.println(newDate);   
				
		//newDate = newDate.plusYears(5); 
		//System.out.println(newDate); 		
		newDate = newDate.minusWeeks(1);
		System.out.println(newDate);

	}

}
