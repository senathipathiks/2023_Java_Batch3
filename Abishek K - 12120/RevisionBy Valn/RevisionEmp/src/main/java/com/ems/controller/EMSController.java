package com.ems.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;


public class EMSController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("emsAction");
		EmployeeDAO dao = new EmployeeDAO(); 
		
		if(action.equals("Insert")) {
			
			int empid = Integer.parseInt(request.getParameter("empid"));
			String empname = request.getParameter("empname");
			String empsalary = request.getParameter("empsalary");
			
			Employee emp = new Employee(empid, empname, empsalary);	
			
			int n = dao.insertEmployee(emp);
			
			if(n==1) {
				response.sendRedirect("InsertEmployee.jsp?msg='Employee Record Inserted'");
			}
			else {
				response.sendRedirect("InsertEmployee.jsp?msg='Employee Record Not Inserted'");
			}
		}
		
		if(action.equals("fetch")) {
			
			int empid = Integer.parseInt(request.getParameter("empid"));
			Employee emp = dao.getEmployee(empid);
			List<Integer> list = dao.getIdList();
			RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
			request.setAttribute("emp", emp);
			request.setAttribute("idList", list);
			rd.forward(request, response);

		}
		
		if(action.equals("Update")) {
			
			int n=0;
			List<Integer> list = dao.getIdList();
			int empid = Integer.parseInt(request.getParameter("empid"));
			String empname = request.getParameter("empname");
			String empsalary = request.getParameter("empsalary");
			
			Employee emp = new Employee(empid, empname, empsalary);	
			n=dao.updateEmployee(emp);
			
			
			if(n==1) {
				RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp?msg=Updation successfull");
				request.setAttribute("idList", list);
				rd.forward(request, response);
			
				
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp?msg=Updation failure");
				request.setAttribute("idList", list);
				rd.forward(request, response);
				
			}
		}
		
		if(action.equals("Delete")) {
			
			int n=0;
			int id = Integer.parseInt(request.getParameter("empid"));
			List<Integer> list = dao.getIdList();
			n=dao.deleteEmployee(id);
			if(n==1) {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp?msg=Deletion successfull");
				request.setAttribute("idList", list);
				rd.forward(request, response);
			
				
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp?msg=Deletion failure");
				request.setAttribute("idList", list);
				rd.forward(request, response);
				
			}
			
		}
		
		if(action.equals("Find")) {	
			int id = Integer.parseInt(request.getParameter("empid"));
			
			List<Integer> list = dao.getIdList();
			Employee emp = dao.getEmployee(id);
			
			if(emp!=null) {
				RequestDispatcher rd = request.getRequestDispatcher("FindEmployee.jsp");
				request.setAttribute("idList", list);
				request.setAttribute("emp", emp);
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("FindEmployee.jsp?msg=Record Not Found");
				request.setAttribute("idList", list);
				rd.forward(request, response);
			}
			
		}
		
		if(action.equals("Save/Edit")){
			
			int empid = Integer.parseInt(request.getParameter("empid"));
			String empname = request.getParameter("empname");
			String empsalary = request.getParameter("empsalary");
			
			Employee emp = new Employee(empid, empname, empsalary);
			int n = dao.updateEmployee(emp);
			
			List<Employee> list = dao.findallEmployee();
			RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
			request.setAttribute("EmpList", list);
			rd.forward(request, response);
		}
		
		if(action.equals("Remove")) {
			
			int n=0;
			int id = Integer.parseInt(request.getParameter("empid"));
			n=dao.deleteEmployee(id);
			List<Employee> list = dao.findallEmployee();
			if(n==1) {
				RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
				request.setAttribute("EmpList", list);
				rd.forward(request, response);
			
				
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
				request.setAttribute("EmpList", list);
				rd.forward(request, response);
				
			}
			
		}
		
		if(action.equals("Save")) {
			
			int empid = Integer.parseInt(request.getParameter("empid"));
			String empname = request.getParameter("empname");
			String empsalary = request.getParameter("empsalary");
			
			Employee emp = new Employee(empid, empname, empsalary);	
			
			int n = dao.insertEmployee(emp);
			
			List<Employee> list = dao.findallEmployee();
			RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
			request.setAttribute("EmpList", list);
			rd.forward(request, response);
			
				
			
			
		}
		
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String action = request.getParameter("emsAction"); //HyperLink Default metohd is "GET"
		EmployeeDAO dao = new EmployeeDAO();
		
		if(action.equals("Update")) {
			List<Integer> idList = dao.getIdList();
			RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
			request.setAttribute("idList", idList);
			rd.forward(request, response);
		}
		
		if(action.equals("Delete")) {
			List<Integer> list = dao.getIdList();
			RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp");
			request.setAttribute("idList", list);
			rd.forward(request, response);
		}
		if(action.equals("Find")) {
			
			Employee emp = null;
			List<Integer> list = dao.getIdList();
			RequestDispatcher rd = request.getRequestDispatcher("FindEmployee.jsp");
			request.setAttribute("idList", list);
			request.setAttribute("emp",emp);
			rd.forward(request, response);
		}
		if(action.equals("FindAll")) {
			
			List<Employee> list = dao.findallEmployee();
			RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
			request.setAttribute("EmpList", list);
			rd.forward(request, response);
		}
		
	}

}
