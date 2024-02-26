package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;


import com.hibernate.DAO.LibraryDAO;
import com.hibernate.bean.Library;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Library
 */
public class LibraryMain extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		LibraryDAO dao=new LibraryDAO();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		if(action.equals("Insert")) {
			Library l1=new Library();
			String name=request.getParameter("bname");
			String author=request.getParameter("bauth");
			l1.setBookName(name);
			l1.setAuthor(author);
			n=dao.insertLibrary(l1);
			if(n>0) {
				response.sendRedirect("insertsuccess.jsp");
			}
			else {
				response.sendRedirect("insertfailure.jsp");
			}

		}
          else if(action.equals("Delete")) {
 
  	    	int id=Integer.parseInt(request.getParameter("bid"));

  			n=dao.deleteLibrary(id);

	    	if(n>0) {
	    		response.sendRedirect("deletesuccess.jsp");
	    		}
	    	else {
	    		response.sendRedirect("deletefailure.jsp");
	    		
	    	}
	    	}
          else if(action.equals("Update")) {
        	  
			Library l1=new Library();

			int id=(Integer.parseInt(request.getParameter("bid")));

			String name=request.getParameter("bname");
			String author=request.getParameter("bauth");
			l1.setBookName(name);
			l1.setAuthor(author);
			n=dao.updateLibrary(id,l1);
			if(n>0) {
				response.sendRedirect("updatesuccess.jsp");
			}
			else {
				response.sendRedirect("updatefailure.jsp");
			}

		}
          else if(action.equals("Find")) {
  			int id=Integer.parseInt(request.getParameter("bid"));
  			Library lib=dao.findLib(id);
  			
  			System.out.println(lib);
  			request.setAttribute("action", action);
  			
  			
  			if(lib != null) {
  				
  				System.out.println(lib);
  				
  				request.setAttribute("lib", lib);
  				
  				System.out.println("world");
  				response.sendRedirect("findsuccess.jsp");
  			}
  			else {
  				response.sendRedirect("findfailure.jsp");

  				
  			}	
  			
  		}
	}

}
