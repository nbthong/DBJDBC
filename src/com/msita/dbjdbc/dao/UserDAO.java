package com.msita.dbjdbc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.msita.dbjdbc.bo.User;
import com.msita.dbjdbc.utils.ConnectionFactory;

public class UserDAO {
	
	public ArrayList<User> getAllUser(){
		ArrayList<User> userList = new ArrayList<User>();
		Connection connection = ConnectionFactory.getConnection();	
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
			while (resultSet.next()) {
				userList.add(convertToUser(resultSet));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userList;
	}
	public User addUser(User user){
		Connection connection = ConnectionFactory.getConnection();	
		String insertSQL = "INSERT INTO user (username,password,age) VALUES (?,?,?)";
		String[] returnId = { "ID" };
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertSQL, returnId);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setInt(3, user.getAge());
			preparedStatement.executeUpdate();
			
	        ResultSet resultSet = preparedStatement.getGeneratedKeys();
	        
	        if (resultSet.next()) {
	        	user.setId(resultSet.getInt(1));
	        }
	        
	        if (resultSet != null) {
                resultSet.close();
            }

            if (preparedStatement != null) {
            	preparedStatement.close();
            }

            if (connection != null) {
            	connection.close();
            }
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return user;
	}
	
	private static User convertToUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt(1));		
		user.setUserName(rs.getString(2));		
		user.setPassword(rs.getString(3));		
		user.setAge(rs.getInt(4));		
		return user;
	}
}
