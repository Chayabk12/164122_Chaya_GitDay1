package com.chaya.util;

import com.chaya.servlet.IUserDAO;
import com.chaya.servlet.UserDAO;
import com.chaya.servlet.UserDAOVer2;

public class DAOUtility 
{
 public static IUserDAO getUserDAO()
 {
	 return new UserDAOVer2(); 
 }
}
