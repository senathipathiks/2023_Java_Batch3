package com.sms.controller;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		StudentDAO dao = new StudentDAO();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			RequestDispatcher rd = request.getRequestDispatcher("Insert.jsp");
			if(request.getParameter("stuId") != "" || request.getParameter("stuName") !="" || request.getParameter("stuCity") != "") {
			Student stu = new Student(Integer.parseInt(request.getParameter("stuId")), request.getParameter("stuName"),request.getParameter("stuCity"));
			n=dao.insertStudentDB(stu);
			if(n==1) {
				rd.include(request, response);
				out.write("<br><h1>Record Inserted Successfully</h1>");
			}
			else {
				rd.include(request, response);
				out.write("<br><h1>Record Insertion Failure</h1>");
			}
		}
			else {
				rd.include(request, response);
				out.write("<br><h1>No field should not be Empty</h1>");
			}
		}
	}

}
