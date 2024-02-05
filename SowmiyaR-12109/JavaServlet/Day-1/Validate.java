package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;import javax.swing.text.html.FormSubmitEvent;

/**
 * Servlet implementation class Validate
 */
public class Validate extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		    String name1="Sowmiya";
		    String pwd1="Sowmi@123";
		
		    String n=request.getParameter("name");  
		    String p=request.getParameter("pwd");
		    
		    if(name1.equals(n)&&(pwd1.equals(p))) {
		       out.println("Welcome "+request.getParameter("name"));
	           }
		    else {
		    	out.print("Invalid");
		    }
	}

}
