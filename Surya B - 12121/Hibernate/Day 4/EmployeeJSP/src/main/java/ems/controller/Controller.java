package ems.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import ems.bean.Employee;
import ems.dao.Employeedao;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int n = 0;
		Employeedao dao = new Employeedao();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		

		if(action.equals("Insert"))
		{
			RequestDispatcher rd =request.getRequestDispatcher("Default.jsp");
			int id=Integer.parseInt(request.getParameter("eid"));
			String name=request.getParameter("ename");
			String role=request.getParameter("erole");
			String city=request.getParameter("ecity");
			Employee emp =new Employee(id,name,role, city);
			n=dao.insertEmployee(emp);
			if(n==1) {
				response.sendRedirect("insertsuccess.jsp");
			}
			else
			{
				response.sendRedirect("insertfailure.jsp");
			}
		}
		
		else if(action.equals("Find"))
		{

			int id=Integer.parseInt(request.getParameter("eid"));
			Employee emp = dao.findEmployee(id);
			if(emp!=null)
			{
				RequestDispatcher rd=request.getRequestDispatcher("FindSuccess.jsp");
				request.setAttribute("bean", emp);
				rd.include(request, response);
			}
			else
			{
			response.sendRedirect("Findfailure.jsp");
			}
		}
		
	if(action.equals("FindAll"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
			LinkedList<Employee> emp = new LinkedList<Employee>();
			emp=dao.findallEmployee();

			if(emp.size()>0) {
				RequestDispatcher rd1=request.getRequestDispatcher("findallsuccess.jsp");
				request.setAttribute("list",emp);
				rd1.include(request, response);				
		}
		else
			{
			rd.include(request, response);
			out.write("<h1> <font color=red> Record Not Found </font></h1>");
			}
		}

		
		if(action.equals("Update"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			int id=Integer.parseInt(request.getParameter("eid"));
			String name=request.getParameter("ename");
			String role=request.getParameter("erole");
			String city=request.getParameter("ecity");
			Employee emp = new Employee(id,name,role,city);
			n=dao.updateEmployee(emp);
			if(n==1) {
				rd.include(request, response);
				out.write("<h1> <font color=green> Record Updated Successfully </font></h1>");
			}
			else
			{
			rd.include(request, response);
			out.write("<h1> <font color=red> Record Not Found </font></h1>");
			}
		}
		
	 if(action.equals("Delete"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Default.jsp");
			int id=Integer.parseInt(request.getParameter("eid"));
			n=dao.deleteEmployee(id);
			if(n==1) {
				rd.include(request, response);
				out.write("<h1> <font color=green> Record Deleted Successfully </font></h1>");
			}
			
			else
			{
			rd.include(request, response);
			out.write("<h1> <font color=red> Record Not Found </font></h1>");
			}
		}
	}
	}


