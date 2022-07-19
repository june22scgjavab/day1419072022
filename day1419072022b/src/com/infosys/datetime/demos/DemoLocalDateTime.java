package com.infosys.datetime.demos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MMM/yyyy ,  hh:mm:ss a"); 
		System.out.println(df.format(now));
	}

}
