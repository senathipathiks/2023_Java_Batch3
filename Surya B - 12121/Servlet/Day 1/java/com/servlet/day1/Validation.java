package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String email = request.getParameter("email");

        // Perform your validation here
        if(firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
          out.println("<p>Please fill all the fields</p>");
        } else {
          out.println("<p>Registration successful!</p>");
        }

    }


}
