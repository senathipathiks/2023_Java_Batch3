package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DemoServlet3
 */
public class DemoServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	     
        float p=Float.parseFloat(request.getParameter("p"));
        float r=Float.parseFloat(request.getParameter("r"));
        float n=Float.parseFloat(request.getParameter("n"));
        float i=(p*r*n)/100;
        out.println("<br><h1>Simple Interest will be : "+i);
	}
	}


