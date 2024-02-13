package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	 HashMap<String, String> map = new HashMap<String, String>();
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		 
		  
	        
	        map.put("vishal", "vi@123");
	        map.put("sachin", "Sachin@134");
	        map.put("vaibhav", "Vaibav@356");
	        map.put("suresh", "surexh@569");
	        map.put("jothi", "jothi@986");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
			         boolean flag=false;
					String user=request.getParameter("user");
					String Pass=request.getParameter("pass");
					
					
					
					
					if(map.keySet().contains(user)&&map.get(user).equals(Pass)) {
						RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
						 rd.forward(request,response);
					 
					}
					else {
						
						RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
						 rd.include(request, response);
						out.println();
						 out.println("<h1>Invalid username & password</h1>");
//					 flag=true;
//					 break;
						 
					
					}
	}

}
