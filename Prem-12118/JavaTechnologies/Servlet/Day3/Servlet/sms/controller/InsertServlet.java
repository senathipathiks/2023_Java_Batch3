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

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int n = 0;
		StudentDAO dao = new StudentDAO();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		System.out.println(action + "  action");
		if (action.equals("Insert"))
			
		{
			RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String city = request.getParameter("scity");
			Student stud = new Student(id, name, city);
			n = dao.insertStudent(stud);

			if (n == 1) {
				rd.include(request, response);
				out.write("<h1> <font color=green> Record Inserted Successfully </font> </h1>");
			} else {

				rd.include(request, response);
				out.write("<h1> <font color=red> Record Insertion Failure </font> </h1>");
			}
		}
		
		else if (action.equals("Find")) {
			RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
			int id = Integer.parseInt(request.getParameter("sid"));
			Student stud=dao.findStudent(id);
			if(stud !=null) {
				
				rd.include(request,response);
				out.print("<br><br><br>");
				out.write("<h1> <font color=red>Student sucesfully found..!</font> </h1>");
				out.println("<font size=5px color=green><table align=center border=1>"
						+ "<tr>"
						+ "<th> Stud ID </th>"
						+ "<th> Stud Name </th>"
						+ "<th> Stud City </th>"
						+ "</tr>"
						+ "</tr>"
						+"<td>"+ stud.getId()+"</td>"
						+"<td>"+ stud.getName()+"</td>"
						+"<td>"+ stud.getCity()+"</td>"
						+ "</tr>"
						+"</font>");
				
			}
			else
			{
				rd.include(request, response);
				out.write("<h1> <font color=red>Student not found..! </font> </h1>");
			}
		}
		 
			else if(action.equals("Find All")) {
                RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
                LinkedList<Student> stud=new LinkedList<Student>();
                stud=dao.findAllStudent();
                
                if(stud.size()>0) {
                    rd.include(request, response);
                    out.write("<br><br><br>");
                    out.write("<font size=5px color=green><table align=center border=1>"
                            +"<tr>"
                            +"<th> Stud Id </th>"
                            +"<th> Stud Name </th>"
                            +"<th>Stud city</th>"
                            +"</tr>"
                            );
                    for(Student s:stud) {
                        out.write("<tr>"
                        
                        +"<td>"+s.getId()+"</td>"
                        +"<td>"+s.getName()+"</td>"
                        +"<td>"+s.getCity()+"</td>"
                        +"</tr>");
                    }
                    out.write("</table>"+"</font>");
                }
			}
                else if (action.equals("update"))
        			
        		{
        			RequestDispatcher rd1 = request.getRequestDispatcher("update.jsp");
        			int id = Integer.parseInt(request.getParameter("sid"));
        			String name = request.getParameter("sname");
        			String city = request.getParameter("scity");
        			Student stud = new Student(id, name, city);
        			n = dao.updateStudent(stud);

        			if (n == 1) {
        				rd1.include(request, response);
        				out.write("<h1> <font color=green> Record Updated Successfully </font> </h1>");
        			} else {

        				rd1.include(request, response);
        				out.write("<h1> <font color=red> Record Updation Failure </font> </h1>");
        			}
        		}
     else if (action.equals("Delete"))
        			
        		{
        			RequestDispatcher rd1 = request.getRequestDispatcher("delete.jsp");
        			int id = Integer.parseInt(request.getParameter("sid"));
        			n = dao.deleteStudent(id);

        			if (n == 1) {
        				rd1.include(request, response);
        				out.write("<h1> <font color=green> Record deleted Successfully </font> </h1>");
        			} else {

        				rd1.include(request, response);
        				out.write("<h1> <font color=red> Record deletion Failure </font> </h1>");
        			}
        		}
        		
}
}
