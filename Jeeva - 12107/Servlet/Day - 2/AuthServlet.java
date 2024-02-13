package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 HashMap<String, Integer> hMap=new HashMap<String, Integer>();
 hMap.put("leonal", 34563);
 hMap.put("marcelo", 56782);
 hMap.put("steve", 98769);
 hMap.put("andres", 90234);
		
		PrintWriter pw=response.getWriter();
		
		String userName=request.getParameter("uname");
		Integer password=Integer.parseInt(request.getParameter("psw"));
//	
boolean flag=false;
 for (Entry<String, Integer> e : hMap.entrySet()) {
	
	 String s=e.getKey();
	 Integer s1=e.getValue();
	if(s.equals(userName) && s1.equals(password)) {
		  pw.print("<h1><center>Name/Password Match</center></h1>");
		  flag=true;
		  break;
	}
 }
	if(flag==false) {
		pw.print("<h1><marquee>Name/Password Not Match</h1></marquee>");
     

	
	}
	}
}