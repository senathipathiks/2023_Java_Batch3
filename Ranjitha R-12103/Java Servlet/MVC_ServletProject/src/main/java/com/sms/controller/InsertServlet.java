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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n = 0;
		StudentDAO dao = new StudentDAO();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");

		if (action.equals("Insert")) {
			RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");

			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String city = request.getParameter("scity");

			Student stud = new Student(id, name, city);
			n = dao.insertStudents(stud);
			if (n == 1) {
				rd.include(request, response);
				out.write("<h1><font color=green> Record inserted Successfully</font></h1>");
			} else {
				rd.include(request, response);
				out.write("<h1><font color=red> Record Insertion Failure</font></h1>");
			}
		}

		else if (action.equals("Find")) {
			RequestDispatcher rd = request.getRequestDispatcher("find.jsp");
			int id = Integer.parseInt(request.getParameter("sid"));
			Student stud = dao.findStudents(id);
			if (stud != null) {
				rd.include(request, response);
				out.write("<br><br><br>");
				out.write("<font size=5px color=red><table align =center border=1>" + "<tr>" + "<th> Stud Id </th>"
						+ "<th> Stud Name </th>" + "<th> Stud City </th>" + "</tr>" + "<tr>" + "<td>" + stud.getS_id()
						+ "</td>" + "<td>" + stud.getS_name() + "</td>" + "<td>" + stud.getS_city() + "</td>" + "</tr>"
						+ "</font>");

			} else {
				rd.include(request, response);
				out.write("<h1><font color=red> Record Not Found</font></h1>");
			}
		}

		else if (action.equals("FindAll")) {
			RequestDispatcher rd = request.getRequestDispatcher("find.jsp");
			LinkedList<Student> stud = new LinkedList<Student>();
			stud = dao.findAllStudent();

			if (stud.size() > 0) {
				rd.include(request, response);
				out.write("<br><br><br>");
				out.print("<font size=5px color=white><table align =center border=1>" + "<tr>" + "<th> Stud Id</th>"
						+ "<th> Stud Name</th>" + "<th> Stud City</th>" + "</tr>");
				for (Student s : stud) {
					out.write("<tr>" + "<td>" + s.getS_id() + "</td>" + "<td>" + s.getS_name() + "</td>" + "<td>"
							+ s.getS_city() + "</td>" + "</tr>");
				}
				out.write("</table></font>");
			} else {
				rd.include(request, response);
				out.write("<h1><font color=white>Record not found</font></h1>");
			}
		}
		
		else if(action.equals("Delete")) {
			RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			n = dao.deleteStudents(id);
			if(n==1) {
				rd.include(request, response);
				out.write("<h1><font color=green> Record deleted Successfully</font></h1>");
			} else {
				rd.include(request, response);
				out.write("<h1><font color=red> Record deletion Failure</font></h1>");
			
			}
		}

		
		else if(action.equals("Update")) {
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			int id=Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String city = request.getParameter("scity");

			Student stud = new Student(id, name, city);
			n = dao.updateStudents(stud);
			if (n == 1) {
				rd.include(request, response);
				out.write("<h1><font color=green> Record updated Successfully</font></h1>");
			} else {
				rd.include(request, response);
				out.write("<h1><font color=red> Record updated Failure</font></h1>");
			}
		}
			
					
		}
	}


