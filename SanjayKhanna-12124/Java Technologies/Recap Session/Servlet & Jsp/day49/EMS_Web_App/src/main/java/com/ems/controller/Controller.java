package com.ems.controller;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static EmployeeDAO dao = new EmployeeDAO();
  
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		switch(req.getParameter("action")) {
		case "Insert" : insertPage(req,resp);break;
		case "Update" : updatePage(req,resp);break;
		case "Delete" : deletePage(req,resp);break;
		case "Search" : searchPage(req,resp);break;
		case "ViewAll" : viewAllPage(req,resp);break;
		}
	}

	private void viewAllPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	private void searchPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("Search.jsp");
		req.setAttribute("key", dao.getIds());
		rd.forward(req, resp);
		
	}

	private void deletePage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("Delete.jsp");
		req.setAttribute("key", dao.getIds());
		rd.forward(req, resp);
		
	}

	private void updatePage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("UpdateEmployee.jsp");
		req.setAttribute("key", dao.getIds());
		rd.forward(req, resp);
		
	}

	private void insertPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("InsertEmployee.jsp");
		rd.forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		
		if(action.equals("Fetch")) {
		
			RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
			Employee emp = dao.searchEmployee(Integer.parseInt(request.getParameter("empId")));
			request.setAttribute("bean", emp);
			request.setAttribute("key", dao.getIds());
			rd.include(request, response);
			
		}
		
		if(action.equals("Insert")) {
			RequestDispatcher rd = request.getRequestDispatcher("InsertEmployee.jsp");
			Employee emp = getEmployee( request,response);
			int n = dao.insertEmployee(emp);
			if(n==1) {
				rd.include(request, response);
				out.print("<br><h1>Record Insert Successfully</h1>");
			}
			else{
				rd.include(request, response);
				out.print("<br><h1>Insertion Failure</h1>");
			}
			
		}else if(action.equals("Update")) {
			RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
			Employee emp = getEmployee( request,response);
			int n = dao.updateEmployee(emp);
			if(n==1) {
				request.setAttribute("key", dao.getIds());
				rd.include(request, response);
				out.print("<br><h1>Record Update Successfully</h1>");
			}
			else{
				request.setAttribute("key", dao.getIds());
				rd.include(request, response);
				out.print("<br><h1>Updation Failure</h1>");
			}
		}else if(action.equals("Delete")) {
			RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
			int id = getId(request, response);
			boolean n = dao.deleteEmployee(id);
			if(n) {
				request.setAttribute("key", dao.getIds());
				rd.include(request, response);
				out.print("<br><h1>Record Deleted Successfully</h1>");
			}
			else{
				request.setAttribute("key", dao.getIds());
				rd.include(request, response);
				out.print("<br><h1>Deletion Failure</h1>");
			}
		}else if(action.equals("Search")) {
			RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
			int id = getId(request, response);
			Employee emp = dao.searchEmployee(id);
			if(emp != null) {
				request.setAttribute("key", dao.getIds());
				rd.include(request, response);
				out.print("<br><table><tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th></tr>");
				out.print("<tr><td>"+emp.getEmpId()+"</td><td>"+emp.getEmpName()+"</td><td>"+emp.getEmpsalary()+"</td></tr></table>");
			}
			else{
				request.setAttribute("key", dao.getIds());
				rd.include(request, response);
				out.print("<br><h1>Search not found</h1>");
			}
		}else if(action.equals("ViewAll")){
			RequestDispatcher rd = request.getRequestDispatcher("ViewAll.jsp");
			ArrayList<Employee> list = dao.veiwAll();
			if(list != null) {
				rd.include(request, response);
				out.print("<br><h1>No of Record : "+list.size()+"</h1>");
				out.print("<br><table><tr><th>Employee Id</th><th>Employee Name</th><th>Employee Salary</th></tr>");
				for(Employee emp : list)
					out.print("<tr><td>"+emp.getEmpId()+"</td><td>"+emp.getEmpName()+"</td><td>"+emp.getEmpsalary()+"</td></tr>");
				out.print("</table>");
			}
			else{
				rd.include(request, response);
				out.print("<br><h1>Search not found</h1>");
			}
		}
		
	}

	private Employee getEmployee(HttpServletRequest request, HttpServletResponse response) {
		return new Employee(Integer.parseInt(request.getParameter("empId")),request.getParameter("empName"),Float.parseFloat(request.getParameter("empSalary")));
	}
	
	private int getId(HttpServletRequest request, HttpServletResponse response) {
		return Integer.parseInt(request.getParameter("empId"));
	}

}
