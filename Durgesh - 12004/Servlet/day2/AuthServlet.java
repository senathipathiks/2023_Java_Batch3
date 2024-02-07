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
import java.util.HashMap;import java.util.jar.Attributes.Name;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		
		HashMap<String, String> names = new HashMap<String, String>();
		names.put("Logesh", "LogeshMohan");
		names.put("Durgesh", "DurgeshM");
		names.put("", "");
		
		
		String uname = request.getParameter("user");
		String pass = request.getParameter("pword");
		
		RequestDispatcher rd = request.getRequestDispatcher("AuthServlet.jsp");
		rd.forward(request, response);
		
		if(names.containsKey(uname) && names.containsValue(pass)) {
			out.print("Name/Password Matched");
		}
		else {
			out.print("Name/Password Doesnot Match");
		}
	
	}

}
