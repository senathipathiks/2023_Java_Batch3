package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FormValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter p = response.getWriter();
		
//		String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
//		
//		String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";
		
		List<String> usernameList = new ArrayList<String>();
		usernameList.add("sanjay@gmail.com");
		usernameList.add("sanjaykhanna@gmail");
		
		HashMap<String, String> pass = new HashMap<String, String>();
		usernameList.forEach(s -> pass.put(s, "Sanjay@42"));
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(usernameList.contains(userName) && pass.get(userName).equals(password))
			p.println("<h1>Welcome to Home Page</h1>");
		else if (!usernameList.contains(userName))
			p.println("Please Register before login");
		else
			p.println("Please Provide a valid password");
			
		
	}

}
