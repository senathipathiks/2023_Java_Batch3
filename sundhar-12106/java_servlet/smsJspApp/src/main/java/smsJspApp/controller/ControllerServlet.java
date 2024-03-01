package smsJspApp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import smsJspApp.bean.Student;
import smsJspApp.dao.StudentDAO;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/")
public class ControllerServlet extends HttpServlet {
	static StudentDAO dao = new StudentDAO();

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String insert = req.getParameter("button");
		String edit = req.getParameter("edit");
		String delete = req.getParameter("delete");
		String fetch = req.getParameter("fetchAll");
		System.out.println(edit);
		int summa = Integer.parseInt(edit);
		System.out.println(summa);
		
		System.out.println(insert+" : "+edit+" : "+delete+" : "+fetch);
		
		if((insert != null) && insert.equals("Insert"))
			insert(req, resp);
		if(summa < 1) 	 
			update(req, resp);
		if((delete != null) && delete.equals("Delete"))
			delete(req, resp);
		if((fetch != null) && fetch.equals("FetchAll"))
			findAll(req, resp);
		

	}

	public static void insert(HttpServletRequest req, HttpServletResponse resp) {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		
		System.out.println(name + " : "+city+ " : "+id);
		int n = 0;
		
		try {
			n = dao.insertStudent(new Student(id, name, city));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (n == 1) {
			try {
				RequestDispatcher rd = req.getRequestDispatcher("View.jsp");
				findAll(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

		}
	}

	public static void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Student> ls = new ArrayList<Student>();
		System.out.println("inside");
		try {
			ls = dao.fetchAll();
			System.out.println(ls);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("View.jsp");
		if (ls != null) {
			System.out.println("im  working");
			req.setAttribute("stu", ls);
			req.setAttribute("res", "tru");
			// resp.sendRedirect("View.jsp");
			rd.include(req, resp);
		} else {
			req.setAttribute("res", "fal");
			rd.include(req, resp);
//			out.print("<span class=\"ms-5 text-danger\"> Record not found</span>");
		}
	}

	public static void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		RequestDispatcher rd =  req.getRequestDispatcher("View.jsp");
		int id = Integer.parseInt(req.getParameter("sid"));
		String name = req.getParameter("sname1");
		String city = req.getParameter("scity1");
		System.out.println(id+" : "+name+" : "+city);
		int n = 0;
		try {
			n = dao.updateStudent(new Student(id, name, city));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (n == 1) {
//			rd.include(req, resp);
			findAll(req, resp);
//			out.print("<span class=\"ms-5 fs-2 text-success\"> Record inserted successfully</span>");
		} else {
//			rd.include(req, resp);
//			out.print("<span class=\"ms-5 text-danger\"> Record insertion failure</span>");
		}
	}

	public static void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("sid"));

		int n = 0;
		try {
			int sid = Integer.parseInt(req.getParameter("sid"));
			System.out.println("sid " + sid);
			n = dao.deleteStudent(sid);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (n == 1) {
			findAll(req, resp);
//			rd.include(req, resp);
//			out.print("<span class=\"ms-5 fs-2 text-success\"> Record deleted successfully</span>");
		} else {
//			rd.include(req, resp);
//			out.print("<span class=\"ms-5 text-danger\"> Record deletion failure</span>");
		}
	}

}
