package com.sms.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.sms.dao.*;
import com.sms.bean.*;
import com.sms.dao.*;


public class InsertServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		StudentDao dao = new StudentDao();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
			
			int id=Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String city = request.getParameter("scity");
			
			Student stud = new Student(id,name,city);
			n=dao.insertStudent(stud);
			
			if(n==1) {
				rd.include(request, response);
				out.write("<h1><font color=blue> Record Inserted Successfully </font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<h1><font color=red> Record Insertion was failure </font></h1>");
			}

		}
		else if(action.equals("Find")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
			
			int id = Integer.parseInt(request.getParameter("sid"));
			
			Student stud = dao.findStudent(id);
			
			if(stud!=null) {
				rd.include(request, response);
				out.write("<br><br><br>");
				out.write("<font size=5px color=blue><table align=center border=2>"
						+"<tr border=2>"
						+"<th>Stud ID</th>"
						+"<th>Stud Name</th>"
						+"<th>Stud City</th>"
						+"</tr>"
						+"<tr border=2>"
						+"<td>"+stud.getStudId()+"</td>"
						+"<td>"+stud.getStudName()+"</td>"
						+"<td>"+stud.getStudCity()+"</td>"
						+"</tr>"
						+"</font>"
						);
			}
			else {
				rd.include(request, response);
				out.write("<h1><font color=red>Record Not Found </font></h1>");
			}
			
			
		}
		else if(action.equals("FindAll")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
			LinkedList<Student> stud = new LinkedList<Student>();
			stud = dao.findAllStudent();
			
			if(stud.size()>0) {
				rd.include(request, response);
				out.write("<br><br><br>");
				out.write("<font size=5px color=blue><table align=center border=2>"
						+"<tr border=2>"
						+"<th>Stud ID</th>"
						+"<th>Stud Name</th>"
						+"<th>Stud City</th>"
						+"</tr>");
				
				for(Student s : stud) {
					
					out.write(
							"<tr border=2>"
							+"<td>"+s.getStudId()+"</td>"
							+"<td>"+s.getStudName()+"</td>"
							+"<td>"+s.getStudCity()+"</td>"
							+"</tr>"
							
							);
				}
				out.write("</table></font>");
			}
			
		}
		
		else if(action.equals("delete")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
			
			int  id = Integer.parseInt(request.getParameter("sid"));
			
			n=dao.deleteStudent(id);
			
			if(n==1) {
				rd.include(request, response);
				out.print("<h1><font size=5px color=blue>Delete Student Details is Successfull</font></h1>");
			}
			else {
				rd.include(request, response);
				out.print("<h1><font size=5px color=red>Deletion is Failure</font></h1>");
			}
		}
		
		else if(action.equals("update")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
			
			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String city = request.getParameter("scity");
			
			Student std = new Student(id, name, city);
			
			n=dao.updateStudent(std);
			
			if(n>0) {
				rd.include(request, response);
				out.print("<h1><font color=blue>Update Details is Successful</font></h1>");
			}
			else {
				rd.include(request, response);
				out.print("<h1><font color=red>Update Details is Failure</font></h1>");
			}
		}
	}

}
