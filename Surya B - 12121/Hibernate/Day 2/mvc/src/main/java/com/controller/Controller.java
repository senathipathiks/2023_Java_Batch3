package com.controller;

import java.io.IOException;
import java.io.PrintWriter;


import com.bean.Student;

import com.dao.Studentdao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class Controller extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		Studentdao dao = new Studentdao();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			Student e1 =  new Student();
			
			String name = request.getParameter("ename");
			String city = request.getParameter("ecity");
			
			e1.setEname(name);
			e1.setEcity(city);
			System.out.println("Jeeva");
			n = dao.insertEmployee(e1);
			System.out.println("Java Jeeva");
			if(n>0) {
				response.sendRedirect("insertsuccess.jsp");
			}
}
	
}
}
