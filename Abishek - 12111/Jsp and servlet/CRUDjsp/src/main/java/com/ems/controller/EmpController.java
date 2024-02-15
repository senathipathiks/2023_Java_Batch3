package com.ems.controller;

import jakarta.servlet.ServletException;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static EmployeeDAO dao = new EmployeeDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			if(request.getParameter("empId")=="" || request.getParameter("empName")=="" || request.getParameter("empAge")=="" ) {
				response.sendRedirect("Empty.jsp?action=Insert");

			}
			else {
				Employee emp = new Employee(Integer.parseInt(request.getParameter("empId")), request.getParameter("empName"), Integer.parseInt(request.getParameter("empAge")));
				n = dao.insertEmployee(emp);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		}
		
		else if(action.equals("Delete")) {
			if(request.getParameter("empId")=="") {
				response.sendRedirect("Empty.jsp?action=Delete");
			}else {
				int id = Integer.parseInt(request.getParameter("empId"));
				n = dao.deleteEmployee(id);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Delete");
				}else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
			}
		}
		
		else if(action.equals("Update")) {
			if(request.getParameter("empId")=="" || request.getParameter("empName")=="" || request.getParameter("empAge")=="" ) {
				response.sendRedirect("Empty.jsp?action=Update");

			}
			else {
				Employee emp = new Employee(Integer.parseInt(request.getParameter("empId")), request.getParameter("empName"), Integer.parseInt(request.getParameter("empAge")));
				n = dao.updateEmployee(emp);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
			}
		}
		
		else if(action.equals("Search")) {
			if(request.getParameter("empId")=="") {
				response.sendRedirect("Empty.jsp?action=Search");
			}else {
				int id = Integer.parseInt(request.getParameter("empId"));
				Employee emp = dao.searchEmployee(id);
				if(emp==null) {
					response.sendRedirect("Failure.jsp?action=Search");
				}else {
					request.getSession().setAttribute("bean", emp);
					response.sendRedirect("Success.jsp?action=Search");
				}
			}
		}
		
		else if(action.equals("View All")) {
			List<Employee> list = dao.viewAll();
			if(list.isEmpty()) {
				response.sendRedirect("Failure.jsp?action=View");
			}else {
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Success.jsp?action=View");
			}
		}
	}

}