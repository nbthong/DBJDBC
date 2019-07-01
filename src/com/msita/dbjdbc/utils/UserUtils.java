package com.msita.dbjdbc.utils;

import java.util.ArrayList;

import com.msita.dbjdbc.bo.User;

public class UserUtils {
	
	public static void displayUserList(ArrayList<User> userList) {
		System.out.println(String.format("%-5s%-20s%-20s%10s", "ID", "USERNAME", "PASSWORD", "AGE"));
		System.out.println(new String(new char[55]).replace("\0", "="));
		for (User user : userList) {
			//System.out.println(user.getId()+ " - " + user.getUserName() + " - " + user.getPassword() + " - " + user.getAge());
			System.out.println(String.format("%-5s%-20s%-20s%10d", user.getId(), user.getUserName(), user.getPassword(),user.getAge()));
		}
	}
	
	
	public static void displayUser(User user) {
		//System.out.println(user.getId()+ " - " + user.getUserName() + " - " + user.getPassword() + " - " + user.getAge());
		System.out.println(String.format("%-5s%-20s%-20s%10d", user.getId(), user.getUserName(), user.getPassword(),user.getAge()));
	}
}
