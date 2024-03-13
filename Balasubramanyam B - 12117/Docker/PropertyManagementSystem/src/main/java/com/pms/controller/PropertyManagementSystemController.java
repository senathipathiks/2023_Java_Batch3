package com.pms.controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.pms.bean.PropertyManagementSystem;
import com.pms.dao.PMSDAO;


public class PropertyManagementSystemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static  PMSDAO dao = new  PMSDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			if(request.getParameter("Id")=="" || request.getParameter("Name")=="" || request.getParameter("OwnedBuy")=="" ) {
				response.sendRedirect("Empty.jsp?action=Insert");

			}
			else {
				 PropertyManagementSystem pms = new  PropertyManagementSystem(Integer.parseInt(request.getParameter("Id")), request.getParameter("Name"), Integer.parseInt(request.getParameter("OwnedBuy")));
				n = dao.insertPropertyManagementSystem(pms);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		}
		
		else if(action.equals("Delete")) {
			if(request.getParameter("Id")=="") {
				response.sendRedirect("Empty.jsp?action=Delete");
			}else {
				int id = Integer.parseInt(request.getParameter("Id"));
				n = dao.deletePropertyManagementSystem(id);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Delete");
				}else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
			}
		}
		
		else if(action.equals("Update")) {
			if(request.getParameter("Id")=="" || request.getParameter("Name")=="" || request.getParameter("OwnedBuy")=="" ) {
				response.sendRedirect("Empty.jsp?action=Update");

			}
			else {
				PropertyManagementSystem pms = new PropertyManagementSystem(Integer.parseInt(request.getParameter("Id")), request.getParameter("Name"), Integer.parseInt(request.getParameter("OwnedBuy")));
				n = dao.updatePropertyManagementSystem(pms);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
			}
		}
		
		else if(action.equals("Search")) {
			if(request.getParameter("Id")=="") {
				response.sendRedirect("Empty.jsp?action=Search");
			}else {
				int id = Integer.parseInt(request.getParameter("Id"));
				PropertyManagementSystem pms = dao.searchPropertyManagementSystem(id);
				if(pms==null) {
					response.sendRedirect("Failure.jsp?action=Search");
				}else {
					request.getSession().setAttribute("bean", pms);
					response.sendRedirect("Success.jsp?action=Search");
				}
			}
		}
		
		else if(action.equals("View All")) {
			List<PropertyManagementSystem> list = dao.viewAll();
			if(list.isEmpty()) {
				response.sendRedirect("Failure.jsp?action=View");
			}else {
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Success.jsp?action=View");
			}
		}
	}

}

