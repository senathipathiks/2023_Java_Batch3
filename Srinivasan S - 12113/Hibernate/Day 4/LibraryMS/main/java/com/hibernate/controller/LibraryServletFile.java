package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;


import com.hibernate.bean.Library;
import com.hibernate.dao.LibraryDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

/**
 * Servlet implementation class LibraryServletFile
 */
public class LibraryServletFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LibraryServletFile() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		LibraryDAO dao=new LibraryDAO();
		
		PrintWriter pw=response.getWriter();
		String action=request.getParameter("button");
		
		System.out.println(action);
		
		if(action.equals("Add")) {
			Library lib=new Library();
			String name=request.getParameter("bname");
			String genere=request.getParameter("bgen");
			lib.setBookName(name);
			lib.setBookGenere(genere);
			n=dao.insertLib(lib);
			request.setAttribute("action", action);
			
			if(n>0) {
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Add'");
				rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Add'");
				rd.include(request, response);
			}	
		}
		else if(action.equals("Delete")){
			
			int id=Integer.parseInt(request.getParameter("bid"));
			n=dao.deleteLib(id);
			request.setAttribute("action", action);
			
			if(n>0) {
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Delete'");
				rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Delete'");
				rd.include(request, response);
			}	
			
		}
		else if(action.equals("Search")) {
			int id=Integer.parseInt(request.getParameter("bid"));
			Library lib=dao.findLib(id);
			
			System.out.println(lib);
			request.setAttribute("action", action);
			
			
			if(lib != null) {
				
				System.out.println("lib");
				
				request.setAttribute("lib", lib);
				
				System.out.println("world");
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Search'");
				rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Search'");
				rd.include(request, response);
			}	
			
		}
		
		else if(action.equals("Update")) {
			
			
			int id=Integer.parseInt(request.getParameter("bid"));
			String name=request.getParameter("bname");
			String genere=request.getParameter("bgen");
			
//			Library lib=new Library(id,name,genere);
			
			Library lib=dao.findLib(id);
			lib.setBookName(name);
			lib.setBookGenere(genere);
			dao.updateLib(lib);
			
			System.out.println(lib);
			
			request.setAttribute("action", action);
			
			if(lib != null) {
				System.out.println(lib);
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp?action='Update'");
				rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp?action='Update'");
				rd.include(request, response);
			}	
			
		}
		
		
	}

}
