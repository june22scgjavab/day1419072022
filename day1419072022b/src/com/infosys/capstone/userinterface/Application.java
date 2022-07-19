package com.infosys.capstone.userinterface;


//              User                    String
//Application-------------->Service----------------->DAO
//                                      User

import com.infosys.capstone.model.User;
import com.infosys.capstone.service.UserService;
import com.infosys.capstone.service.UserServiceImpl;

public class Application {

	public static void main(String[] args) {
      
     System.out.println("Welcome to my application");
     UserService userService=new UserServiceImpl();
     User user=new User("admin","admin");
     userService.validate(user);
	}

}
