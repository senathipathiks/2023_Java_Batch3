package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.hibernate.bean.Student;
import com.hibernate.dao.StudentDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServelet
 */
@WebServlet("/InsertServelet")
public class InsertServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public InsertServelet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int n = 0;
		StudentDAO dao = new StudentDAO();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");

		if (action.equals("Insert")) {
			Student s1 = new Student(Integer.parseInt(request.getParameter("sid")), request.getParameter("sname"),request.getParameter("scity"));

			n = dao.insertStudent(s1);
			if (n > 0) {
				response.sendRedirect("InsertSuccess.jsp");
			} else {
				response.sendRedirect("InsertFailure.jsp");

			}

		} else if (action.equals("Delete"))

		{
			int id = Integer.parseInt(request.getParameter("sid"));
			n = dao.deleteStudent(id);

			if (n == 1) {

				response.sendRedirect("DeleteSuccess.jsp");

			} else {
				response.sendRedirect("DeleteFailure.jsp");

			}
		}
	
		else if (action.equals("Find")) {
			int id = Integer.parseInt(request.getParameter("sid"));
			
			 Student stud = new Student();
			  stud = dao.findStudent(id);
 
			if (stud.getId() >0) {
				request.setAttribute("studId", stud.getId());
				request.setAttribute("studName", stud.getName());
				request.setAttribute("studCity", stud.getCity());

				response.sendRedirect("FindStudent.jsp");
			 
			} else {
				response.sendRedirect("NoStudent.jsp");
				 
			}
		}
	}
}


