package com.Student.contoller;

import com.Student.dao.*;
import com.Student.bean.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int n=0;
		StudentDao dao=new StudentDao();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		
		if (action.equals("Insert")) {
			RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");
			
			Student s1=new Student();
			
			s1.setSname(request.getParameter("name"));
			s1.setDept(request.getParameter("department"));
			
			n=dao.insertStudent(s1);
			
			if (n>0) {
				response.sendRedirect("insertsuccess.jsp");
			} else {
				rd.include(request, response);
				response.sendRedirect("insertfailure.jsp");
			}
			
		}

	}

}
