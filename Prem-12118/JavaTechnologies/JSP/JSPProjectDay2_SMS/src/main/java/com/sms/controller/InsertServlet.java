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

@WebServlet("/InsertServlet")
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
				// Set success message as attribute
				request.setAttribute("message", "Record Inserted Successfully");

				// Forward to success JSP page
				RequestDispatcher rd1 = request.getRequestDispatcher("InsertSuccess.jsp");
				rd1.forward(request, response);
			} else {
				// Set failure message as attribute
				request.setAttribute("message", "Record Insertion Failure");

				// Forward to failure JSP page
				RequestDispatcher rd1 = request.getRequestDispatcher("InsertFailure.jsp");
				rd1.forward(request, response);
			}
		} else if (action.equals("Find")) {
			int id = Integer.parseInt(request.getParameter("sid"));
			
			 Student stud = new Student();
			  stud = dao.findStudent(id);
 
			if (stud.getId() >0) {
				request.setAttribute("studId", stud.getId());
				request.setAttribute("studName", stud.getName());
				request.setAttribute("studCity", stud.getCity());

				RequestDispatcher rd = request.getRequestDispatcher("FindStudent.jsp");
				rd.forward(request, response);
			} else {
				// If student is not found, forward to NoStudent.jsp
				RequestDispatcher rd1 = request.getRequestDispatcher("NoStudent.jsp");
				rd1.forward(request, response);
			}
		}

		else if (action.equals("Find All")) {
		    LinkedList<Student> stud = dao.findAllStudent();

		    if (stud.size() > 0) {
		        
		        request.setAttribute("studentList", stud);
		         
		        RequestDispatcher rd1 = request.getRequestDispatcher("StudentList.jsp");
		        rd1.forward(request, response);
		    }
		}


		 else if (action.equals("update"))

		{

			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String city = request.getParameter("scity");
			Student stud = new Student(id, name, city);
			n = dao.updateStudent(stud);

			if (n == 1) {
				RequestDispatcher rd = request.getRequestDispatcher("UpdateSuccess.jsp");
				rd.forward(request, response);
				// out.write("<h1> <font color=green> Record Updated Successfully </font>
				// </h1>");
			} else {
				RequestDispatcher rd1 = request.getRequestDispatcher("UpdateFailure.jsp");
				rd1.forward(request, response);
				// out.write("<h1> <font color=red> Record Updation Failure </font> </h1>");
			}
		} else if (action.equals("Delete"))

		{
			int id = Integer.parseInt(request.getParameter("sid"));
			n = dao.deleteStudent(id);

			if (n == 1) {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
				rd.forward(request, response);
			} else {

				RequestDispatcher rd = request.getRequestDispatcher("DeleteFailure.jsp");
				rd.forward(request, response);

			}
		}

	}
}
