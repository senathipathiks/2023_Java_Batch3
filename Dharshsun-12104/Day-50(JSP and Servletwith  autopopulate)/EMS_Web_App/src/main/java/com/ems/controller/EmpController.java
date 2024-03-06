package com.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

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



public class EmpController extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("emsAction");
		EmployeeDAO dao = new EmployeeDAO();
		
		if(action.equals("InsertEmployee")) {
			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			int eage = Integer.parseInt(request.getParameter("eage"));
			
			Employee emp = new Employee(eid,ename,eage);
			
			int n = dao.insertEmployee(emp);
			if(n==1)
			{
				response.sendRedirect("InsertEmployee.jsp?msg='Employee record inserted'");
			}
			else
			{
				response.sendRedirect("InsertEmployee.jsp?msg='Employee record not inserted'");
			}
		}
			
		if(action.equals("Fetch")){
			int eid = Integer.parseInt(request.getParameter("eid"));
			Employee emp = dao.getEmployee(eid);
			List<Integer> idList = dao.getIdList();
			RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
			request.setAttribute("emp", emp);
			request.setAttribute("IdList", idList);
			rd.forward(request, response);
		}
		if(action.equals("UpdateEmployee")) {
			
			List<Integer> idlist = dao.getIdList();
			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			int eage = Integer.parseInt(request.getParameter("eage"));
			
			Employee emp = new Employee(eid,ename,eage);
			
			int n = dao.updateEmployee(emp);
			
		
			if(n>0) {
				RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp?msg=Updation successfull");
				request.setAttribute("IdList", idlist);
				rd.forward(request, response);
			
				
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp?msg=Updation failure");
				request.setAttribute("IdList", idlist);
				rd.forward(request, response);
				
			}
			
		}
			
			if(action.equals("Delete Employee")) {
			
				PrintWriter out = response.getWriter();
				out.print("delete");
				int n=0;
				int id = Integer.parseInt(request.getParameter("eid"));
				n=dao.deleteEmployee(id);
				List<Integer> list = dao.getIdList();
				
				
				if(n==1) {
					RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp?msg='Deletion successfull'");
					request.setAttribute("IdList", list);
					rd.forward(request, response);

				}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp?msg='Deletion failure'");
					request.setAttribute("IdList", list);
					rd.forward(request, response);
				}
			}
			if(action.equals("Find")) {
				int id = Integer.parseInt(request.getParameter("eid"));
				List<Integer> list = dao.getIdList();
				Employee emp = dao.getEmployee(id);
				if(emp!=null) {
					RequestDispatcher rd = request.getRequestDispatcher("FindEmployee.jsp");
					request.setAttribute("IdList", list);
					request.setAttribute("emp", emp);
					rd.forward(request, response);
				}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("FindEmployee.jsp?msg=Record Not Found");
					request.setAttribute("IdList", list);
					rd.forward(request, response);
				}
			}
		
		
	}
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			String action = request.getParameter("emsAction");
			EmployeeDAO dao = new EmployeeDAO();
			
			if(action.equals("Update")) {
				List<Integer> idList = dao.getIdList();
				RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
				request.setAttribute("IdList", idList);
				rd.forward(request, response);
			}
			
		
		if(action.equals("Fetch")){
			int eid = Integer.parseInt(request.getParameter("eid"));
			Employee emp = dao.getEmployee(eid);
			List<Integer> idList = dao.getIdList();
			RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
			request.setAttribute("emp", emp);
			request.setAttribute("IdList", idList);
			rd.forward(request, response);
		}
		
		
		
		if(action.equals("Delete")) {
			List<Integer> idlist = dao.getIdList();
			RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp");
			request.setAttribute("IdList", idlist);
			rd.forward(request, response);
		}
			
		 if(action.equals("Find")) {
			
			 List<Integer> idlist = dao.getIdList();
			 RequestDispatcher rd = request.getRequestDispatcher("FindEmployee.jsp");
			 request.setAttribute("IdList", idlist);
			 rd.forward(request, response);
		 }
			
		}
		
}
		

	


