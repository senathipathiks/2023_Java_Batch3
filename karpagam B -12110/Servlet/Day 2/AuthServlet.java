package com.servlet.Day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();

		HashMap<String,String> map=new HashMap<String,String>();
		map.put("kaviya","bs");
		map.put( "kamini","bs");
      	map.put("Revathi","as");
		map.put("Gayathri","jk");
	
    	String name=request.getParameter("user");
      	String pwd=request.getParameter("psw");
      	
      	
      	
      	RequestDispatcher rd=request.getRequestDispatcher("Auth.jsp");
		rd.include(request, response);
		   if(map.containsKey(name)&& map.containsValue(pwd)) 
      			out.println("<h1>Name/ Password matched</h1>");
           else 
      			out.println("<h1>Name/ Password doesn't matched</h1>");
        
        
      		
  }
}
