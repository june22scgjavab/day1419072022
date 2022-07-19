package com.infosys.enums.demos;

public class StudentApplication {

	public static void main(String[] args) {
		
		//StudentResult studentResult=new StudentResult(1,"Ram",Grade.GOOD);
		Grade grade=Grade.GOOD;
		StudentResult studentResult=new StudentResult(1,"Ram",grade);
		System.out.println(studentResult.showRemarks());
		
	}

}
