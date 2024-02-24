package com.register.main;

import java.io.IOException;
import java.io.PrintWriter;

import com.register.bean.Registration;
import com.register.dao.RegisterDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final RegisterDAO dao = new RegisterDAO();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("submit");
		if(action.equals("submit")) {
			RequestDispatcher rd = request.getRequestDispatcher("RegistrationPage.jsp");
			Registration r = new Registration(request.getParameter("name"), Integer.parseInt(request.getParameter("age")), request.getParameter("gender"), request.getParameter("email"), request.getParameter("password"));
			boolean flag = dao.insert(r);
			if(flag) {
				rd.include(request, response);
				out.println("<br><br><h1>You are register successfully</h1>");
			}else {
				rd.include(request, response);
				out.println("<br><br><h1>Registration failure</h1>");
			}
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
