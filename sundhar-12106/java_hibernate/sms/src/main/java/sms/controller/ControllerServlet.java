package sms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sms.bean.Student;
import sms.dao.StudentDAO;

public class ControllerServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getParameter("button");
		
		System.out.println(action + ": action");
		if (action.equals("Insert"))
			insert(req, resp);
		else if (action.equals("delete"))
			delete(req, resp);
		else if (action.equals("deleteAll")) {
			deleteAll(req, resp);
		} else if (action.equals("find")) {
			get(req, resp);
		} else if (action.equals("findAll")) {
			getAll(req, resp);
		} else if (action.equals("update")) {
			update(req, resp);
		}

	}

	public static void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s = new Student();
		s.setCity(req.getParameter("city"));
		s.setName(req.getParameter("name"));
		int res = StudentDAO.insert(s);

		RequestDispatcher rd = req.getRequestDispatcher("Insert.jsp");

		if (res > 0) {
			req.setAttribute("res", "tru");
			rd.include(req, resp);
		} else {
			req.setAttribute("res", "fal");
			rd.include(req, resp);
		}
	}

	public static void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s = StudentDAO.getById(Integer.parseInt(req.getParameter("uid")));
		int res = StudentDAO.delete(s);
		RequestDispatcher rd = req.getRequestDispatcher("Delete.jsp");
		if (res == 1) {
			req.setAttribute("res", "tru");
			rd.include(req, resp);
		} else {
			req.setAttribute("res", "fal");
			rd.include(req, resp);
		}
	}

	public static void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		Student s = new Student();
		s.setCity(req.getParameter("city"));
		s.setName(req.getParameter("name"));
		int res = StudentDAO.update(s);

		RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");

		if (res == 1) {
			req.setAttribute("res", "tru");
			try {
				rd.include(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			req.setAttribute("res", "fal");
			try {
				rd.include(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void get(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(Integer.parseInt(req.getParameter("uid")));
		Student s = StudentDAO.getById(Integer.parseInt(req.getParameter("uid")));

		RequestDispatcher rd = req.getRequestDispatcher("Find.jsp");
		if (s != null) {
			req.setAttribute("student", s);
			rd.include(req, resp);
		} else {
			req.setAttribute("student", null);
			rd.include(req, resp);
		}
	}

	public static void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Student> ls = (ArrayList<Student>) StudentDAO.getAll();
		System.out.println(ls);
		RequestDispatcher rd = req.getRequestDispatcher("Find.jsp");
		if (ls != null) {
			req.setAttribute("students", ls);
			rd.include(req, resp);
		} else {
			req.setAttribute("students", null);
			rd.include(req, resp);
		}
	}

	public static void deleteAll(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		int res = StudentDAO.deleteAll();

		RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");

		if (res > 0) {
			req.setAttribute("res", "tru");
			rd.include(req, resp);
		} else {
			req.setAttribute("res", "fal");
			rd.include(req, resp);
		}
	}
}
