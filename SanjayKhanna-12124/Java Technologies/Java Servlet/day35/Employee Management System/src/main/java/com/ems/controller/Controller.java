package com.ems.controller;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static EmployeeDAO dao = new EmployeeDAO();

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			RequestDispatcher rd = request.getRequestDispatcher("Insert.jsp");
			if(request.getParameter("empId")=="" || request.getParameter("empName")=="" || request.getParameter("empAge")=="" ) {
				rd.include(request, response);
				out.println("<br><div class=\"card card-body w-50\"><h4>No Field Should be Empty</h4></div>");
			}
			else {
				Employee emp = new Employee(Integer.parseInt(request.getParameter("empId")), request.getParameter("empName"), Integer.parseInt(request.getParameter("empAge")));
				int n = dao.insertEmployee(emp);
				if(n==1) {
					rd.include(request, response);
					out.println("<br><div class=\"card card-body w-50\"><h4>Record Inserted Successfully</h4></div>");
				}else {
					rd.include(request, response);
					out.println("<br><div class=\"card card-body w-50\"><h4>Insertion Failure</h4></div>");
				}
			}
		}
		
		else if(action.equals("Delete")) {
			RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
			if(request.getParameter("empId")=="") {
				rd.include(request, response);
				out.println("<br><div class=\"card card-body w-50\"><h4>No Field Should be Empty</h4></div>");
			}else {
				int id = Integer.parseInt(request.getParameter("empId"));
				int n = dao.deleteEmployee(id);
				if(n==1) {
					rd.include(request, response);
					out.println("<br><div class=\"card card-body w-50\"><h4>Record Deleted Successfully</h4></div>");
				}else {
					rd.include(request, response);
					out.println("<br><div class=\"card card-body w-50\"><h4>Deletion Failure</h4></div>");
				}
			}
		}
		
		else if(action.equals("Update")) {
			RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
			if(request.getParameter("empId")=="" || request.getParameter("empName")=="" || request.getParameter("empAge")=="" ) {
				rd.include(request, response);
				out.println("<br><div class=\"card card-body w-50\"><h4>No Field Should be Empty</h4></div>");
			}
			else {
				Employee emp = new Employee(Integer.parseInt(request.getParameter("empId")), request.getParameter("empName"), Integer.parseInt(request.getParameter("empAge")));
				int n = dao.updateEmployee(emp);
				if(n==1) {
					rd.include(request, response);
					out.println("<br><div class=\"card card-body w-50\"><h4>Record Updated Successfully</h4></div>");
				}else {
					rd.include(request, response);
					out.println("<br><div class=\"card card-body w-50\"><h4>Updation Failure Failure</h4></div>");
				}
			}
		}
		
		else if(action.equals("Search")) {
			RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
			if(request.getParameter("empId")=="") {
				rd.include(request, response);
				out.println("<br><div class=\"card card-body w-50\"><h4>No Field Should be Empty</h4></div>");
			}else {
				int id = Integer.parseInt(request.getParameter("empId"));
				Employee emp = dao.searchEmployee(id);
				if(emp==null) {
					rd.include(request, response);
					out.println("<br><div class=\"card card-body w-50\"><h4>No Record Found</h4></div>");
				}else {
					rd.include(request, response);
					out.println("<br><div class=\"card card-body w-50\"><table><tr style=\"font-weight:bold\"><td>Employee ID</td><td>Employee Name</td><td>Employee Age</td><tr>");
					out.println("<tr><td>"+emp.getEmpId()+"</td><td>"+emp.getEmpName()+"</td><td>"+emp.getEmpAge()+"</td></tr></table></div>");
				}
			}
		}
		
		else if(action.equals("View All")) {
			RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
			List<Employee> list = dao.viewAll();
			if(list.isEmpty()) {
				rd.include(request, response);
				out.println("<br><div class=\"card card-body w-50\"><h4>No Record Found</h4></div>");
			}else {
				rd.include(request, response);
				out.println("<br><div class=\"card card-body w-50\"><h4>No Of Record : "+list.size()+"</h4>");
				out.println("<br><table><tr style=\"font-weight:bold\"><td>Employee ID</td><td>Employee Name</td><td>Employee Age</td><tr>");
				for(Employee emp : list)
					out.println("<tr><td>"+emp.getEmpId()+"</td><td>"+emp.getEmpName()+"</td><td>"+emp.getEmpAge()+"</td></tr>");
				out.println("</table></div>");
			}
		}
	}

}
