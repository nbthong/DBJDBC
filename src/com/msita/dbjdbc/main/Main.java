package com.msita.dbjdbc.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.msita.dbjdbc.bo.User;
import com.msita.dbjdbc.dao.UserDAO;
import com.msita.dbjdbc.utils.UserUtils;

public class Main {

	public static void main(String[] args) {
		
		UserDAO userDao = new UserDAO();
		Scanner scanner = new Scanner(System.in);
		boolean isContinue = true;
		while (isContinue){
			System.out.println("=================================================");
			// nhập username
			System.out.print("Enter username: ");
			String username = scanner.nextLine();
			
			// tìm user bằng username vừa nhập
			ArrayList<User> userList = userDao.findUserByUsername(username);
			// TODO
			
			// Nếu không tìm thấy: nhập vào các thông tin cần thiết và tạo mới một user và insert vào Database
			if(userList.size() == 0) {
				System.out.println("No record found");
				
				// Nhập username
				System.out.print("Enter new username: ");
				String newUsername = scanner.nextLine();
				
				// Nhập password
				System.out.print("Enter new password: ");
				String newPassword = scanner.nextLine();
				
				// Nhập password
				System.out.print("Enter new age: ");
				int newAge = scanner.nextInt();
				
				User newUser = new User();
				// set dữ liệu cho newUser
				// TODO
				
				// Gọi userDAO để thêm mới một user vào database
				// TODO
				System.out.println("Insert successfully!");
			}
			
			// Nếu chỉ có 1 user: thì nhập password mới từ bàn phím và update password cho user trong database.
			if(userList.size() == 1) {
				// Hiển thị kết quả của user tìm được: id - username - password - age
				// TODO
				
				// Nhập password mới
				System.out.print("Enter new password: ");
				String newPassword = scanner.nextLine();
				
				// Gọi userDAO để cập nhật password mới cho user
				// TODO
				
				System.out.println("Update successfully!");
			}
			
			// Nếu có hơn nhiều hơn 1 user: thì xóa hết trong database chỉ giữ lại user đầu tiên.
			if (userList.size() > 1){
				// Hiển thị kết quả của tất cả user tìm được: id - username - password - age
				// TODO
				
				// Gọi userDAO để xóa user thứ 2 đến thứ N của listUser trong database.
				// TODO
				System.out.println("Delete successfully!");
			}
			
			// Có tiếp tục làm việc không?
			scanner = new Scanner(System.in);
			System.out.print("Continue (Y/N): ");
			String result = scanner.nextLine();
			isContinue = "Y".equalsIgnoreCase(result);
		}
		scanner.close();
		
	}

}
