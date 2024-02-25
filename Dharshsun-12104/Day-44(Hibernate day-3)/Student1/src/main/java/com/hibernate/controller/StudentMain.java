package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.hibernate.DAO.StudentDAO;
import com.hibernate.bean.Student1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentMain
 */
public class StudentMain extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
//    public StudentMain() {
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		int n=0;
		StudentDAO dao=new StudentDAO();
		PrintWriter out=response.getWriter();
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			Student1 s1=new Student1();
			String name=request.getParameter("sname");
			String city=request.getParameter("scity");
			s1.setName(name);
			s1.setCity(city);
			n=dao.insertStudent(s1);
			if(n>0) {
				response.sendRedirect("Success.jsp?action=Insert");
			}
			else {
				response.sendRedirect("Failure.jsp?action=Insert");
			}
		}
		else if(action.equals("Search")) {
			int id = Integer.parseInt(request.getParameter("StudId"));
			Student1 stud = dao.findStudent(id);
			
			if(stud!=null) {
				request.getSession().setAttribute("bean", stud);
				response.sendRedirect("Success.jsp?action=Search");
				
			}
			else {
				response.sendRedirect("Failure.jsp?action=Search");
			}
		}
		else if(action.equals("SearchAll")) {
			List<Student1> list = dao.findallStudent();
			if(list.size()>0) {
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Success.jsp?action=SearchAll");
			}
		}
			else if(action.equals("Update")) {
				Student1 s1=new Student1();
				int id = Integer.parseInt(request.getParameter("StudId"));
				String name=request.getParameter("sname");
				String city=request.getParameter("scity");
				s1.setId(id);
				s1.setName(name);
				s1.setCity(city);
				n=dao.updateStudent(s1);
				if(n>0) {
					response.sendRedirect("Success.jsp?action=Update");
				}
				else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
//						response.sendRedirect("Failure.jsp?action=Delete");
					}
			else if(action.equals("Delete")) {
				int studId = Integer.parseInt(request.getParameter("studId"));
				Student1 temp = dao.deleteStudent(studId);
				if(temp!=null) {
					response.sendRedirect("Success.jsp?action=Delete");
				}
				else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
			}
				
			}
		
		
	}


