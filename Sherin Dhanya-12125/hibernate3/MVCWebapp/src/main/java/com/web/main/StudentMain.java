package com.web.main;

import java.io.IOException;
import java.io.PrintWriter;


import com.web.bean.Student;
import com.web.dao.StudentDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/StudentMain")
public class StudentMain extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;

		StudentDAO dao=new StudentDAO();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		
		if(action.equals("Insert"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");
			
			Student s1=new Student();
			
			s1.setStudentname(request.getParameter("name"));
			s1.setDepartment(request.getParameter("dept"));
			s1.setDepartment(request.getParameter("place"));

			
			n=dao.insertStudent1(s1);
			if(n>0) {

				rd.include(request, response);
				out.write("<h1> <font color=white> Record Inserted Successfully</font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color= red> Record Inserted Failure</font></h1>");
			}
			
		}
	}
}
