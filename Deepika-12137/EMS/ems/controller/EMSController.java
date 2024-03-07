package com.ems.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.ems.DAO.EmployeeDAO;
import com.ems.bean.Employee;

/**
 * Servlet implementation class EMSController
 */
public class EMSController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("emsAction");

		System.out.println(action);
		EmployeeDAO dao = new EmployeeDAO();

		if (action.equals("InsertEmployee")) {
			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			Float esalary = Float.parseFloat(request.getParameter("esalary"));

			Employee employee = new Employee(eid, ename, esalary);
			int n = dao.insertEmployee(employee);

			if (n == 1) {
				response.sendRedirect("InsertEmployee.jsp?msg='Record Inserted Successfully'");
			} else {
				response.sendRedirect("InsertEmployee.jsp?msg='Record Insertion Failed'");
			}
		}

		if (action.equals("Fetch")) {
			int eid = Integer.parseInt(request.getParameter("eid"));

			Employee emp = dao.getEmployee(eid);

			List<Integer> idList = dao.getIdList();

			RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
			request.setAttribute("emp", emp);
			request.setAttribute("IdList", idList);
			rd.forward(request, response);

		}

		if (action.equals("UpdateEmployee")) {
			String msg = "Record Not Updated";

			List<Integer> idList = dao.getIdList();

			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			Float esalary = Float.parseFloat(request.getParameter("esalary"));

			Employee employee = new Employee(eid, ename, esalary);
			int n = dao.updateEmployee(employee);

			if (n == 1)
				msg = "Employee Record Updated";

			RequestDispatcher rd = request.getRequestDispatcher("UpdateEmployee.jsp");
			request.setAttribute("msg", msg);
			request.setAttribute("IdList", idList);
			rd.forward(request, response);

		}

		if (action.equals("DeleteEmployee")) {

			String msg = "Record Not Deleted";

			int eid = Integer.parseInt(request.getParameter("eid"));

			int n = dao.deleteEmployee(eid);

			if (n == 1)
				msg = "Employee Record Deleted";

			RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp");
			request.setAttribute("msg", msg);
			List<Integer> idList = dao.getIdList();
			request.setAttribute("IdList", idList);
			rd.forward(request, response);

		}

		if (action.equals("Search")) {
			int eid = Integer.parseInt(request.getParameter("eid"));

			Employee emp = dao.getEmployee(eid);

			List<Integer> idList = dao.getIdList();

			RequestDispatcher rd = request.getRequestDispatcher("FindEmployee.jsp");
			request.setAttribute("emp", emp);
			request.setAttribute("IdList", idList);
			rd.forward(request, response);

		}

		if (action.equals("Edit/Save")) {

			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			Float esalary = Float.parseFloat(request.getParameter("esalary"));

			Employee employee = new Employee(eid, ename, esalary);
			dao.updateEmployee(employee);

			List<Employee> empList = dao.getAllEmployee();
			RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
			request.setAttribute("EmpList", empList);
			rd.forward(request, response);

		}

		if (action.equals("Remove")) {

			int eid = Integer.parseInt(request.getParameter("eid"));

			int n = dao.deleteEmployee(eid);

			List<Employee> empList = dao.getAllEmployee();
			RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
			request.setAttribute("EmpList", empList);
			rd.forward(request, response);

		}

		if (action.equals("Insert")) {
			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			Float esalary = Float.parseFloat(request.getParameter("esalary"));

			Employee employee = new Employee(eid, ename, esalary);
			dao.insertEmployee(employee);
			
			List<Employee> empList = dao.getAllEmployee();
			RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
			request.setAttribute("EmpList", empList);
			rd.forward(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("emsAction");
		EmployeeDAO dao = new EmployeeDAO();

		if (action.equals("Update")) {
			List<Integer> idList = dao.getIdList();
			RequestDispatcher rd = req.getRequestDispatcher("UpdateEmployee.jsp");
			req.setAttribute("IdList", idList);
			rd.forward(req, resp);
		}

		if (action.equals("Delete")) {
			List<Integer> idList = dao.getIdList();
			RequestDispatcher rd = req.getRequestDispatcher("DeleteEmployee.jsp");
			req.setAttribute("IdList", idList);
			rd.forward(req, resp);
		}

		if (action.equals("Find")) {
			List<Integer> idList = dao.getIdList();
			RequestDispatcher rd = req.getRequestDispatcher("FindEmployee.jsp");
			req.setAttribute("IdList", idList);
			rd.forward(req, resp);
		}

		if (action.equals("FindAll")) {
			List<Employee> empList = dao.getAllEmployee();
			RequestDispatcher rd = req.getRequestDispatcher("FindAllEmployee.jsp");
			req.setAttribute("EmpList", empList);
			rd.forward(req, resp);
		}

	}

}
