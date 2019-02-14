package com.servlet1.sr;

import java.util.ArrayList;

import com.chaya.pojo.User;

public class UserDAO {
	
	ArrayList<User> userList;
	
	public UserDAO() {
		userList = new ArrayList<>();
		userList.add(new User("Chaya", "cbk", "Admin"));
		userList.add(new User("kishan", "kis", "User"));
		userList.add(new User("prem", "prem", "Admin"));
	}
	
	public String getUserType(String userName, String password) {
		for(User user:userList) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				return user. getUserType();
			}
		}
		throw new InvalidException("User Name and Password doesnt exists");
	}

}