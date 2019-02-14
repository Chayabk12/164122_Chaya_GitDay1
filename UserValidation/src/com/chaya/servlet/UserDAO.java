package com.chaya.servlet;

import java.util.ArrayList;

import com.servlet.pojo.User;

public class UserDAO implements IUserDAO
{
    ArrayList<User> userList;
	
	public UserDAO() {
		userList = new ArrayList<>();
		userList.add(new User("Chaya", "chaya", "Admin"));
		userList.add(new User("Rashmi", "rashmi", "User"));
		userList.add(new User("Madhuri", "java", "Admin"));
	}
	
	public String getUserType(String userName, String password) {
		for(User user:userList) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				return user.getUserType();
			}
		}
		throw new InvalidUserException("User Name and Password doesnt exists...");
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String userName, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(String userName) {
		// TODO Auto-generated method stub
		
	}

//	
}
