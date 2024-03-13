package com.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Servlet implementation class AuthServlet
 */
@SuppressWarnings("serial")
public class AuthServlet extends HttpServlet {
	private HashMap<String,String> userMap;
	public void init() {
		userMap = new HashMap<>();
		userMap.put("user1", "password1");
		userMap.put("user2", "password2");
		userMap.put("user3", "password3");}
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String result = "name/password do not match";
		if(userMap.containsKey(name) && userMap.get(name).equals(password)) {
			result = "name and Password matches!";
		}
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("auth.jsp");
		rd.forward(request, response);
	}

}
