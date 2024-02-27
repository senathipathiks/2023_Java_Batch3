package com.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import com.emp.bean.Employee;
import com.emp.dao.EmployeeDAO;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {


	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0
				;
//		System.out.println("Inside dopost");
		EmployeeDAO dao=new EmployeeDAO();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		
		//insert
		if(action.equals("Insert")) {
			RequestDispatcher rd=request.getRequestDispatcher("insert1.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			String name=request.getParameter("sname");
			String city=request.getParameter("scity");
			int phoneno=Integer.parseInt(request.getParameter("sphoneno"));
			String department=request.getParameter("sdepartment");
			Employee emp=new Employee(id,name,city,phoneno,department);
			
			n=dao.insertEmployee(emp);
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
////delete
		if(action.equals("Delete")) {
			RequestDispatcher rd=request.getRequestDispatcher("delete1.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			
			n=dao.deleteCourse(id);
			if(n==1) {
				System.out.println("Inside delete");
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
			RequestDispatcher rd=request.getRequestDispatcher("update1.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			String name=request.getParameter("sname");
			String city=request.getParameter("scity");
			int phoneno=Integer.parseInt(request.getParameter("sphoneno"));
			String department=request.getParameter("sdepartment");
			Employee emp=new Employee(id,name,city,phoneno,department);
			
			n=dao.updateCourse(emp);
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
		  else if(action.equals("Find"))
	        {
	        	int id=Integer.parseInt(request.getParameter("id"));
	        	
				Employee emp=dao.findEmployee(id);
	        	if(emp!=null) {
	        		RequestDispatcher rd=request.getRequestDispatcher("findsuccess.jsp");
	        		request.setAttribute("bean", emp);
	        		rd.include(request,response);
	        		}
	        	else {
	        		response.sendRedirect("findfailure.jsp");

	        	}
	        	
	        }
		//findall
		else if(action.equals("Find All")) {
			LinkedList<Employee> Emp=new LinkedList<Employee>();
			
			 Emp=dao.findAllEmployee();
			if(Emp.size()>0) {
				RequestDispatcher rd=request.getRequestDispatcher("findAllsuccess.jsp");
        		request.setAttribute("bean", Emp);
        		rd.include(request, response);
			}
			else {
        		response.sendRedirect("findfailure.jsp");
			}
//				
		}
		}
	}


