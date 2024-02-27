package com.OCMS.controller;

       	import jakarta.servlet.RequestDispatcher;
       	import jakarta.servlet.ServletException;
       	import jakarta.servlet.annotation.WebServlet;
       	import jakarta.servlet.http.HttpServlet;
       	import jakarta.servlet.http.HttpServletRequest;
       	import jakarta.servlet.http.HttpServletResponse;
       	import java.io.IOException;
       	import java.io.PrintWriter;

       	import com.OCMS.dao.*;
       	import com.OCMS.bean.*;
       	import java.util.LinkedList;

       	/**
       	 * Servlet implementation class Servelet
       	 */
       	public class Servlet extends HttpServlet {

       		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       			
       					int n=0;
       					OcmsDao dao=new OcmsDao();
       					PrintWriter out=response.getWriter();
       					String action=request.getParameter("button");
       					
       					if(action.equals("Insert")) {
       						RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");
       						
       						int id=Integer.parseInt(request.getParameter("CourseID"));
       						String name=request.getParameter("CourseName");
       						String type=request.getParameter("CourseType");
       						int duration=Integer.parseInt(request.getParameter("CourseDuration"));
       						float fee=Integer.parseInt(request.getParameter("CourseFee"));
       					    Ocms course = new Ocms(id,name,type,duration,fee);
       						n=dao.insert(course);
       						
       						if(n==1) {
       							response.sendRedirect("insertsuccess.jsp");
       						}
       						else {
       							response.sendRedirect("insertfailure.jsp");
       						}
       					}
       					
       				  
       					else if (action.equals("Find")) {
       						
       					
       				
       					int id=Integer.parseInt(request.getParameter("CourseID"));
       					
       				    Ocms course=dao.find(id);
       					
       					if (course!=null) {
       						RequestDispatcher rd=request.getRequestDispatcher("viewjsp.jsp");
       						request.setAttribute("bean", course);
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
       						LinkedList<Ocms> course=new LinkedList<Ocms>();
       						course=dao.findAll();

       						if(course.size()>0) {
       							RequestDispatcher rd1=request.getRequestDispatcher("findallsuccess.jsp");
       							request.setAttribute("list",course);
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
       						int id=Integer.parseInt(request.getParameter("CourseID"));
       						n=dao.delete(id);
       						if (n==1) {
       							response.sendRedirect("deletesuccess.jsp");
       						}else {
       							rd.include(request, response);
       							response.sendRedirect("deletefailure.jsp");
       						}
       					}
       					
       					else if(action.equals("Update")){
       				      	  int n1=0;
       				            OcmsDao dao1=new OcmsDao();
       				            PrintWriter out1=response.getWriter();
       				            String action1=request.getParameter("button");
       				            
       				            if(action1.equals("Update"))
       				            {
       				                RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
       				                
       				                int id=Integer.parseInt(request.getParameter("CourseID"));
       								String name=request.getParameter("CourseName");
       								String type=request.getParameter("CourseType");
       								int duration=Integer.parseInt(request.getParameter("CourseDuration"));
       								float fee=Integer.parseInt(request.getParameter("CourseFee"));
       				               
       				               Ocms course1=new Ocms(id,name,type,duration,fee);
       				                n1=dao1.update(course1);
       				                
       				                if(n1==1) {
       				                	response.sendRedirect("updatesuccess.jsp");
       				                }
       				                else
       				                {
       				                	response.sendRedirect("updatefailure.jsp");
       				                }
       				            }
       					
       					
       						}
       			       	}

       		}




