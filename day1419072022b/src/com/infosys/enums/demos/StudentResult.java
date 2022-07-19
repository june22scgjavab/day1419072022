package com.infosys.enums.demos;

public class StudentResult {
	private int roll;
	private String name;
	private Grade grade;

	public StudentResult(int roll, String name, Grade grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.grade = grade;
	}

	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the grade
	 */
	public Grade getGrade() {
		return grade;
	}

	public String showRemarks() {
		// Remarks will be based on Grade
		// We are planning for switch case
		String remarks = "";
		switch (grade) {
		case POOR:
			remarks = "Work Hard";
			break;
		case GOOD:
			remarks = "You can do better";
			break;
		case EXCELLANT:
			remarks = "Well Done";
		}
       return remarks;
	}

}
