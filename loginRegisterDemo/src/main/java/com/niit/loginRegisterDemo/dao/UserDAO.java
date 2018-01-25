package com.niit.loginRegisterDemo.dao;

import com.niit.loginRegisterDemo.model.Login;
import com.niit.loginRegisterDemo.model.User;

public interface UserDAO {
	  void register(User user);
	  User validateUser(Login login);
}
