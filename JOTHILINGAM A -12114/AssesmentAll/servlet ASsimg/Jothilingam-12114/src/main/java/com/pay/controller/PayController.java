package com.pay.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


import com.pay.bean.Payroll;
import com.pay.dao.Paydao;

/**
 * Servlet implementation class PayController
 */
public class PayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Paydao dao = new Paydao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			if(request.getParameter("payRollID")=="" || request.getParameter("employeeName")=="" || request.getParameter("empId")==""
					|| request.getParameter("basic")=="" || request.getParameter("hra")=="" || request.getParameter("da")=="" || request.getParameter("ta")=="")
			{
				response.sendRedirect("Empty.jsp?action=Insert");

			}
			else {
				Payroll pay = new Payroll(Integer.parseInt(request.getParameter("payRollID")), request.getParameter("employeeName"), Integer.parseInt(request.getParameter("empId")),
						Float.parseFloat(request.getParameter("basic")),Integer.parseInt(request.getParameter("hra")),Integer.parseInt(request.getParameter("da")),Integer.parseInt(request.getParameter("ta")),
						Float.parseFloat(request.getParameter("ctc")));
				n =dao.insert(pay) ;
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		}
		
		else if(action.equals("Delete")) {
			if(request.getParameter("payRollID")=="") {
				response.sendRedirect("Empty.jsp?action=Delete");
			}else {
				int id = Integer.parseInt(request.getParameter("payRollID"));
				n = dao.delete(id);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Delete");
				}else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
			}
		}
		else if(action.equals("Delete All")) {
			
			
			n = dao.deleteAll();
			if(n==0) {
				response.sendRedirect("Success.jsp?action=Delete");
			}else {
				response.sendRedirect("Failure.jsp?action=Delete");
			
		}
	}
		
		else if(action.equals("Update")) {
			if(request.getParameter("payRollID")=="" || request.getParameter("employeeName")=="" || request.getParameter("empId")==""
					|| request.getParameter("basic")=="" || request.getParameter("hra")=="" || request.getParameter("da")=="" || request.getParameter("ta")=="")
			{
				response.sendRedirect("Empty.jsp?action=Update");

			}
			else {
				Payroll pay = new Payroll(Integer.parseInt(request.getParameter("payRollID")), request.getParameter("employeeName"), Integer.parseInt(request.getParameter("empId")),
						Float.parseFloat(request.getParameter("basic")),Integer.parseInt(request.getParameter("hra")),Integer.parseInt(request.getParameter("da")),Integer.parseInt(request.getParameter("ta")),
						Float.parseFloat(request.getParameter("ctc")));
				n =dao.update(pay);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
			}
		}
		else if(action.equals("Search")) {
			if(request.getParameter("payRollID")=="") {
				response.sendRedirect("Empty.jsp?action=Search");
			}else {
				int id = Integer.parseInt(request.getParameter("payRollID"));
				Payroll emp = dao.search(id);
				if(emp==null) {
					response.sendRedirect("Failure.jsp?action=Search");
				}else {
					request.getSession().setAttribute("bean", emp);
					response.sendRedirect("Success.jsp?action=Search");
				}
			}
		}
		else if(action.equals("View All")) {
			List<Payroll> list = dao.viewAll();
			if(list.isEmpty()) {
				response.sendRedirect("Failure.jsp?action=View");
			}else {
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Success.jsp?action=View");
			}
		}
	}

}
