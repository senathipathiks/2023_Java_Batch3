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

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.sms.bean.Student;
import com.sms.dao.SMSDao;

/**
 * Servlet implementation class SmsController
 */
public class SmsController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		SMSDao dao = new SMSDao();
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("button");
		
		
		//Insertion operation
		
		if(action.equals("Insert")) {
			RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
			
			int id=Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String city = request.getParameter("scity");
			
			Student s1 = new Student(id, name, city);
			n = dao.insertStudent(s1);
			
			if(n==1) {
				rd.include(request, response);
				out.write("<br><h1><font color=darkgreen> <center> Record Inserted Successfully </center> </font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<br><h1> <font color=darkred> <center> Record Insertion Failed </center> </font></h1>");
			}
		}
		
		
		//Updation operation
		
		else if(action.equals("Update")) {
			RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
			
			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String city = request.getParameter("scity");
			
			Student s2 = new Student(id, name, city);
			n = dao.updateStudent(s2);
			
			if(n==1) {
				rd.include(request, response);
				out.write("<br><h1><font color=darkgreen> <center> Record Updated Successfully </center> </font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<br><h1> <font color=darkred> <center> Record Updation Failed </center> </font></h1>");
			}
		}
		
		
		//Find the student using student id:
		
		else if(action.equals("Find")) {
			RequestDispatcher rd = request.getRequestDispatcher("find.jsp");
			
			int id = Integer.parseInt(request.getParameter("sid"));
			Student s1 = dao.findStudent(id);
			if(s1!=null) {
				rd.include(request, response);
				out.write("<br><br>");
				out.write("<font size=5px color=darkblue> <table align=center border=1>"
						+ "<tr>"
						+"<th>Student ID </th>"
						+"<th>Student Name </th>"
						+"<th>Student City </th>"
						+ "</tr>"
						+ "<tr>"
						+"<td>" + s1.getSid() + "</td>"
						+"<td>"+ s1.getSname() + "</td>"
						+"<td>" +  s1.getScity() +"</td>"
						+ "</tr>" + "</font>");
			}
			else {
				rd.include(request, response);
				out.write("<br><h1> <font color=darkred> <center> Record cannot be found </center> </font></h1>");
			}
			
		}
		
		
		//Display all the student details
		
		else if(action.equals("FindAll")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("find.jsp");
			
			//int id = Integer.parseInt(request.getParameter("sid"));
			LinkedList<Student> s1 = dao.findAllStudent();
			if(s1.size()>0) {
				rd.include(request, response);
				out.write("<br><br><br><br>");
				out.write("<font size=5px color=darkblue> <table align=center border=1>"
						+ "<tr>"
						+"<th>Student ID </th>"
						+"<th>Student Name </th>"
						+"<th>Student City </th>"
						+ "</tr>");
				for (Student s : s1) {
					out.write("<tr>"
						+"<td>" + s.getSid() + "</td>"
						+"<td>"+ s.getSname() + "</td>"
						+"<td>" +  s.getScity() +"</td>"
						+ "</tr>" );
				}
				out.write("</table></font>");
						
			}
			else {
				rd.include(request, response);
				out.write("<br><h1> <font color=darkred> <center> Record cannot be found </center> </font></h1>");
			}
			
		}
		
		
		//Deletion operation
		
		else if(action.equals("Delete")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
			
			int id = Integer.parseInt(request.getParameter("sid"));
			
			n = dao.deleteStudent(id);
			
			if(n==1) {
				rd.include(request, response);
				out.write("<br><h1><font color=darkgreen> <center> Record Deleted Successfully </center> </font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<br><h1> <font color=darkred> <center> Record Deletion Failed </center> </font></h1>");
			}
		
		}		
	}
}
