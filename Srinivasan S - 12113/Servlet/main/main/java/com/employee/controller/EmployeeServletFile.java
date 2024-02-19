package com.employee.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDAO;
import com.mysql.cj.Session;

/**
 * Servlet implementation class EmployeeServletFile
 */
public class EmployeeServletFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int n=0;
		
		EmployeeDAO dao=new EmployeeDAO();
		
		PrintWriter pw=response.getWriter();
		
		String action=request.getParameter("button");
		
		System.out.println(action);
		
		
		if(action.equals("Add")) {	// insert operation
			
//			RequestDispatcher rd=request.getRequestDispatcher("Add.jsp");
			
			int id=Integer.parseInt(request.getParameter("empid"));
			String name=request.getParameter("empname");
			String email=request.getParameter("email");
			String city=request.getParameter("city");
			
			Employee emp=new Employee(id, name, email, city);
			n=dao.addEmployee(emp);
			System.out.println(n);
			request.setAttribute("action", action);
			if(n==1) {
				
//				response.sendRedirect("Success.jsp?action='Add'");
				
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Add'");
				rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Add'");
				rd.include(request, response);
//				response.sendRedirect("Fail.jsp?action='Add'");
			}
		}
		
		else if(action.equals("Delete")) {	// delete operation
			
//			RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
			
			int id=Integer.parseInt(request.getParameter("empid"));
			
			n=dao.deleteEmployee(id);
			request.setAttribute("action", action);
			if(n==1) {
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Delete'");
				
				rd.include(request, response);
//				response.sendRedirect("Success.jsp?action=Delete");
			}
			else {
				
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Delete'");
//				response.sendRedirect("Fail.jsp?action=Delete");
			}		
			
		}
		
		else if(action.equals("Update")) {
			
			int id=Integer.parseInt(request.getParameter("empid"));
			String name=request.getParameter("empname");
			String email=request.getParameter("email");
			String city=request.getParameter("city");
			
			Employee emp=new Employee(id, name, email, city);
			n=dao.updateEmployee(emp);
			request.setAttribute("action", action);
			if(n==1) {
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Update'");
				rd.include(request, response);
//				response.sendRedirect("Success.jsp?action=Update");
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Update'");
				rd.include(request, response);
				

			}		
		}
		else if(action.equals("Search")) {
			
			int id=Integer.parseInt(request.getParameter("empId"));
			
			Employee emp=dao.searchEmployee(id);
			
			request.setAttribute("action", action);
			if(emp!=null) {
				request.setAttribute("bean", emp);
				
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Search'");
				rd.include(request, response);
				

			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Search'");
				rd.include(request, response);


			}
		}
		else if(action.equals("FindAll")) {
			
			
			LinkedList<Employee> list=dao.ReadAll();
			
		request.setAttribute("action", action);
		System.out.println(list);
			if(list!=null) {
				
				request.setAttribute("list", list);
				
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='FindAll'");
				rd.include(request, response);
//				response.sendRedirect("Success.jsp?action=FindAll");
			}
			else {
				response.encodeRedirectURL("Fail.jsp?action=FindAll");
			}
		}
		
		
	}

}
