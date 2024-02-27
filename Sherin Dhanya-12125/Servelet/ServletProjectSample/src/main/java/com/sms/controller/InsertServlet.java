package com.sms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import com.sms.bean.Students;
import com.sms.dao.StudentDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("InsertServlet")
public class InsertServlet extends HttpServlet {

	public static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0
				;
//		System.out.println("Inside dopost");
		StudentDAO dao=new StudentDAO();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		
		//insert
		if(action.equals("Insert")) {
			RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			String name=request.getParameter("sname");
			String city=request.getParameter("scity");
			Students stud=new Students(id,name,city);
			
			n=dao.insertStudent(stud);
			if(n==1) {
//				System.out.println("Inside insert");
				rd.include(request, response);
				out.write("<h1> <font color=green> Record Inserted Successfully</font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=green> Record Inserted Failure</font></h1>");
			}
		}
//delete
		if(action.equals("Delete")) {
			RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			
			n=dao.deleteStudent(id);
			if(n==1) {
				System.out.println("Inside insert");
				rd.include(request, response);
				out.write("<h1> <font color=green> Record Deleted Successfully</font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red> Record Deleted Failure</font></h1>");
			}
}
		//update
		if(action.equals("Update")) {
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			String name=request.getParameter("sname");
			String city=request.getParameter("scity");
			Students stud=new Students(id,name,city);
			
			n=dao.updateStudent(stud);
			if(n==1) {
				
				rd.include(request, response);
				out.write("<h1> <font color=red> Record Updated Successfully</font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red> Record Updated Failure</font></h1>");
			}
		}
		//find
		else if(action.equals("Find")) {
			RequestDispatcher rd=request.getRequestDispatcher("find.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			Students stud=dao.findStudent(id);
			if(stud.getId()!=0) {
				rd.include(request, response);
				out.write("<br><br><br>");
				out.write("<font size=5px color=white><table align=center border=1>"
				+"<tr>"
				+"<th> Stud Id </th>"
				+"<th> Stud Name </th>"
				+"<th> Stud city </th>"
				+"</tr>"
				+"<tr>"
				+"<th>" +stud.getId()+"</th>"
				+"<th>"+stud.getName()+" </th>"
				+"<th>"+stud.getCity()+" </th>"
				+"</tr>"
				+"</font>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color=red> Record Not found </font></h1>");
			}
		}
		//findall
		else if(action.equals("Find All")) {
			RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
			LinkedList<Students> stud=new LinkedList<Students>();
			
			 stud=dao.findAllStudent();
			if(stud.size()>0) {
				rd.include(request, response);
				out.write("<br><br><br>");
				out.write("<font size=5px color=white><table align=center border=1>"
				+"<tr>"
				+"<th> Stud Id </th>"
				+"<th> Stud Name </th>"
				+"<th> Stud city </th>"
				+"</tr>");
				for(Students s:stud) {
					out.write(
				"<tr>"
				+"<td>" +s.getId()+"</td>"
				+"<td>"+s.getName()+" </td>"
				+"<td>"+s.getCity()+" </td>"
				+"</tr>"
				+"</font>");
			}
			
				out.write("<table>"+"</font>");
			}
		}
	}
}
