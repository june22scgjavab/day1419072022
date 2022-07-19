package com.infosys.datetime.demos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDemo3 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate newDateObj = today.minusWeeks(39);
		System.out.println(today);  //2022-07-19
		System.out.println(newDateObj);//
		//2021-10-19
		System.out.println(ChronoUnit.DAYS.between(newDateObj,today));  //273
		//between() calculates the amount of time between specified date objects
		System.out.println(ChronoUnit.MONTHS.between(newDateObj,today)); //8
		//compareTo() compares this date with specified date
		System.out.println(newDateObj.compareTo(today)); //-1 
		System.out.println(today.compareTo(newDateObj)); // 1
	}
	

}
