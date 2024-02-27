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
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		
		HashMap<String, String> map= new HashMap<String,String>();
		map.put("sherin", "Sherin@22");
		map.put("kiruba", "Kiruba@22");
		map.put("jothi", "jothi@22");
		String user=request.getParameter("userr");
		String pass=request.getParameter("psw");

		RequestDispatcher rd=request.getRequestDispatcher("Auth.jsp");
		rd.include(request, response);
		   if(map.containsKey(user)&& map.containsValue(pass)) 
      			out.println("<h1>Name/ Password matched</h1>");
           else 
      			out.println("<h1>Name/ Password doesn't matched</h1>");
        
        
}
}
