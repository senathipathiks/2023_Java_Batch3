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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		StudentDAO dao=new StudentDAO();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		
		if (action.equals("Insert")) {
			RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");
			
			int id=Integer.parseInt(request.getParameter("sid"));
			String name=request.getParameter("sname");
			String city=request.getParameter("scity");
			Student stud=new Student(id,name,city);
			n=dao.insertStudent(stud);
			
			if (n==1) {
				rd.include(request, response);
				out.write("<h1> <font color=green> Record Inserted Successfully </font> </h1>");
			} else {
				rd.include(request, response);
				out.write("<h1> <font color=red> Record Insertion Failed </font> </h1>");
			}
			
		}		
		
		else if(action.equals("Find"))
		{
	    RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
		int id=Integer.parseInt(request.getParameter("sid"));
		Student std=dao.findStudent(id);
		
		if(std!=null) {
			
			rd.include(request, response);
			out.write("<br><br><br>");
			out.write("<font size=5px color=green><table align=center border=1>"
					+"<tr>"
					+"<th> Stud ID</th>"
					+"<th> Stud Name</th>"
					+"<th> Stud City</th>"
					+"</tr>"
					+"<tr>"
					+"<td>"+std.getSid()+"</td>"
					+"<td>"+std.getSname()+"</td>"
					+"<td>"+std.getCity()+"</td>");
			
			}
		else {
			rd.include(request,response);
			out.print("<h1> <font color=red> Record not found</font></h1>");
		}
		
		
	}
		else if(action.equals("Find All"))
		{
	    RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
	    
	    LinkedList<Student> stud=new LinkedList<Student>();
	    
		stud=dao.findAllStudent();
		System.out.println(stud.size());		
		
		if(stud.size()>0) {
			
			rd.include(request, response);
			out.write("<br><br><br>");
			out.write("<font size=5px color=green><table align=center border=1>"
					+"<tr>"
					+"<th> Stud ID</th>"
					+"<th> Stud Name</th>"
					+"<th> Stud City</th>"
					+"</tr>");
			
			for (Student s : stud) {
				out.print("<tr>"
						+ "<td>"+s.getSid()
				+ "<td>"+s.getSname()
				+ "<td>"+s.getCity());
			}
			out.write("</table></font>");
			
			
			}
		else {
			rd.include(request,response);
			out.print("<h1> <font color=red> Record not found</font></h1>");
		}
		}
		
		else if (action.equals("Delete")) {
			RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			n=dao.deleteStudent(id);
			if (n==1) {
				rd.include(request, response);
				out.print("<h1> <font color=green> Record Deleted Successfully </font> </h1>");
			}else { 
				rd.include(request, response);
				System.out.println("<h1> <font color=red> Record not found</font></h1>");
			}
		}
		
		else if(action.equals("Update")){
      	  int n1=0;
            StudentDAO dao1=new StudentDAO();
            PrintWriter out1=response.getWriter();
            String action1=request.getParameter("button");
            
            if(action1.equals("Update"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
                
                int id=Integer.parseInt(request.getParameter("sid"));
//                Student stud=dao.UpdateStudent(id);
                String name=request.getParameter("sname");
                String city=request.getParameter("scity");
               
                Student stud1=new Student(id,name,city);
                n1=dao1.updateStudent(stud1);
                if(n1==1) {
                    rd.include(request, response);
                    out.write("<h1> <font color=green><center> Record Update Successfully</center> </font></h1>");
                }
                else
                {
                    rd.include(request, response);
                    out.write("<h1> <font color=red> Record updation Failure </font></h1>");
                }
            }
	
	
		}
		}
	}
