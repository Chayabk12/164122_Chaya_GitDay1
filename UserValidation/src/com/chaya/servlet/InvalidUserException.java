package com.chaya.servlet;

public class InvalidUserException extends RuntimeException {
	public InvalidUserException(String msg)
	{
		super(msg);
	}

}
