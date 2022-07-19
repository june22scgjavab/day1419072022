package com.infosys.capstone.service;

import com.infosys.capstone.model.User;

public interface UserService {
  boolean validate(User user);
}