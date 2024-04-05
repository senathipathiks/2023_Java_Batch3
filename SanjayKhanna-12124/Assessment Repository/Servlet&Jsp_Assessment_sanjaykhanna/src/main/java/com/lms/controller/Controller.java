package com.lms.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import com.lms.dao.BookDAO;
import com.lms.bean.Book;

@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static BookDAO dao = new BookDAO();

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
		
		LinkedList<Book> list = dao.veiwAllBook();
		if(list != null) {
			request.getSession().setAttribute("list", list);
			response.sendRedirect("HomePage.jsp");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
				Book b = new Book(Integer.parseInt(request.getParameter("bookId")), request.getParameter("bookName"),request.getParameter("author"),request.getParameter("publisher"),Float.parseFloat(request.getParameter("price")),Integer.parseInt(request.getParameter("edition")));
				n = dao.insertBook(b);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		
		else if(action.equals("Delete")) {
				int id = Integer.parseInt(request.getParameter("bookId"));
				n = dao.deleteBook(id);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Delete");
				}else {
					response.sendRedirect("Failure.jsp?action=Delete");
			}
		}
		
		else if(action.equals("Update")) {
			Book b = new Book(Integer.parseInt(request.getParameter("bookId")), request.getParameter("bookName"),request.getParameter("author"),request.getParameter("publisher"),Float.parseFloat(request.getParameter("price")),Integer.parseInt(request.getParameter("edition")));
			 n =dao.updateBook(b); 
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
		}
		
		else if(action.equals("Search")) {
				int id = Integer.parseInt(request.getParameter("bookId"));
				Book b = dao.searchBook(id);
				if(b==null) {
					response.sendRedirect("Failure.jsp?action=Search");
				}else {
					request.getSession().setAttribute("bean", b);
					response.sendRedirect("Success.jsp?action=Search");
			}
		}
		else if(action.equals("DeleteAll")) {
			String pass = request.getParameter("pass");
			boolean flag = dao.deleteAllBook(pass);
			if(flag) {
				response.sendRedirect("Failure.jsp?action=DeleteAll");
			}else {
				response.sendRedirect("Success.jsp?action=DeleteAll");
		}
	}

	}
}
