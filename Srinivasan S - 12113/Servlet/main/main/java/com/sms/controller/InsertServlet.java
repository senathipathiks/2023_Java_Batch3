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

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		
		StudentDAO dao=new StudentDAO();
		PrintWriter out=response.getWriter();
		
		String action=request.getParameter("button");
		
		if(action.equals("Insert")) {
			RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");
			
			int id=Integer.parseInt(request.getParameter("sid"));
			
			String name=request.getParameter("sname");
			
			String city=request.getParameter("scity");
			
			Student stud=new Student(id, name, city);
			n=dao.insertStudent(stud);
			
			if(n==1) {
				rd.include(request, response);
				out.write("<h1> <font color=green>Record inserted Successfully</font></h1>");
				
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red>Record insertion failed</font></h1>");
			}
		}
		
		else if(action.equals("Update")) {
			RequestDispatcher rd=request.getRequestDispatcher("Update.jsp");
			
			int id=Integer.parseInt(request.getParameter("sid"));
			
			String name=request.getParameter("sname");
			
			String city=request.getParameter("scity");
			
			Student stud=new Student(id, name, city);
			n=dao.updateStudent(stud);
			
			if(n==1) {
				rd.include(request, response);
				out.write("<h1> <font color=green>Record Updated Successfully</font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red>Record Updation failed</font></h1>");
			}
		}
		
		else if(action.equals("Delete")) {
			RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
			
			int id=Integer.parseInt(request.getParameter("sid"));
			
			n=dao.deleteStudent(id);
			
			
			if(n==1) {
				rd.include(request, response);
				out.write("<h1> <font color=green>Record Deleted Successfully</font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red>Record Deletion failed</font></h1>");
			}
		}
		
		else if(action.equals("Find")) {
			RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
			
			int id=Integer.parseInt(request.getParameter("sid"));
			
			Student stud=dao.findStudent(id);
			
			if(stud!=null) {
				rd.include(request, response);
				out.write("<br> <br> <br>");
				out.write("<font size=5px color=green><table align center border=1>"
				+"<tr>"
				+"<th>Student Id </th>"
				+"<th>Student Name </th>"
				+"<th>City </th>"
				+"</tr>"
				+"<tr>"
				+"<td>"+stud.getSid()+"</td>"
				+"<td>"+stud.getSname()+"</td>"
				+"<td>"+stud.getCity()+"</td>"
				+"</tr>"
				+"</font>");
				
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red>Record not found</font></h1>");
			}
		}
		else if(action.equals("Find All")) {
			
			RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
			LinkedList<Student>stud=new LinkedList<Student>();
			stud=dao.findallStudent();
			
			if(stud.size()>0) {
				rd.include(request, response);
				out.write("<br><br><br>");
				out.write("<font size=5px color=green><table align=center border=1>"
						+"<tr>"
						+"<th>Student ID</th>"
						+"<th>Student Name</th>"
						+"<th>City</th>"
						+"</tr>");
				
				for (Student s : stud) {
					out.write("<tr>"
							+"<td>"+s.getSid()+"</td>"
							+"<td>"+s.getSname()+"</td>"
							+"<td>"+s.getCity()+"</td>"
							+"</tr>");
				}
				out.write("</table></font>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red>Record not found</font></h1>");
			}
		}
	}

}
