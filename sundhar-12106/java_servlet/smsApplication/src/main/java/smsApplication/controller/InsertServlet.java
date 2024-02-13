package smsApplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import smsApplication.bean.Student;
import smsApplication.dao.StudentDAO;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int n = 0;
		
		StudentDAO dao = new StudentDAO();
		PrintWriter out = resp.getWriter();
		String action = req.getParameter("button");
		
		if (action.equals("Insert")) {
			RequestDispatcher rd =  req.getRequestDispatcher("Insert.jsp");
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("sname");
			String city = req.getParameter("city");
			try {
				n = dao.insertStudent(new Student(id, name, city));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(n==1) {
				rd.include(req, resp);
				out.print("<span class=\"ms-5 fs-2 text-success\"> Record inserted successfully</span>");
			}else {
				rd.include(req, resp);
				out.print("<span class=\"ms-5 text-danger\"> Record insertion failure</span>");
			}
		}else if(action.equals("Find")) {
			RequestDispatcher rd = req.getRequestDispatcher("Fetch.jsp");
			int sid = Integer.parseInt(req.getParameter("id"));
			Student s = null;
			try {
				s = dao.fetchById(sid);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(s.getName() != null) {
				rd.include(req, resp);
				out.print("<br><br><br>"
						+ " <div\r\n"
						+ "      class=\"container d-flex justify-content-center align-items-center vh-100\"\r\n"
						+ "    >\r\n"
						+ "        <table class=\"table table-bordered\">\r\n"
						+ "          <tr>\r\n"
						+ "            <th>Student ID</th>\r\n"
						+ "            <th>Student name</th>\r\n"
						+ "            <th>Student City</th>\r\n"
						+ "          </tr>\r\n"
						+ "          <tr>\r\n"
						+ "            <td>"+s.getId() +"</td>\r\n"
						+ "            <td>"+s.getName()+"</td>\r\n"
						+ "            <td>"+s.getCity()+"</td>\r\n"
						+ "          </tr>\r\n"
						+ "        </table>\r\n"
						+ "    </div>");
			}else {
				rd.include(req, resp);
				out.print("<span class=\"ms-5 text-danger\"> Record not found</span>");
			}
		}else if(action.equals("Find All")) {
			List<Student> ls = null;
			try {
				ls = dao.fetchAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = req.getRequestDispatcher("Fetch.jsp");
			if(ls != null) {
				rd.include(req, resp);
				out.print("</br>"
						+"<table class=\"table table-bordered\">"
						+"<h1 >Student Details</h1>"
						+ "<tr><th>Student ID </th><th>Student Name</th>"
						+ "<th>Student City</th></tr>");
				for (Student s : ls) {
					out.print("<tr>"
							+ "<td>"+s.getId()+"</td>"
							+ "<td>"+s.getName()+"</td>"
							+ "<td>"+s.getCity()+"</td>"
							+ "</tr>");
				}
				out.print("</table>");
			}else {
				rd.include(req, resp);
				out.print("<span class=\"ms-5 text-danger\"> Record not found</span>");
			}
		}else if(action.equals("Update")) {
			RequestDispatcher rd =  req.getRequestDispatcher("Update.jsp");
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("sname");
			String city = req.getParameter("city");
			try {
				n = dao.updateStudent(new Student(id, name, city));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(n==1) {
				rd.include(req, resp);
				out.print("<span class=\"ms-5 fs-2 text-success\"> Record inserted successfully</span>");
			}else {
				rd.include(req, resp);
				out.print("<span class=\"ms-5 text-danger\"> Record insertion failure</span>");
			}
		}else if(action.equals("Delete")) {
			RequestDispatcher rd =  req.getRequestDispatcher("Update.jsp");
			int id = Integer.parseInt(req.getParameter("id"));
			try {
				n = dao.deleteStudent(Integer.parseInt(req.getParameter("id")));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(n==1) {
				rd.include(req, resp);
				out.print("<span class=\"ms-5 fs-2 text-success\"> Record deleted successfully</span>");
			}else {
				rd.include(req, resp);
				out.print("<span class=\"ms-5 text-danger\"> Record deletion failure</span>");
			}
		}
	}

}
