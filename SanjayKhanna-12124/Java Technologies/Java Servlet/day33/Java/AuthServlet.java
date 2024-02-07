package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static  HashMap<String, String> map;
	
	@Override
	public void init() throws ServletException {
		map = new HashMap<String, String>();
		map.put("sanjay@gmail.com", "Sanjay@42");
		map.put("sanjaykhanna@gmail.com", "sanjayrugby");
		map.put("subra2001mani@gmail.com", "sam@6383587926");
		
	}
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = request.getRequestDispatcher("UserInput.jsp");
		
		if(map.keySet().contains(username) && map.get(username).equals(password)) {
			rd.include(request, response);
			out.println("<h3>Login Successfully</h3>");
		}
		else if(!map.keySet().contains(username)){
			rd.include(request, response);
			out.println("<h3>Invalid UserName</h3>");
		}
		else {
			rd.include(request, response);
			out.println("<h3>Invalid Password</h3>");
		}
		
	}

}
