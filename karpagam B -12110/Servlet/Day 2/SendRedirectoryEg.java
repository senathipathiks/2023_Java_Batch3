package com.servlet.Day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Myservlet2
 */
public class SendRedirectoryEg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {//either we can use service,doGet,doPost
     //if we use doGet means it will display all our details in the url thats y doPost is important---service is general methods--doget and dopost are http specified methods
		PrintWriter out=response.getWriter();
	//	out.println("<h1><font color=blue><center>This is example of doGet and doPost method !!</center></font></h1>"); //to print on web page

		//out.print("Welcome:"+request.getParameter("fname"));
		
//		 String name="Kaviya";
//		 String password="Kaviyabs@1602";
//		 
		 String name=request.getParameter("fname");
//		 String name2=request.getParameter("name1");

//		 String pwd2=request.getParameter("pwd1");
//		 
//		 if(name.equals(name2)&& password.equals(pwd2)) {
//			 response.sendRedirect("Login.jsp");			
//		 }
//		 else {
//			 response.sendRedirect("notLogin.jsp");
//		 }
//		 
		response.sendRedirect("Welcome.jsp?fname="+name);// to display the name using query--url rewriting
		
		
		
		

	}

}
