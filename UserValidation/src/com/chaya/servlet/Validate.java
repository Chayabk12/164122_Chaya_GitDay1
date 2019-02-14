package com.chaya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chaya.util.DAOUtility;

@WebServlet("/validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName, password;
		PrintWriter out = response.getWriter();

		userName = request.getParameter("userName");
		password = request.getParameter("password");
		String userType = "invalid";

		
			userType = getUserType(userName, password);
		System.out.println(userType);

		RequestDispatcher requestDispatcher = null;

		if (userType.equals("Admin")) {
			requestDispatcher = request.getRequestDispatcher("/admin");
			out.print("<h1>Welcome Admin  " + userName + "</h1>");
		} else if (userType.equals("User")) 
		{
			requestDispatcher = request.getRequestDispatcher("/user");
			out.print("<h1>Welcome User  " + userName + "</h1>");
		} else {
			requestDispatcher = request.getRequestDispatcher("/invalid");
			out.print("<h1>Invalid User</h1>");
		}

		requestDispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private String getUserType(String userName, String password) {
		IUserDAO dao = DAOUtility.getUserDAO();     // WE are making abstraction by using utility class here.
		return dao.getUserType(userName, password);
	}

}