package com.servlet1.sr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/Validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  ;
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		   String userName;
		   String password;
		PrintWriter out = response.getWriter();
		userName= request.getParameter("username");
		password = request.getParameter("password");
		String Usertype= "invalid";
		
		
		try{
			Usertype=getUserType(userName, password);
		}
		catch(InvalidException e)
		{
			out.print("<h1> invalid user</h1>");
		}
		RequestDispatcher requestdispatcher= null; 
		
		if(Usertype.equals("Admin"))
		{
		   requestdispatcher=request.getRequestDispatcher("/admin");
		}
		else if(Usertype.equals("User"))
		{
			requestdispatcher = request.getRequestDispatcher("/user");
			out.print("Welcome User"+ userName);
		}
		else
		{
			requestdispatcher=request.getRequestDispatcher("/invalid_user");
		}
		
		requestdispatcher.forward(request, response);
	}

	private String getUserType(String userName, String password) {
		UserDAO dao= new UserDAO();
		return dao.getUserType(userName, password);
	}


}
