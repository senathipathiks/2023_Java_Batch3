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

import com.sms.bean.StudentClass;
import com.sms.dao.StudentDao;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int n =0;
		StudentDao dao = new StudentDao();
		PrintWriter out=response.getWriter();
		String action= request.getParameter("button");
		
		if(action.equals("Insert"))
		{
			RequestDispatcher rd = (request.getRequestDispatcher("insert.jsp"));
			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String city = request.getParameter("scity");
			StudentClass stud = new StudentClass(id,name,city);
			n = dao.insertStudent(stud);
			if(n==1)
			{
				rd.include(request, response);
				out.write("<h1> <font color = green> record Inserted successfully</font></h1>");
				
			}
			else
			{
				rd.include(request, response);
                out.write("<h1> <font color = green> record Inserted Failure </font></h1>");
			}
			
		}
		else if(action.equals("View"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("find.jsp");
			int id = Integer.parseInt(request.getParameter("sid"));
		    StudentClass stud = dao.findStudent(id);
		    if (stud != null)
		    {
		    	rd.include(request, response);
                out.write("<br><br><br>");
                out.write("<font size=5px color=green><table align=center border=1>"
                        +"<tr>"
                        +"<th> Student ID </th>"
                        +"<th> Student Name </th>"
                        +"<th> Student City </th>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>"+stud.getId()+"</td>"
                        +"<td>"+stud.getName()+"</td>"
                        +"<td>"+stud.getCity()+"</td>"
                        +"</tr>"
                        +"</font>");
            }
		    else
		    {
		    	rd.include(request, response);
		    	out.write("<h1> <font color = green> record not found </font></h1>");
		    }
		}
//		    else if (action.equals("FindAll"))
//	        {
//	            RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
//	            
//	            LinkedList<StudentClass> stud = new LinkedList<StudentClass>();
//	            stud = dao.showallStudent();
//	            
//	            
//	            
//	            if(stud.size()>0)
//	            {
//	                rd.include(request, response);
//	                out.write("<br><br><br>");
//	                out.write("<font size = 5px color=green> <table align = center border=1>" +"<tr>" +"<th> Stud Id</th>" +"<th> Stud Name</th>"+"<th> Stud City</th>");
//	                for(Student s:stud)
//	                {
//	                    out.write(
//	                            "<tr>"
//	                            +"<td>"+s.getId()+"</td>"
//	                            +"<td>"+s.getName()+"</td>"
//	                            +"<td>"+s.getCity()+"</td>"
//	                            +"</tr>");
//	                        
//	                } 
//	                    out.write("</table></font>");
//	                
//	            }
//	        }
//
//
//
//		    }
//		 
//			
//		}
		
	}

}
