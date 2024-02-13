package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class ServletTask1 extends HttpServlet {
	 
	 
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		 HashMap<String, String> map = new HashMap<>();
		 map.put("Prem","Prem@1234");
		 map.put("Surya","Prem@123");
		 map.put("Jeeva","Prem@1234");
		 map.put("Prasanth","Prem@1234");
		 map.put("Sanjay","Prem@1234");
		 
		String u=request.getParameter("fn");
		String p=request.getParameter("fp");
		
	
		if(p.equals(map.get(u))) {
			out.print("Welcome " + u);
		}
		else
		{
			out.print("Invalid login credentials");
		}
		
		
	}

}
