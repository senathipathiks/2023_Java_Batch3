package com.ems.main;

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
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("emsbtn");
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println(action);

		if (action.equals("Insert Employee")) {
			int eid = Integer.parseInt(request.getParameter("id"));
			String ename = request.getParameter("name");
			String esalary = request.getParameter("salary");

			Employee employee = new Employee(eid, ename, esalary);
			System.out.println(employee);

			int n = dao.insertEmployee(employee);
			if (n == 1) {
				response.sendRedirect("Insert.jsp?msg='Employee record inserted'");
			}
			else
			{
				response.sendRedirect("Insert.jsp?msg='Employee record not inserted'");
			}
		}
		/*
		 * else if(action.equals("Update Employee")) { int
		 * eid=Integer.parseInt(request.getParameter("id")); String
		 * ename=request.getParameter("name"); String
		 * esalary=request.getParameter("salary");
		 * 
		 * Employee employee =new Employee(eid, ename, esalary); int
		 * n=dao.UpdateEmployee(employee);
		 * 
		 * if(n==1) { response.sendRedirect("Update.jsp?msg=Employee Record Updated"); }
		 * else {
		 * response.sendRedirect("Update.jsp?msg1='Employee Record Updation Fail'"); }
		 * 
		 * 
		 * }
		 */
		
	}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doGet(req, resp);
			String action = req.getParameter("emsAction");
			EmployeeDAO dao = new EmployeeDAO();
			
			if(action.equals("Update Employee"))
			{
				List<Integer> idList = dao.getIdList();
				RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");
				req.setAttribute("IdList", idList);
				rd.forward(req,  resp);
			}
		}
}
