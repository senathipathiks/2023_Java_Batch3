package com.servlet.day2;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	
	HashMap<String, String> map = new  HashMap<String, String>();
	
	public void init(ServletConfig config) throws ServletException {
		

		
		
		map.put("Abishek", "Abi@2781");
		map.put("Abinaya", "Abinaya1234");
		map.put("Prem", "prem2468");
		map.put("Vishnu", "vishnu1357");
		
		
			
		
    
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean flag = false;
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String password = request.getParameter("pwd");
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it1 = set.iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			String Kname =     entry.getKey(); 
			String Vpwd = entry.getValue();
			
			if(name.equals(Kname) && password.equals(Vpwd)) {
				flag=true;
				
			}
			
			else{
				flag=false;
				
			}
			
			
	}
		if(flag==true) {
			out.println("<h1>Name/Password is match</h1>");
		}
		else {
			out.println("<h1>Name/Password is not match</h1>");
		}

}
}