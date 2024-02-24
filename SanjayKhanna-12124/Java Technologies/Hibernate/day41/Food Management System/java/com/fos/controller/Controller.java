package com.fos.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.fos.bean.Food;
import com.fos.dao.FoodDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static FoodDAO dao = new FoodDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		
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
		doPost(request, response);
		
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
		
		ArrayList<Food> list = dao.viewAll();
		if(list != null) {
			request.getSession().setAttribute("list", list);
			response.sendRedirect("HomePage.jsp");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
				Food f = new Food(Integer.parseInt(request.getParameter("foodId")), request.getParameter("foodName"),Float.parseFloat(request.getParameter("price")));
				 boolean n = dao.insertfood(f);
				if(n) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		
		else if(action.equals("Delete")) {
				int id = Integer.parseInt(request.getParameter("foodId"));
				boolean n = dao.deleteFood(id);
				if(n) {
					response.sendRedirect("Success.jsp?action=Delete");
				}else {
					response.sendRedirect("Failure.jsp?action=Delete");
			}
		}
		
		else if(action.equals("Update")) {
			Food f = new Food(Integer.parseInt(request.getParameter("foodId")), request.getParameter("foodName"),Float.parseFloat(request.getParameter("price")));
			boolean n = dao.updateFood(f);
				if(n) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
		}
		
		else if(action.equals("Search")) {
				int id = Integer.parseInt(request.getParameter("foodId"));
				Food b = dao.searchFood(id);
				if(b==null) {
					response.sendRedirect("Failure.jsp?action=Search");
				}else {
					request.getSession().setAttribute("bean", b);
					response.sendRedirect("Success.jsp?action=Search");
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