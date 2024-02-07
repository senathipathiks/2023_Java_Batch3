package com.servlet.day1;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myfactorial
 */
public class Myfactorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			int num = Integer.parseInt(request.getParameter("text1"));
			out.println("The factorial of the number is: ");
			out.println(this.fact(num));

			}

			long fact(long a) {
			if (a <= 1)
			return 1;
			else {
			a = a * fact(a - 1);
			return a;
			}
			}
}


