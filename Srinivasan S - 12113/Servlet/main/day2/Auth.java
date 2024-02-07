package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Servlet implementation class Auth
 */
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static HashMap<String, String>map=new HashMap<String, String>();
	public Auth(){
		
		
		map.put("Srini25","Srini@123");
		map.put("Sundar18","Sundar@18");
		map.put("Prashanth03","Prashanth@03");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		
		if(map.containsKey(name)&& map.containsValue(password)) {
			RequestDispatcher rd=request.getRequestDispatcher("Registration.jsp");
			rd.include(request, response);
			out.println("<h1>Validation succeed</h1>");
			
		}
		else
			out.println("<h1>Validation failed</h1>");
		
		
		}

}
