package com.Hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import com.Hibernate.bean.Student;
import com.Hibernate.dao.StudentDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class HibernateServlet
 */
public class HibernateServlet extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public HibernateServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		int n = 0;
		StudentDAO dao = new StudentDAO();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");

		if (action.equals("Insert")) {
			int sid = Integer.parseInt(request.getParameter("sid"));
			String sname = request.getParameter("sname");
			String sdept = request.getParameter("sdept");
			String saddress = request.getParameter("saddress");

			Student stud = new Student(sid, sname, sdept, saddress);
			n = dao.insertStudentDetails(stud);
			if (n == 1) {
				response.sendRedirect("InsertSuccess.jsp");
			} else {
				response.sendRedirect("InsertFail.jsp");
			}

		}
//==============================UPDATE
//		else if(action.equals("Update")) {
//			int sid = Integer.parseInt(request.getParameter("sid"));
//			String sname = request.getParameter("sname");
//			String sdept = request.getParameter("sdept");
//			String saddress = request.getParameter("saddress");
//			
//			
//			Student stud = new Student(sid, sname, sdept, saddress);
//			n = dao.updateStudentDetails(stud);
//			if (n == 1) {
//				response.sendRedirect("UpdateSuccess.jsp");
//			} else {
//				response.sendRedirect("UpdateFail.jsp");
//			}
//		}
//		===============================DELETE
//		else if (action.equals("Delete")) {
//
//			int id = Integer.parseInt(request.getParameter("sid"));
//			n = dao.deleteStudentDetails(id);
//			if (n == 1) {
//				response.sendRedirect("DeleteSuccess.jsp");
//
//			} else {
//				response.sendRedirect("DeleteFail.jsp");
//
//			}
//		} 
//		======FIND
//				else if (action.equals("Find")) {
//			int sid = Integer.parseInt(request.getParameter("sid"));
//			Student stud = dao.findStudentDetails(sid);
//			if (stud != null) {
//				RequestDispatcher rd = request.getRequestDispatcher("FindSuccess.jsp");
//				request.setAttribute("bean", stud);
//				rd.include(request, response);
//			} else {
//				response.sendRedirect("FindFail.jsp");
//			}
//		}
//
//		else if (action.equals("FindAll")) {
//			List lb = new LinkedList<Student>();
//			lb = dao.findAllStudentDetails();
//
//			if (lb.size() > 0) {
//				RequestDispatcher rd = request.getRequestDispatcher("FindAllSuccess.jsp");
//				request.setAttribute("bean", lb);
//				rd.include(request, response);
//			} else {
//				response.sendRedirect("FindAllFail.jsp");
//			}
//	}
//	
	}
	
}
