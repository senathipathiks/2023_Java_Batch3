package com.sms.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		StudentDAO dao=new StudentDAO();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		System.out.println(action);
		
	    if(action.equals("Insert")) {
	    	
	    	int id=Integer.parseInt(request.getParameter("sid"));
	    	String name=request.getParameter("sname");
	    	String city=request.getParameter("scity");
	    	Student stud=new Student(id,name,city);
	    	
	    	n=dao.insertStudent(stud);
	    	
	    	 if (n==1) {
	    		response.sendRedirect("insertsuccess.jsp");
	    		}
	    	else {
	    		response.sendRedirect("insertfailure.jsp");
	    		}
	    }
	    
	    
	    else if(action.equals("Delete")) {
	    	
	    	int id=Integer.parseInt(request.getParameter("sid"));
	    	n=dao.deleteStudent(id);
	    	if(n==1) {
	    		response.sendRedirect("deletesuccess.jsp");
	    		}
	    	else {
	    		response.sendRedirect("deletefailure.jsp");
	    		
	    	}
	    	}
	    
	    else if(action.equals("Update")) {
	    	
	    	int id=Integer.parseInt(request.getParameter("sid"));
	    	String name=request.getParameter("sname");
	    	String city=request.getParameter("scity");
	    	Student stud=new Student(id,name,city);
	    	
	    	n=dao.updateStudent(stud);
	    	if(n==1) {
	    		response.sendRedirect("updatesuccess.jsp");
	    		}
	    	else {
	    		response.sendRedirect("updatefailure.jsp");
	    		}
	    }
	    
	       else if(action.equals("Find")) {
	    		
		    	int id=Integer.parseInt(request.getParameter("sid"));
		    	
		    	Student stud=dao.findStudent(id);
		    	if(stud!=null) {
			    	RequestDispatcher rd=request.getRequestDispatcher("findsuccess.jsp");
                    request.setAttribute("bean", stud); //bean is a local variable it can be anyname
		    		rd.include(request, response);
		    		
		    	}
		    	else {
		    		response.sendRedirect("findfailure.jsp");
		    	}
	    	}

		    	else if(action.equals("Find All")) {
		    		
                    LinkedList<Student> stud= new LinkedList<Student>();
                    stud=dao.findAllStudent();
                    
                    if(stud.size()>0) {
    			    	RequestDispatcher rd=request.getRequestDispatcher("FindAllSuccess.jsp");
    			    	request.setAttribute("bean", stud);
                    	rd.include(request, response);
                    	
		    	}
                    else {
                    	response.sendRedirect("findfailure.jsp");
    		    	}
		    	}
	   }	

}
