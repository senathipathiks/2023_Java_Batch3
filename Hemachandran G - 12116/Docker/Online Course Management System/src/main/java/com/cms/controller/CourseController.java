package com.cms.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.cms.bean.Course;
import com.cms.dao.CourseDAO;


/**
 * Servlet implementation class CourseController
 */
public class CourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static CourseDAO dao = new CourseDAO();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		String action = request.getParameter("button");
		PrintWriter out = response.getWriter();
		
		if(action.equals("Insert")) {
			if(request.getParameter("courseID")=="" || request.getParameter("courseName")=="" || request.getParameter("courseType")=="" || request.getParameter("courseDuration")=="" || request.getParameter("courseFee")=="" ) {
				response.sendRedirect("Empty.jsp?action=Insert");

			}
			else {
				Course oc = new Course(Integer.parseInt(request.getParameter("courseID")), request.getParameter("courseName"),request.getParameter("courseType"), Integer.parseInt(request.getParameter("courseDuration")), Float.parseFloat(request.getParameter("courseFee")));
				n = dao.insertCourse(oc);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		}
		
		else if(action.equals("Delete")) {
			if(request.getParameter("courseID")=="") {
				response.sendRedirect("Empty.jsp?action=Delete");
			}else {
				int id = Integer.parseInt(request.getParameter("courseID"));
				n = dao.deleteCourse(id);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Delete");
				}else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
			}
		}
		
		else if(action.equals("Update")) {
			if(request.getParameter("courseID")=="" || request.getParameter("courseName")=="" || request.getParameter("courseType")=="" || request.getParameter("courseDuration")=="" || request.getParameter("courseFee")=="" ) {
				response.sendRedirect("Empty.jsp?action=Update");

			}
			else {
				Course oc = new Course(Integer.parseInt(request.getParameter("courseID")), request.getParameter("courseName"),request.getParameter("courseType"), Integer.parseInt(request.getParameter("courseDuration")), Float.parseFloat(request.getParameter("courseFee")));
				n = dao.updateCourse(oc);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
			}
		}
		
		else if(action.equals("Search")) {
			if(request.getParameter("courseID")=="") {
				response.sendRedirect("Empty.jsp?action=Search");
			}else {
				int id = Integer.parseInt(request.getParameter("courseID"));
				Course oc = dao.searchCourse(id);
				if(oc==null) {
					response.sendRedirect("Failure.jsp?action=Search");
				}else {
					request.getSession().setAttribute("bean", oc);
					response.sendRedirect("Success.jsp?action=Search");
				}
			}
		}
		
		else if(action.equals("View All")) {
			List<Course> list = dao.viewAll();
			if(list.isEmpty()) {
				response.sendRedirect("Failure.jsp?action=View");
			}else {
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Success.jsp?action=View");
			}
		}

	}

}
