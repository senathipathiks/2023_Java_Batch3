package com.mms.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.mms.dao.MmsDao;
import com.mms.bean.*;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	       	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int n=0;
			MmsDao dao=new MmsDao();
			PrintWriter out=response.getWriter();
			String action=request.getParameter("button");
			
			if(action.equals("Insert")) {
				RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");
				
				
				
				String name=request.getParameter("name");
				int no=Integer.parseInt(request.getParameter("screenno"));
				int id=Integer.parseInt(request.getParameter("ticketid"));
				Mms stud = new Mms(name,no,id );
				n=dao.insertstd(stud);
				
				if(n==1) {
					response.sendRedirect("insertsuccess.jsp");
				}
				else {
					response.sendRedirect("insertfailure.jsp");
				}
			}
			else if (action.equals("Find")) {
				
			
		
			int id=Integer.parseInt(request.getParameter("ticketid"));
			
			Mms stud=dao.findstd(id);
			
			if (stud!=null) {
				RequestDispatcher rd=request.getRequestDispatcher("viewjsp.jsp");
				request.setAttribute("bean", stud);
				rd.include(request, response);
				
							
			}
			else
			{
				response.sendRedirect("viewjspfailure.jsp");
			}
			}
			
			else if(action.equals("find all"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
				LinkedList<Mms> stud=new LinkedList<Mms>();
				stud=dao.findAllStudent();

				if(stud.size()>0) {
					RequestDispatcher rd1=request.getRequestDispatcher("findallsuccess.jsp");
					request.setAttribute("list",stud);
					rd1.include(request, response);				
				}
				else
				{
				rd.include(request, response);
				out.write("<h1> <font color=red> Record Not Found </font></h1>");
				}
			}
			
			else if (action.equals("Delete")) {
				RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
				int id=Integer.parseInt(request.getParameter("ticketid"));
				n=dao.deleteStudent(id);
				if (n==1) {
					response.sendRedirect("deletesuccess.jsp");
				}else {
					rd.include(request, response);
					response.sendRedirect("deletefailure.jsp");
				}
			}
			
			else if(action.equals("Update")){
		      	  int n1=0;
		            MmsDao dao1=new MmsDao();
		            PrintWriter out1=response.getWriter();
		            String action1=request.getParameter("button");
		            
		            if(action1.equals("Update"))
		            {
		                RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
		                
		                int no=Integer.parseInt(request.getParameter("screenno"));
						int id=Integer.parseInt(request.getParameter("ticketid"));
						String name=request.getParameter("name");
		               
		                Mms stud1=new Mms(name,no,id);
		                n1=dao1.updateStudent(stud1);
		                
		                if(n1==1) {
		                	response.sendRedirect("updatesuccess.jsp");
		                }
		                else
		                {
		                	response.sendRedirect("updatefailure.jsp");
		                }
		            }
			
			
				}
	       	}}


