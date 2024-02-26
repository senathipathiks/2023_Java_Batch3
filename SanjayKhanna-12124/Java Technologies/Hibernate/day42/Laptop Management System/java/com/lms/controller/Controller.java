package com.lms.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.lms.bean.Laptop;
import com.lms.dao.LaptopDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static LaptopDAO dao = new LaptopDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		request.getSession().setAttribute("keys", dao.getKeys());
		switch(action) {
		case "/insert":insert(request,response);break;
		case "/delete":delete(request,response);break;
		case "/update":update(request,response);break;
		case "/home" :viewAll(request, response);break;
		case "/deleteAll":deleteAll(request, response);break;
		case "/search":search(request, response);break;
		default:viewAll(request, response);
		}
		
	}


	private void search(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.sendRedirect("Search.jsp");
		
	}


	private void deleteAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("DeleteAll.jsp");
		
	}


	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("Update.jsp");
		
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("Delete.jsp");
		
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Insert.jsp");
	}

	private void viewAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		ArrayList<Laptop> list = dao.viewAll();
		if(list != null) {
			request.getSession().setAttribute("list", list);
			response.sendRedirect("HomePage.jsp");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
				Laptop l = new Laptop(request.getParameter("laptopName"), request.getParameter("processor"), Float.parseFloat(request.getParameter("price")));
				 boolean n = dao.insertLaptop(l);
				if(n) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		
		else if(action.equals("Delete")) {
			String out = request.getParameter("laptopId");
			if(out.equals("Choose")) {
				response.sendRedirect("Failure.jsp?action=Delete");
			}else {
					int id = Integer.parseInt(out);
					boolean n = dao.deleteLaptop(id);
					if(n) {
						response.sendRedirect("Success.jsp?action=Delete");
					}else {
						response.sendRedirect("Failure.jsp?action=Delete");
					}
				}
			}
		
		else if(action.equals("Update")) {
			String out = request.getParameter("laptopId");
			if(out.equals("Choose")) {
				response.sendRedirect("Failure.jsp?action=Update");
			}else {
			Laptop l = new Laptop(Integer.parseInt(out), request.getParameter("laptopName"), request.getParameter("processor"), Float.parseFloat(request.getParameter("price")));
			boolean n = dao.updateLaptop(l);
				if(n) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
			}
		}
		
		else if(action.equals("Search")) {
				String out = request.getParameter("laptopId");
				if(out.equals("Choose")) {
					response.sendRedirect("Failure.jsp?action=Search");
				}else {
					int id = Integer.parseInt(out);
					Laptop b = dao.searchFood(id);
					if(b==null) {
						response.sendRedirect("Failure.jsp?action=Search");
					}else {
						request.getSession().setAttribute("bean", b);
						response.sendRedirect("Success.jsp?action=Search");
				}
			}
		}
		
		else if(action.equals("DeleteAll")) {
			String password = request.getParameter("pass");
			boolean n = dao.deleteAll(password);
			if(n) 
				response.sendRedirect("Success.jsp?action=DeleteAll");
			else
				response.sendRedirect("Failure.jsp?action=DeleteAll");
			
		}

	}


}
