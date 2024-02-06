package com.servlet.Day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Servlet implementation class AuthuServlet
 */
public class AuthuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("Vinolisha","VA");
		map.put("Vinisha","DV");
		map.put("Brainy", "BY");
		map.put("Priya", "PA");
		
		String name=request.getParameter("fname");
		String password=request.getParameter("fpass");
		
		RequestDispatcher rd=request.getRequestDispatcher("Athu.jsp");
		rd.include(request,response);
		if(map.containsKey(name)&& map.containsValue(password)) {
			out.println("<h1>Name/Password are Matched</h1>");
		}else {
			out.println("<h1>Name/Password are not Matched</h1>");
		}
			
	}

}
