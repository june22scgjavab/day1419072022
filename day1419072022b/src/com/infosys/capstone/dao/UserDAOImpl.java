package com.infosys.capstone.dao;

import com.infosys.capstone.model.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public User validate(String username) {
		System.out.println("I am in the validate method of the DAO layer");
	  return null;
	}

}
