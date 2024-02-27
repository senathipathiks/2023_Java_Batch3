package com.servlet.day2;

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
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		HashMap<String, String> form=new HashMap<>();
		form.put("Deepika","Deepika@123");
		form.put("Samantha", "S@mm");
		form.put("Anushkha","AnuB@by");
		
		String uname = request.getParameter("username");
        String pass=request.getParameter("password");
        
        if (form.get(uname).equals(pass))
        {
			out.println("Name/password Matches");
		}
        else
        {
           out.println("Name/Password does not Matches");
		}
	}

	

}
