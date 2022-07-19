package com.infosys.capstone.service;

import com.infosys.capstone.dao.UserDAO;
import com.infosys.capstone.dao.UserDAOImpl;
import com.infosys.capstone.model.User;
// All the logic for the requirements 
public class UserServiceImpl implements UserService {

	private UserDAO userDAO=new UserDAOImpl();
	@Override
	public boolean validate(User user) {
		System.out.println("I am in validate method");
	    userDAO.validate(user.getUserName());
		return false;
	}

}
