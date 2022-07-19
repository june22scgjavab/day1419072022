package com.infosys.datetime.demos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo4 {

	public static void main(String[] args) {
		//String strDate="12Jan2022";
		String strDate1="Feb,2022-12";
       // DateTimeFormatter df=DateTimeFormatter.ofPattern("ddMMMyyyy");
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("MMM,yyyy-dd");
        LocalDate date=LocalDate.parse(strDate1,df1);
        System.out.println(date);
	}

}
