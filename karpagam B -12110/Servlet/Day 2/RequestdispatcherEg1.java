package com.servlet.Day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RequestdispatcherEg1
 */
public class RequestdispatcherEg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();

//		RequestDispatcher rd=request.getequestDispatcher("Welcome.jsp");
//		rd.forward(request, response); //Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.
//	    out.println("<h1>Invalid username/password</h1>");
		
		String name="Kaviya";
		String name1=request.getParameter("fname");
		
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.include(request, response);//to include the content*

		if(name1.equals(name)) { 
		    out.println("<h1>Username valid..</h1>");//*

		}
		else {
		    out.println("<h1>Invalid username/password</h1>");
        }
		}

}
