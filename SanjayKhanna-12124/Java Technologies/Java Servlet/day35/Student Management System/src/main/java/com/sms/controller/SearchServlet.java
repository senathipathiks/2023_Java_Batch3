package com.sms.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;


public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAO dao = new StudentDAO();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
		
		if(action.equals("Search")) {
			if(request.getParameter("stuId") != "" ) {
			int id = Integer.parseInt(request.getParameter("stuId"));
			Student stu = dao.searchStudentDB(id);
			if(stu != null) {
				rd.include(request, response);
				out.println("<br><br>");
				out.print("<table align=center border=1>"+"<tr><td>Student Id</td><td>Student Name</td+"
						+ "><td>Student City</th></tr>"+
				"<tr><td>"+stu.getStuId()+"</td><td>"+stu.getStuName()+"</td><td>"+stu.getStuCity()+"</td></tr>");
			}
			else {
				rd.include(request, response);
				out.println("<br><h4>Record not Found</h4>");
			}
			}else {
				rd.include(request, response);
				out.write("<br><h1>No field should not be Empty</h1>");
			}
		}
		
		else if(action.equals("View All")) {
			List<Student> list = dao.searchAllStudentDB();
			if(list.isEmpty()) {
				rd.include(request, response);
				out.println("<h4><br>Record not Found</h4>");
			}
			else {
				rd.include(request, response);
				out.println("<br><br>");
				out.println("<h4>Total No fo Record : "+list.size()+"</h4>");
				out.print("<table align=center border=1>"+"<tr style=\"font-weight:bolder\"><td>Student Id</td><td>Student Name</td+"
						+ "><td>Student City</th></tr>");
				for(Student stu : list) {
					out.print("<tr><td>"+stu.getStuId()+"</td><td>"+stu.getStuName()+"</td><td>"+stu.getStuCity()+"</td></tr>");
				}
			}
				
		}
	}

}
