package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("Ram", "RamRanjitha");
		map.put("Ranjitha", "RanjithaRam");

		String uname = request.getParameter("name");
		String pwd = request.getParameter("pass");

		RequestDispatcher rd = request.getRequestDispatcher("AuthServlet.jsp");
		rd.include(request, response);

		
		if (map.containsKey(uname) && map.containsValue(pwd)) 

			out.print("Name/Password Match");
		else 
			out.print("Name/Password Does Not Match");
		

	}

}
