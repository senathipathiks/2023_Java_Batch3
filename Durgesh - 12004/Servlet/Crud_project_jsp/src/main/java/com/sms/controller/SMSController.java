package com.sms.controller;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.sms.bean.Student;
import com.sms.dao.StudentDao;


public class SMSController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		StudentDao dao = new StudentDao();
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("button");
		
		
		//Insertion operation
		
				if(action.equals("Insert")) {
					
					if (request.getParameter("sid")=="" || request.getParameter("sname")=="" 
							|| request.getParameter("scity")=="" ) {
						response.sendRedirect("empty.jsp?action=Insert");
					}
					else {
						Student s1 = new Student(Integer.parseInt(request.getParameter("sid")),
								request.getParameter("sname"),request.getParameter("scity"));
						n = dao.insertStudent(s1);
															
						if(n==1) {
							response.sendRedirect("success.jsp?action=Insert");
						}
						else {
							response.sendRedirect("failure.jsp?action=Insert");
						}
					}
				}
					
				
		//Updation Operation
				else if(action.equals("Update")) {
					
					if (request.getParameter("sid")=="" || request.getParameter("sname")=="" 
							|| request.getParameter("scity")=="" ) {
						response.sendRedirect("empty.jsp?action=Update");
					}
					else {
						Student s1 = new Student(Integer.parseInt(request.getParameter("sid")),
								request.getParameter("sname"),request.getParameter("scity"));
						n = dao.updateStudent(s1);
															
						if(n==1) {
							response.sendRedirect("success.jsp?action=Update");
						}
						else {
							response.sendRedirect("failure.jsp?action=Update");
						}
					}
				}
				
				
		// Search Operation
				else if(action.equals("Search")) {
					if (request.getParameter("sid")=="" ) {
						response.sendRedirect("empty.jsp?action=Search");						
					}
					
					else {
						int id = Integer.parseInt(request.getParameter("sid"));
						Student s1 = dao.searchStudent(id);
															
						if(s1==null) {
							response.sendRedirect("failure.jsp?action=Search");
						}
						else {
							request.getSession().setAttribute("bean", s1);
							response.sendRedirect("success.jsp?action=Search");
						}
					}
				}
			
				
		// Search All Operation
				else if(action.equals("SearchAll")) {
					List<Student> list = dao.searchAllStudent();
					if(list.isEmpty()) {
						response.sendRedirect("failure.jsp?action=SearchAll");
					}
					else {
						request.getSession().setAttribute("list", list);
						response.sendRedirect("success.jsp?action=SearchAll");
					}
				}
			
							
		//Deletion operation
				else if(action.equals("Delete")) {
					if (request.getParameter("sid")=="" ) {
						response.sendRedirect("empty.jsp?action=Delete");						
					}
					
					else {
						int id = Integer.parseInt(request.getParameter("sid"));
						n = dao.deleteStudent(id);
															
						if(n==1) {
							response.sendRedirect("success.jsp?action=Delete");
						}
						else {
							response.sendRedirect("failure.jsp?action=Delete");
						}
					}
					
				}

				
	}
}
