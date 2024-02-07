package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;




	public class Addnum extends HttpServlet {

		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			
			int n1 = Integer.parseInt(request.getParameter("one"));
			int n2 = Integer.parseInt(request.getParameter("two"));
			int n3 = n1 + n2;
			
			out.print(n3);
			
		
		}

}
