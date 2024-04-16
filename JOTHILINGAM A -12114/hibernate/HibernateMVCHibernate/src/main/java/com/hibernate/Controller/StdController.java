package com.hibernate.Controller;

import java.io.IOException;
import java.util.List;

import com.hibernate.bean.Student;
import com.hibernate.dao.StdDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StdController
 */
public class StdController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		StdDao dao=new StdDao();
		Student stud=new Student();
		
		String action = request.getParameter("button");
		System.out.println(action);
		System.out.println("Im controller");
		
		
		if(action.equals("Insert")) {
			String name1=request.getParameter("name");
			String city1=request.getParameter("city");
			
			if( name1=="" || city1=="" ) {
				response.sendRedirect("Empty.jsp?action=Insert");

			}
			else {
				stud.setName(name1);
				stud.setCity(city1);
				n = dao.insert(stud);
//				request.setAttribute("action", action);
				
				if(n>0) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		}
		
		else if(action.equals("Delete")) {
			
			if(request.getParameter("id")=="") {
				response.sendRedirect("Empty.jsp?action=Delete");
			}else {
				int id = Integer.parseInt(request.getParameter("id"));
				
				n = dao.delete(id);
				System.out.println("Delete Page");
				
				
				if(n>0) {
					response.sendRedirect("Success.jsp?action=Delete");
				}else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
			}
		}
		
				
		else if(action.equals("Update")) {
			String name1=request.getParameter("name");
			String city1=request.getParameter("city");
			if( name1=="" || city1=="" ) {
				response.sendRedirect("Empty.jsp?action=Update");

			}
			else {
				int id=Integer.parseInt(request.getParameter("id"));
				String name2=request.getParameter("name");
				String city3=request.getParameter("city");
				stud.setId(id);
				stud.setName(name2);
				stud.setCity(city3);
				n = dao.update(stud);
				if(stud!=null) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
			}
		}
		else if(action.equals("Search")) {
			
			if( request.getParameter("Id")=="" ) {
				response.sendRedirect("Empty.jsp?action=Search");

			}
			else {
				System.out.println("hi");
				int id=Integer.parseInt(request.getParameter("Id"));
				
				System.out.println(id);
				 stud=dao.search(id);
				 System.out.println(stud +"from search");
				if(stud==null) {
					response.sendRedirect("Failure.jsp?action=Search");

				}else {
					request.getSession().setAttribute("bean", stud);
					response.sendRedirect("Success.jsp?action=Search");
				}
			}
		}
		else if(action.equals("ViewAll")) {
			List<Student> list = (List<Student>) dao.viewAll();
			if(list.isEmpty()) {
				response.sendRedirect("Failure.jsp?action=View");
			}else {
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Success.jsp?action=View");
			}
		}

		
	}

}
