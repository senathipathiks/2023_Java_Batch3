package com.sms.controller;

import jakarta.servlet.RequestDispatcher;	
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//import com.sms.bean.Student;
import com.sms.dao.StudentDAO;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StudentDAO dao = new StudentDAO();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
		String action = request.getParameter("button");
		
		if(action.equals("Delete")) {
			if(request.getParameter("stuId") != "") {
			int id = Integer.parseInt(request.getParameter("stuId"));
			int n = dao.deleteStudentDB(id);
			if(n==1) {
				rd.include(request, response);
				out.write("<br><h1>Record Deleted Successfully</h1>");
			}else {
				rd.include(request, response);
				out.write("<br><h1>Deletion Process Failure</h1>");
			}
			}else {
				rd.include(request, response);
				out.write("<br><h1>No field should not be Empty</h1>");
			}
		}
		
	}

}
