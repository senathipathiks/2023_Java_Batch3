package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		String emailRegex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-z]{2,3}$";
		String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";
		if(user=="" || pass=="")
			response.sendRedirect("Invalid.jsp");
		else if(user.matches(emailRegex) && pass.matches(passwordRegex))
			response.sendRedirect("Welcome.jsp");
		else 
			response.sendRedirect("Welcome.jsp");
		
	}

}
