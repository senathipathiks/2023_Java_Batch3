package com.oss.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.oss.bean.OnlineShopping;
import com.oss.dao.OSDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class OSController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static OSDAO dao = new OSDAO();


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		String action = request.getParameter("button");
		PrintWriter out = response.getWriter();
		
		
		if(action.equals("Insert")) {
			if(request.getParameter("ProductId")=="" || request.getParameter("ProductName")=="" || request.getParameter("Quantity")=="" || request.getParameter("Price")=="") {
				response.sendRedirect("Empty.jsp?action=Insert");

			}
			else {
				OnlineShopping os = new OnlineShopping(Integer.parseInt(request.getParameter("ProductId")), request.getParameter("ProductName"), Integer.parseInt(request.getParameter("Quantity")),Integer.parseInt(request.getParameter("Price")));
				n = dao.insertProduct(os);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		}
		
		else if(action.equals("Delete")) {
		
		int n1 = Integer.parseInt(request.getParameter("ProductId"));
		OnlineShopping temp = dao.deleteProduct(n1);
		
		if(temp!=null) {
			response.sendRedirect("Success.jsp?action=Delete");
		}
		
		else {
			response.sendRedirect("Failure.jsp?action=Delete");
		}
		}
		
		else if(action.equals("Update")) {
			if(request.getParameter("ProductId")=="" || request.getParameter("ProductName")=="" || request.getParameter("Quantity")=="" || request.getParameter("Price")=="") {
				response.sendRedirect("Empty.jsp?action=Update");

			}
			else {
				OnlineShopping os = new OnlineShopping(Integer.parseInt(request.getParameter("ProductId")), request.getParameter("ProductName"), Integer.parseInt(request.getParameter("Quantity")),Integer.parseInt(request.getParameter("Price")));
				n = dao.insertProduct(os);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
			}
		}
		
		else if(action.equals("Search")) {
			if(request.getParameter("ProductId")=="") {
				response.sendRedirect("Empty.jsp?action=Search");
			}else {
				int id = Integer.parseInt(request.getParameter("ProductId"));
				OnlineShopping os = dao.searchProduct(id);
				if(os==null) {
					response.sendRedirect("Failure.jsp?action=Search");
				}else {
					request.getSession().setAttribute("bean",os);
					response.sendRedirect("Success.jsp?action=Search");
				}
			}
		}
		
		else if(action.equals("View All")) {
			List<OnlineShopping> list = dao.viewAll();
			if(list.isEmpty()) {
				response.sendRedirect("Failure.jsp?action=View");
			}else {
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Success.jsp?action=View");
			}
		}

	}

}
