package com.niit.callMain;

import com.niit.DaoImpl.UserDaoImpl;
import com.niit.Model.User;

public class UserMain {

	public static void main(String[] args)
	{
User u=new User();
    	
    	u.setFirstname("welcome");
        System.out.println( "Hello World!" );
        UserDaoImpl ui=new UserDaoImpl();
        ui.addUser(u);
        ui.show("abc@gmail.com");
	}
}
