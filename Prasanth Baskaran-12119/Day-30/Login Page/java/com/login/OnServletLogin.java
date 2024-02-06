package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class OnServletLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");

		String user=request.getParameter("userName");
		String pass=request.getParameter("userPassword");

		if(user.equals("Prasanth@123")&&pass.equals("Prasanth@123")) 
                 pw.println("<h1>Login Success...!</h1>"); 
                else
                 pw.println("<h1>Login Failed...!</h1>");
		 pw.close();
		
	}

}
