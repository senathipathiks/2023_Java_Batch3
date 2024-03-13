package com.sms.controller;

import com.sms.bean.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.sms.dao.StudentDAO;

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		StudentDAO dao = new StudentDAO();
		PrintWriter out = response.getWriter();
		String action=request.getParameter("button");
		if(action.equals("Insert")) {
			RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
		int id=Integer.parseInt(request.getParameter("sid"));
		String name=request.getParameter("sname");
		String city=request.getParameter("scity");
		Student stud=new Student(id,name,city);
		n=dao.insertStudent(stud);
		if(n==1) {
			rd.include(request, response);
			out.print("<ceneter><h1><font color=blue> Record Succussfully Inserted</font></h1></ceneter>");
		}
		else {
			rd.include(request, response);
			out.print("<ceneter><h1><font color=blue> Record Inserted</font></h1></ceneter>");
		}
		}
		
		else if(action.equals("Find")) {
			RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
		    int id = Integer.parseInt(request.getParameter("sid"));
		    Student stud = dao.findStudent(id);
		    if(stud!=null) {
		    	rd.include(request, response);
		    	out.print("<br><br><br>");
		    	out.print("<font size=5px color=blue>"
		    			+"<table align=center border='1'>"
		    			+"<tr>"
		    			+"<th> Student ID </th>"
		    			+"<th> Student Name </th>"
		    			+"<th> Student City </th>"
		    			+"</tr>"
		    			+"<tr>"
		    			+"<td>"+stud.getId()+"</td>"
		    			+"<td>"+stud.getName()+"</td>"
		    			+"<td>"+stud.getCity()+"</td>"
		    			+"</tr>"
		    			+"</table>"
		    			+"</font>");
		    }
		    else {
		    	rd.include(request, response);
		    	out.print("</ceneter><h1><font color=blue> Record Not Found</font></h1></ceneter>");
		    }
		    }
		else if (action.equals("Delete")) {
            RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
            int id = Integer.parseInt(request.getParameter("sid"));
            n = dao.deleteStudent(id);

            if (n == 1) {
                rd.include(request, response);
                out.print("<center><h1><font color=blue> Record Successfully Deleted</font></h1></center>");
            } else {
                rd.include(request, response);
                out.print("<center><h1><font color=blue> Record Not Found</font></h1></center>");
            }
        } 
		
		else if (action.equals("Update")) {
            RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
            int id = Integer.parseInt(request.getParameter("sid"));
            String name = request.getParameter("sname");
            String city = request.getParameter("scity");
            Student stud = new Student(id, name, city);
            n = dao.updateStudent(stud);

            if (n == 1) {
                rd.include(request, response);
                out.print("<center><h1><font color=blue> Record Successfully Updated</font></h1></center>");
            }else {
                rd.include(request, response);
                out.print("<center><h1><font color=blue> Record Not Found</font></h1></center>");
            }
        }
		else if (action.equals("FindAll")) {
		    RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
		    Student[] list = dao.findAllStudents();
		    if (list.length>0) {
		        rd.include(request, response);
		        out.print("<br><br><br>");
		        out.print("<font size=5px color=black>"
		                + "<table align=center style='border:2px solid black'>"
		                + "<tr>"
		                + "<th> Student ID </th>"
		                + "<th> Student Name </th>"
		                + "<th> Student City </th>"
		                + "</tr>");
		        for (Student s : list) {
		            out.print("<tr>"
		                    + "<td>" + s.getId() + "</td>"
		                    + "<td>" + s.getName() + "</td>"
		                    + "<td>" + s.getCity() + "</td>"
		                    + "</tr>");
		        }
		        out.print("</table>"
		                + "</font>");
		    } else {
		        rd.include(request, response);
		        out.print("<ceneter><h1><font color=blue> Record Not Found </font></h1></ceneter>");
		    }
		}
		}
	}

