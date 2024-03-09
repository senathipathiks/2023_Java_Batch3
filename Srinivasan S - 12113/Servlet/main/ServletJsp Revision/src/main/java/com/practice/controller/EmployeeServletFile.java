package com.practice.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.practice.bean.Employee;
import com.practice.dao.EmployeeDAO;

public class EmployeeServletFile extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("button");
		int n=0;
		EmployeeDAO dao=new EmployeeDAO();
		PrintWriter pw=response.getWriter();
		
		if (action.equals("Add")) {
			int eid=Integer.parseInt(request.getParameter("eid"));
			String ename=request.getParameter("ename");
			String edesig=request.getParameter("edesig");
			
			Employee emp=new Employee(eid, ename, edesig);
			n=dao.insertEmp(emp);
			
			request.setAttribute("action", action);
			if(n==1) {
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Add'");
				rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Add'");
				rd.include(request, response);

			}
			
		}
		
		else if(action.equals("Delete")) {
			int eid=Integer.parseInt(request.getParameter("eid"));
			System.out.println(eid+" delete controller");
			dao.deleteEmp(eid)	;
			List<Employee> idlist = dao.findallEmp();
			
//			request.setAttribute("action", action);
			
//			if(n==1) {
//				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Delete'");
				RequestDispatcher rd=request.getRequestDispatcher("FindAll.jsp");
				request.setAttribute("Idlist", idlist);
				rd.forward(request, response);
//			}
//			else {
//				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Delete'");
//				rd.include(request, response);
//
//			}

		}
		
		else if(action.equals("Update")) {
			int eid=Integer.parseInt(request.getParameter("eid"));
			String ename=request.getParameter("ename");
			String edesig=request.getParameter("edesig");
			
			Employee emp=new Employee(eid, ename, edesig);
			n=dao.updateEmp(emp);
			
			request.setAttribute("action", action);
			
			if(n==1) {
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Update'");
				rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Update'");
				rd.include(request, response);

			}
			
			
			
		}
		
		else if(action.equals("Fetch")) {
			int eid1=Integer.parseInt(request.getParameter("eid"));
			
			try {
				
				List<Integer> idlist=dao.getId();
				Employee emp=dao.getEmp(eid1);
				RequestDispatcher rd=request.getRequestDispatcher("UpdateEmp.jsp");
				request.setAttribute("emp", emp);
				request.setAttribute("Idlist", idlist);
				rd.forward(request, response);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(action.equals("Search")) {
			int eid=Integer.parseInt(request.getParameter("eid"));
			
			try {
//				List<Integer> idlist=dao.getId();
				Employee emp=dao.getEmp(eid);
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		else if(action.equals("Edit")) {
			int eid=Integer.parseInt(request.getParameter("eid"));
			String ename=request.getParameter("ename");
			String edesig=request.getParameter("edesig");
			
			Employee emp=new Employee(eid, ename, edesig);
			n=dao.updateEmp(emp);
			
			List<Employee>idlist=dao.findallEmp();
			RequestDispatcher rd=request.getRequestDispatcher("FindAll.jsp");
			request.setAttribute("Idlist", idlist);
			rd.forward(request, response);
		}
		
		else if(action.equals("Save")) {
			int eid=Integer.parseInt(request.getParameter("eid"));
			String ename=request.getParameter("ename");
			String edesig=request.getParameter("edesig");
			
			Employee emp=new Employee(eid, ename, edesig);
			n=dao.insertEmp(emp);
			
			List<Employee>idlist=dao.findallEmp();
			RequestDispatcher rd=request.getRequestDispatcher("FindAll.jsp");
			request.setAttribute("Idlist", idlist);
			rd.forward(request, response);
		}
		
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("button");
		EmployeeDAO dao=new EmployeeDAO();
		
		if(action.equals("Update")) {
			List<Integer> idlist=dao.getId();
			RequestDispatcher rd=request.getRequestDispatcher("UpdateEmp.jsp");
			request.setAttribute("Idlist", idlist);
			rd.forward(request, response);
		}
		else if(action.equals("Search")) {
			List<Integer> idlist=dao.getId();
			System.out.println(idlist);
			RequestDispatcher rd=request.getRequestDispatcher("SearchEmp.jsp");
			request.setAttribute("Idlist", idlist);
			rd.forward(request, response);
		}
		else if(action.equals("Delete")) {
			List<Integer> idlist=dao.getId();
			System.out.println(idlist);
			RequestDispatcher rd=request.getRequestDispatcher("DeleteEmp.jsp");
			request.setAttribute("Idlist", idlist);
			rd.forward(request, response);
		}
		else if(action.equals("FindAll")) {
			List<Employee> idlist=dao.findallEmp();
			System.out.println(idlist);
			RequestDispatcher rd=request.getRequestDispatcher("FindAll.jsp");
			request.setAttribute("Idlist", idlist);
			rd.forward(request, response);
		}
		
	}
	
}
