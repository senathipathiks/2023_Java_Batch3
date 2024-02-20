package com.pms.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.pms.bean.Playroll;
import com.pms.dao.PlayrollDAO;


public class Insertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		System.out.println("Inside dopost");
		PlayrollDAO dao=new PlayrollDAO();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		
		
		//insert
		if(action.equals("Insert")){
			RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");
			
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			int no=Integer.parseInt(request.getParameter("empid"));
			float basic=Integer.parseInt(request.getParameter("basic"));
			int rent=Integer.parseInt(request.getParameter("rent"));
			int dearness=Integer.parseInt(request.getParameter("dearness"));
			int travelling=Integer.parseInt(request.getParameter("travel"));
			float cost=Integer.parseInt(request.getParameter("cost"));
			
			Playroll play=new Playroll(id, name, no, basic, rent,  dearness, travelling, cost);
			
			n=dao.insertPlayroll(play);
			
			if(n==1) {
				System.out.println("Inside insert");
				response.sendRedirect("success.jsp?action=insert");
			}
			else {
				response.sendRedirect("failure.jsp?action=insert");

			}
		}
		
		//delete
		if(action.equals("Delete")){
			RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
			
			int rollId=Integer.parseInt(request.getParameter("rollId"));
			
			n=dao.deletePlayroll(rollId);
			if(n==1) {
				System.out.println("Inside insert");
				response.sendRedirect("success.jsp?action=delete");
			}
			else {
				response.sendRedirect("failure.jsp?action=delete");
			}
		}
		
		//update
		
		if(action.equals("Update")) {
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			int no=Integer.parseInt(request.getParameter("empid"));
			float basic=Integer.parseInt(request.getParameter("basic"));
			int rent=Integer.parseInt(request.getParameter("rent"));
			int dearness=Integer.parseInt(request.getParameter("dearness"));
			int travelling=Integer.parseInt(request.getParameter("travel"));
			float cost=Integer.parseInt(request.getParameter("cost"));
			
			
			Playroll play=new Playroll(id,name,no,basic,rent,dearness,travelling,cost);
			
			n=dao.updatePlayroll(play);
			
			if(n==1) {
				response.sendRedirect("success.jsp?action=update");
				
			}
			else {
				response.sendRedirect("failure.jsp?action=update");
			}
			
			
		}
		//find
		
		else if(action.equals("View")) {
			System.out.println("hello");
			int Id=Integer.parseInt(request.getParameter("id"));
			System.out.println(Id);
			Playroll play=dao.findPlayroll(Id);
			
			if(play!=null) {
				System.out.println("play");
				request.getSession().setAttribute("bean", play);
			response.sendRedirect("success.jsp?action=View");
			
		}
			else {
				
				response.sendRedirect("failure.jsp?action=View");
			}
	}
	
		//find all
	else if(action.equals("ViewAll")) {
			
			LinkedList<Playroll> play=dao.findAllStudent();
		
			if(play.size()>0) {
				request.getSession().setAttribute("bean", play);
				response.sendRedirect("success.jsp?action=ViewAll");
			}
			else {
				response.sendRedirect("failer.jsp?action=ViewAll");
			}
			
			
		}
	
	}

}
