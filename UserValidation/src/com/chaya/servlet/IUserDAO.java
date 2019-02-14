package com.chaya.servlet;

import com.servlet.pojo.User;

public interface IUserDAO 
{
  public String getUserType(String userName, String password);
  public void addUser(User user);
  public void changePassword(String userName, String password);
public void removeUser(String userName );
  
}
