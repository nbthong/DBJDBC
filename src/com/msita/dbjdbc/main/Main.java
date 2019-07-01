package com.msita.dbjdbc.main;

import java.util.ArrayList;

import com.msita.dbjdbc.bo.User;
import com.msita.dbjdbc.dao.UserDAO;
import com.msita.dbjdbc.utils.UserUtils;

public class Main {

	public static void main(String[] args) {
		
		UserDAO userDao = new UserDAO();
		
		// getAllUser
//		 ArrayList<User> userList = userDao.getAllUser();
//		 UserUtils.displayUserList(userList);

		
		// insert new user into database.
//		User newUser = new User();
//		newUser.setUserName("thongAxon");
//		newUser.setPassword("passOfThong");
//		newUser.setAge(42);
		
//		userDao.addUser(newUser);
		
//		userDao.addUserViaPreparedStatement(newUser);
//		newUser = userDao.addUserViaPreparedStatementReturnId(newUser);
//		UserUtils.displayUser(newUser);
		
	}

}
