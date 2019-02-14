package com.chaya.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servlet.pojo.User;

public class UserDAOVer2 implements IUserDAO 
{

	@Override
	public String getUserType(String userName, String password) {
	Connection connection = ConnectionFactory.getConnection();
	try{
	PreparedStatement statement= connection
			.prepareStatement("select * from user_table where username=? and password=?");
	statement.setString(1, userName);
	statement.setString(2, password);
	ResultSet set=statement.executeQuery();
	while(set.next())
	{
		if(set.getString("userName").equals(userName) && set.getString("password").equals(password))
        return set.getString("userType");
	}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
		
	}
	return  "invalid";
	}

	@Override
	public void addUser(User user) {
		
	}

	@Override
	public void changePassword(String userName, String password) {
	
		
	}

	@Override
	public void removeUser(String userName) {
		
		
	}
	 public static void main(String[] args)
	 {
	System.out.println(new UserDAOVer2().getUserType("Chaya", "chaya"));	
	}

}
