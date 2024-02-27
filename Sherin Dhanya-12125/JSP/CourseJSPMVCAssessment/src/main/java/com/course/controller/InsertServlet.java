package com.course.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import com.course.bean.Course;
import com.course.dao.CourseDAO;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {


	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0
				;
//		System.out.println("Inside dopost");
		CourseDAO dao=new CourseDAO();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		
		//insert
		if(action.equals("Insert")) {
			RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");
			int id=Integer.parseInt(request.getParameter("courseID"));
			String name=request.getParameter("courseName");
			String type=request.getParameter("courseType");
			int duration=Integer.parseInt(request.getParameter("courseDuration"));
			int fee=Integer.parseInt(request.getParameter("courseFee"));
			Course cor=new Course(id,name,type,duration,fee);
			
			n=dao.insertCourse(cor);
			if(n==1) {
//				System.out.println("Inside insert");
				rd.include(request, response);
				out.write("<h1> <font color=white> Record Inserted Successfully</font></h1>");
			}
			else {
				rd.include(request, response);
				out.write("<h1> <font color= red> Record Inserted Failure</font></h1>");
			}
			
		}
		//delete
				if(action.equals("Delete")) {
					RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
					int id=Integer.parseInt(request.getParameter("courseID"));
					
					n=dao.deleteCourse(id);
					if(n==1) {
						System.out.println("Inside delete");
						rd.include(request, response);
						out.write("<h1> <font color=white> Record Deleted Successfully</font></h1>");
					}
					else {
						rd.include(request, response);
						out.write("<h1> <font color=red> Record Deleted Failure</font></h1>");
					}
		}
				//update
				if(action.equals("Update")) {
					RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
					int id=Integer.parseInt(request.getParameter("courseID"));
					String name=request.getParameter("courseName");
					String type=request.getParameter("courseType");
					int duration=Integer.parseInt(request.getParameter("courseDuration"));
					int fee=Integer.parseInt(request.getParameter("courseFee"));
					Course cor=new Course(id,name,type,duration,fee);
					
					n=dao.updateCourse(cor);
					if(n==1) {
						
						rd.include(request, response);
						out.write("<h1> <font color=white> Record Updated Successfully</font></h1>");
					}
					else {
						rd.include(request, response);
						out.write("<h1> <font color=red> Record not found</font></h1>");
					}
				}
				//find
				  else if(action.equals("Find"))
			        {
			        	int id=Integer.parseInt(request.getParameter("courseID"));
			        	
						Course cor=dao.findCourse(id);
			        	if(cor!=null) {
			        		RequestDispatcher rd=request.getRequestDispatcher("findsuccess.jsp");
			        		request.setAttribute("bean", cor);
			        		rd.include(request,response);
			        		}
			        	else {
			        		response.sendRedirect("findfailure.jsp");

			        	}
			        	
			        }
				//findall
				else if(action.equals("Find All")) {
					LinkedList<Course> Cor=new LinkedList<Course>();
					
					 Cor=dao.findAllCourse();
					if(Cor.size()>0) {
						RequestDispatcher rd=request.getRequestDispatcher("findAllsuccess.jsp");
		        		request.setAttribute("bean", Cor);
		        		rd.include(request, response);
					}
					else {
		        		response.sendRedirect("findfailure.jsp");
					}
//						
				}
				}
			}


