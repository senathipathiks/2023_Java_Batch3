package com.sms.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.dao.StudentDao;

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int n=0;
	
	StudentDao dao=new StudentDao();
	PrintWriter out=response.getWriter();
	
	String action=request.getParameter("button");
	
	if(action.equals("Insert")) {
		
		RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");
		
		int id=Integer.parseInt(request.getParameter("sId"));
		String name=request.getParameter("sName");
		String city=request.getParameter("sCity");
		Student stud=new Student(id,name,city);
		n=dao.insertStudent(stud);
		if(n==1) {
			rd.include(request, response);
			out.write("<h1><font color=green> Record Inserted Successfully </font></h1>");
		}else {
			rd.include(request, response);
			out.write("<h1><font color=green> Record Insertion Failed </font></h1>");
		}
	}
	else if(action.equals("Find")) {
		
RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
		
		int id=Integer.parseInt(request.getParameter("sId"));
		Student stu=new Student();
			stu = StudentDao.findStudent(id);
			if(stu!=null) {
				
				rd.include(request, response);
				out.write("<br><br><br>");
				out.write("<font size=5px color=green><table align=center border=1>"
						+"<tr>"
						+"<th> Student ID </th>"
						+"<th> Student Name </th>"
						+"<th> Student City </th>"
						+"</tr>"
						+"<tr>"
						+"<td>"+stu.getsId()+"</td>"
						+"<td>"+stu.getsName()+"</td>"
						+"<td>"+stu.getsCity()+"</td>"
						+"</tr>"
						+"</font>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red> Record Not Found </font></h1>");
			}
	}
	else if(action.equals("FindAll")) {
		Student stu=new Student();
		
		RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
	   LinkedList<Student> list=new LinkedList<Student>();
	   list=dao.findAllStudent();
		
	   if(list.size()>0) {
			rd.include(request, response);
			out.write("<br><br><br>");
			out.write("<font size=5px color=green><table align=center border=1>"
					+"<tr>"
					+"<th> Student ID </th>"
					+"<th> Student Name </th>"
					+"<th> Student City </th>"
					+"</tr>");
			for (Student s1 : list) {
			
				out.write(
					"<tr>"
					+"<td>"+s1.getsId()+"</td>"
					+"<td>"+s1.getsName()+"</td>"
					+"<td>"+s1.getsCity()+"</td>"
					+"</tr>");
				
		} 
			out.write("</table></font>");
	   }
		
		
	}
	
	else if(action.equals("Delete")) {
		
		RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");

		int id=Integer.parseInt(request.getParameter("sId"));//----------------------------------
			int del =dao.deleteStudent(id);
			if(del==1) {
				
				rd.include(request, response);
				out.write("<br><br>");
				out.write("<font size=5px color=green></font>");
				out.write("<h1><font color=green> Record Deleted Successfully </font></h1>");
				
				
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red> Record Not Found </font></h1>");
			}
	}
	
	else if(action.equals("Update")) {
		
		RequestDispatcher r=request.getRequestDispatcher("update.jsp");
		
		int id=Integer.parseInt(request.getParameter("sId"));
		String name=request.getParameter("sName");
		String city=request.getParameter("sCity");
		Student stud=new Student(id,name,city);
		n=dao.updateStudent(stud);
		if(n==1) {
			r.include(request, response);
			out.write("<h1><font color=green> Record Updated Successfully </font></h1>");
		}else {
			r.include(request, response);
			out.write("<h1><font color=green> Record Updation Failed </font></h1>");
		}
	
	}
		
		
		
		
		
	}

}
