package com.infosys.enums.demos;
// Enumerations are group of named constants. All enums implicitly extend the java.lang.Enum class.
// The enum fields are implicitly static and final, and hence are constant during compile time.
//But they are instances of their enum type, constructed when the enum type is referenced for the first time.
// For SMALL the value is 0
// For Medium the value is 1
// For LARGE the value is 2
// So do we need to work with the value as 0 , 1 and 2 only
// No

public enum PizzaSize2 {
	SMALL(6), MEDIUM(12), LARGE(18);
	private int value;
	PizzaSize2(int value) {
		this.value=value;
		System.out.println("I am called");
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}



}
