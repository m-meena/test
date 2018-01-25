package com.niit.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import com.niit.Dao.UserDao;
import com.niit.Model.User;

public class UserDaoImpl implements UserDao{

	List<User> l;
	public void addUser(User u) {
	
	l=new ArrayList<User>();
	l.add(u);
	
	for(User c:l)
		System.out.println(c.getFirstname());
	}
	
	public void show(String email)
	{
		User u=new User();
		u.setEmail(email);
		
		System.out.println(u.getEmail());
	}

}
