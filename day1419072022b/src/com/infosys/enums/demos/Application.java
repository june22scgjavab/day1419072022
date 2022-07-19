package com.infosys.enums.demos;

public class Application {

	public static void main(String[] args) {
		Pizza pizza=new Pizza();
		PizzaSize2 size=PizzaSize2.LARGE;
		System.out.println(size.ordinal());  //2
        System.out.println(size.name());     // LARGE
        System.out.println(size.getValue());  //18
        size=PizzaSize2.SMALL;
        System.out.println(size.ordinal());  //0
        System.out.println(size.name());     // SMALL
        System.out.println(size.getValue()); // 6
        size=PizzaSize2.MEDIUM;
        System.out.println(size.ordinal());  //1
        System.out.println(size.name());     // MEDIUM
        System.out.println(size.getValue()); // 12
        
        
          for(PizzaSize2 p :PizzaSize2.values())
        {
        	System.out.println(p.ordinal()+" "+p.name()+" "+p.getValue()+" "+p);
        } 
          System.out.println("The Pizza Details");
          pizza.setId(1);
          PizzaSize2 size1=PizzaSize2.LARGE;
          pizza.setSize(size1);
          pizza.setSize(PizzaSize2.LARGE);
          pizza.setName("Paneer Pizza");
          System.out.println(pizza.getId());
          System.out.println(pizza.getName());
          System.out.println(pizza.getSize());
	}
}
