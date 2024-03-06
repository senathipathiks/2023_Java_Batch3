package com.ems.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static EmployeeDAO dao = new EmployeeDAO();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch(request.getParameter("action")) {
		case "insert":insert(request,response);break;
		case "delete":delete(request,response);break;
		case "update":update(request,response);break;
		case "home" :viewAll(request, response);break;
		case "search":search(request, response);break;
		case "edit":edit(request, response);break;
		case "deletenow": deleteNow(request, response);break;
		case "save" : save(request, response);break;
		case "back" : back(request, response);break;
		case "add" : add(request, response);break;
		default:viewAll(request, response);
		}
		
	}

	
	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
		dao.insertEmployee(getEmployee(request, response));
		 request.setAttribute("list", dao.veiwAll());
		 rd.include(request, response);
	}


	private void back(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
		 request.setAttribute("list", dao.veiwAll());
		 rd.include(request, response);
		
	}


	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
		 dao.updateEmployee(getEmployee(request, response));
		 request.setAttribute("list", dao.veiwAll());
		 rd.include(request, response);
		
	}


	private void deleteNow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
		 dao.deleteEmployee(Integer.parseInt(request.getParameter("empId")));
		 request.setAttribute("list", dao.veiwAll());
		 rd.include(request, response);
	}


	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
		request.setAttribute("bean", dao.searchEmployee(Integer.parseInt(request.getParameter("empId"))));
		request.setAttribute("list", dao.veiwAll());
		rd.forward(request, response);
		
	}


	private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
		request.setAttribute("keys", dao.getIds());
		rd.forward(request, response);
	}


	private void viewAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
		request.setAttribute("list", dao.veiwAll());
		rd.forward(request, response);
	}


	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
		request.setAttribute("keys", dao.getIds());
		rd.forward(request, response);
		
	}


	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
		request.setAttribute("keys", dao.getIds());
		rd.include(request, response);
		
	}


	private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Insert.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("button");
		PrintWriter out = response.getWriter();
		
		if(action.equals("Fetch")) {
			RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
			request.setAttribute("bean", dao.searchEmployee(Integer.parseInt(request.getParameter("empId"))));
			request.setAttribute("keys", dao.getIds());
			rd.include(request, response);
			
		}else if(action.equals("Insert")) {
			RequestDispatcher rd = request.getRequestDispatcher("Insert.jsp");
			Employee emp = getEmployee( request,response);
			int n = dao.insertEmployee(emp);
			if(n==1) {
				request.setAttribute("msg", "success");
				rd.include(request, response);
			}
			else{
				request.setAttribute("msg", "Fail");
				rd.include(request, response);
			}
	
		}else if(action.equals("Update")) {
			RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
			Employee emp = getEmployee( request,response);
			int n = dao.updateEmployee(emp);
			if(n==1) {
				request.setAttribute("keys", dao.getIds());
				request.setAttribute("msg", "success");
				rd.include(request, response);
			}
			else{
				request.setAttribute("keys", dao.getIds());
				request.setAttribute("msg", "Fail");
				rd.include(request, response);
			}
		}else if(action.equals("Delete")) {
			RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
			int id = getId(request, response);
			boolean n = dao.deleteEmployee(id);
			if(n) {
				request.setAttribute("keys", dao.getIds());
				request.setAttribute("msg", "success");
				rd.include(request, response);
			}
			else{
				request.setAttribute("keys", dao.getIds());
				request.setAttribute("msg", "Fail");
				rd.include(request, response);
			}
		}else if(action.equals("Search")) {
			RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
			int id = getId(request, response);
			Employee emp = dao.searchEmployee(id);
			if(emp != null) {
				request.setAttribute("keys", dao.getIds());
				request.setAttribute("bean", emp);
				request.setAttribute("msg", "success");
				rd.include(request, response);
			}
			else{
				request.setAttribute("keys", dao.getIds());
				request.setAttribute("msg", "Fail");
				rd.include(request, response);
			}
		}else
			doGet(request, response);
	}
	
	private Employee getEmployee(HttpServletRequest request, HttpServletResponse response) {
		return new Employee(Integer.parseInt(request.getParameter("empId")),request.getParameter("empName"),Float.parseFloat(request.getParameter("empSalary")));
	}
	
	private int getId(HttpServletRequest request, HttpServletResponse response) {
		return Integer.parseInt(request.getParameter("empId"));
	}

}
