package com.hb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.hb.Dao.StudentDao;
import com.hb.bean.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertHb
 */
public class InsertHb extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InsertHb() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int n=0;
		StudentDao dao=new StudentDao();
		PrintWriter out=response.getWriter();
		
		String action=request.getParameter("button");
		
		if(action.equals("INSERT"))
		{
		    
			String name=request.getParameter("name");
			String city=request.getParameter("city");
			Student stud=new Student(n, name,city);
			n=dao.insertStudent(stud);
			if(n==1) {
				response.sendRedirect("insertSuccess.jsp");
			}
			else {
				response.sendRedirect("insertFail.jsp");
			}
				}

	}

}
