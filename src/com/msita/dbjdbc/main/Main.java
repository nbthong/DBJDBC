package com.msita.dbjdbc.main;

import java.util.ArrayList;

import com.msita.dbjdbc.bo.User;
import com.msita.dbjdbc.dao.UserDAO;

public class Main {

	public static void main(String[] args) {
		
		
		UserDAO userDao = new UserDAO();
		
		// insert new user into database.
		User newUser = new User();
		newUser.setUserName("thong100T");
		newUser.setPassword("thongpass");
		newUser.setAge(57);
		newUser = userDao.addUser(newUser);	
		
		// get all user in database.
		
		ArrayList<User> userList = userDao.getAllUser();
		System.out.println("size: " + userList.size());
		
		
	}

}
