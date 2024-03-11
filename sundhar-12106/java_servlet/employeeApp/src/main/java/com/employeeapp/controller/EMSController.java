package com.employeeapp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.employeeapp.bean.Employee;
import com.employeeapp.dao.EmployeeDAO;

public class EMSController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("emsAction");
		System.out.println(action);
		EmployeeDAO dao = new EmployeeDAO();

		if (action.equals("Update")) {

			ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
			System.out.println(ls);
			RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");
			req.setAttribute("ls", ls);
			rd.include(req, resp);

		} else if (action.equals("Delete")) {

			ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
			System.out.println(ls);
			RequestDispatcher rd = req.getRequestDispatcher("Delete.jsp");
			req.setAttribute("ls", ls);
			rd.include(req, resp);

		} else if (action.equals("Find")) {
			ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
			System.out.println(ls);
			RequestDispatcher rd = req.getRequestDispatcher("Find.jsp");
			req.setAttribute("ls", ls);
			rd.include(req, resp);
		} else if (action.equals("FindAll")) {
			ArrayList<Employee> ls = (ArrayList<Employee>) dao.fetchAll();
			RequestDispatcher rd = req.getRequestDispatcher("FindAll.jsp");
			req.setAttribute("ls", ls);
			rd.include(req, resp);

		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getParameter("emsAction");
		EmployeeDAO dao = new EmployeeDAO();

		System.out.println(action);

		if (action.equals("InsertEmployee")|| action.equals("InsertEmployee1")) {
			int id = Integer.parseInt(req.getParameter("eid"));
			String name = req.getParameter("name");
			double salary = Double.parseDouble(req.getParameter("salary"));

			Employee employee = new Employee(id, name, salary);
			int n = dao.insertEmployee(employee);

			if (action.equals("InsertEmployee1")) {
				RequestDispatcher rd = req.getRequestDispatcher("FindAll.jsp");
				ArrayList<Employee> ls = (ArrayList<Employee>) dao.fetchAll();
				if (n == 1) {
					req.setAttribute("ls", ls);
					req.setAttribute("result", "Success");
				}else {
					req.setAttribute("ls", ls);
					req.setAttribute("result", "Failure");
				}
				rd.include(req, resp);
			}else {
				RequestDispatcher rd = req.getRequestDispatcher("Insert.jsp");
				if (n == 1)
					req.setAttribute("result", "Success");
				else
					req.setAttribute("result", "Failure");
				rd.include(req, resp);
			}

		} else if (action.equals("UpdateEmployee") || action.equals("UpdateEmp")) {
			System.out.println(req.getParameter("eid") + "eid");
			int id = Integer.parseInt(req.getParameter("eid"));
			String name = req.getParameter("name");
			double salary = Double.parseDouble(req.getParameter("salary"));

			Employee employee = new Employee(id, name, salary);
			int n = dao.updateEmployee(employee);

			if (action.equals("UpdateEmployee")) {
				ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();

				RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");

				if (n == 1) {
					req.setAttribute("ls", ls);
					req.setAttribute("result", "Success");
				} else {
					req.setAttribute("ls", ls);
					req.setAttribute("result", "Failure");
				}
				rd.include(req, resp);
			} else if (action.equals("UpdateEmp")) {
				ArrayList<Employee> ls = (ArrayList<Employee>) dao.fetchAll();
				RequestDispatcher rd = req.getRequestDispatcher("FindAll.jsp");
				req.setAttribute("ls", ls);
				rd.include(req, resp);
			}
		} else if (action.equals("find")) {

			int id = Integer.parseInt(req.getParameter("eid"));

			Employee employee = dao.findEmployee(id);
			RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");

			if (employee != null) {
				req.setAttribute("employee", employee);
			}
			rd.include(req, resp);

		} else if (action.equals("findById")) {

			int id = Integer.parseInt(req.getParameter("eid"));

			Employee employee = dao.findEmployee(id);
			ArrayList<Integer> ls = (ArrayList<Integer>) dao.idList();
			RequestDispatcher rd = req.getRequestDispatcher("Find.jsp");

			if (employee != null) {

				req.setAttribute("employee", employee);
			}
			req.setAttribute("ls", ls);
			rd.include(req, resp);

		} else if (action.equals("DeleteEmployee") || action.equals("DeleteEmp")) {

			int id = Integer.parseInt(req.getParameter("eid"));

			int n = dao.deleteEmployee(id);

			if (action.equals("DeleteEmployee")) {

				RequestDispatcher rd = req.getRequestDispatcher("Delete.jsp");

				if (n == 1) {
					req.setAttribute("result", "Success");
					rd.include(req, resp);
				} else {
					req.setAttribute("result", "Failure");
					rd.include(req, resp);
				}

			} else if (action.equals("DeleteEmp")) {
				ArrayList<Employee> ls = (ArrayList<Employee>) dao.fetchAll();
				RequestDispatcher rd = req.getRequestDispatcher("FindAll.jsp");
				req.setAttribute("ls", ls);
				rd.include(req, resp);

			}
		}

	}

}
