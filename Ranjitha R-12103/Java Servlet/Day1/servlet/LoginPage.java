package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String name1 = "Ranjitha";
		String pass1 = "Ram@12345";

		String name2 = request.getParameter("name");
		String pass2 = request.getParameter("pass");
		if (name1.equals(name2) && pass1.equals(pass2)) {

			out.println("Validate Successfully !!! " + request.getParameter("name"));
		} else {
			out.print("Validation Failure");
		}
	}

}
