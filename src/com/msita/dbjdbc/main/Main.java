package com.msita.dbjdbc.main;

import java.util.ArrayList;

import com.msita.dbjdbc.bo.User;
import com.msita.dbjdbc.dao.UserDAO;

public class Main {

	public static void main(String[] args) {
		User newUser = new User();
		newUser.setUserName("thong100T");
		newUser.setPassword("thongpass");
		newUser.setAge(57);
		
		UserDAO userDao = new UserDAO();
		
//		ArrayList<User> userList = userDao.getAllUser();
//		System.out.println("size: " + userList.size());
		
		newUser = userDao.addUser(newUser);
		
		System.out.println("Id: " + newUser.getId());
		System.out.println("UserName: " + newUser.getUserName());
		System.out.println("PassWord: " + newUser.getPassword());
		System.out.println("Age " + newUser.getAge());
	}

}
