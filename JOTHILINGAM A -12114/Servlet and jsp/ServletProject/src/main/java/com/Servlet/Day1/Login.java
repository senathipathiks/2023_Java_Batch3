package com.Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String u = "jothi";
		String p = "Jothi@2000";

		String givuserr = request.getParameter("user");
		String givpasss = request.getParameter("pass");

		if (u.equals(givuserr) && p.equals(givpasss)) {
			out.print("<h1>Welcome to My Page</h1>");
		} else {
			out.print("Given correct username");
		}
	}

}
