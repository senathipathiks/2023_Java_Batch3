package com.java.usermanagement.main;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.java.usermanagement.bean.UserBean;
import com.java.usermanagement.dao.UserDAO;



/**
 * Servlet implementation class User
 */
@WebServlet("/")
public class UserMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;


	public void init() {
        userDAO = new UserDAO();
    }



	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        doGet(request, response);
			    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String action = request.getServletPath();




	try {
				switch (action) {
		    case "/new":
		        showNewForm(request, response);
		        break;
		    case "/insert":
		        insertUser(request, response);
		        break;
		    case "/delete":
		        deleteUser(request, response);
		        break;
		    case "/edit":
		        showEditForm(request, response);
		        break;
		    case "/update":
		        updateUser(request, response);
		        break;
		    default:
		        listUser(request, response);
		        break;
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

public void listUser(HttpServletRequest request, HttpServletResponse response) {


	UserDAO dao = new UserDAO();

	try {
		List<UserBean> listUser = dao.findAll();

		request.setAttribute("listUser", listUser);

		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");

		dispatcher.forward(request, response);
	} catch (Exception e) {
		e.printStackTrace();
	}

	}

public void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

	int id = Integer.parseInt(request.getParameter("id"));

	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String country= request.getParameter("country");


    UserBean ub = new UserBean(id, name, email, country);

	UserDAO dao = new UserDAO();

	int n = dao.updateUser(ub);

	if(n==1) {
		System.out.println("User value Updation Successfully !!!");
	}
	else {
		System.out.println("Updation Failed !!!");
	}

	response.sendRedirect("list");


	}

public void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 int id = Integer.parseInt(request.getParameter("id"));
	 UserDAO dao = new UserDAO();
     try {
		UserBean exUser = dao.find(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("user", exUser);
		dispatcher.forward(request, response);

	} catch (Exception e) {
		e.printStackTrace();
	}

	}

public void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

	int id = Integer.parseInt(request.getParameter("id"));

	UserDAO dao = new UserDAO();

	int n = dao.deleteUser(id);

	if(n==1) {
		System.out.println("User value deletion Successfully !!!");
	}
	else {
		System.out.println("deletion Failed !!!");
	}

	response.sendRedirect("list");

	}

public void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String country= request.getParameter("country");

	UserBean ub = new UserBean(name, email, country);

	UserDAO dao = new UserDAO();

	int n = dao.insertUser(ub);

	if(n==1) {
		System.out.println("User value inserted Successfully !!!");
	}
	else {
		System.out.println("Insertion Failed !!!");
	}

	response.sendRedirect("list");

	}



public static void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
     dispatcher.forward(request, response);



}

	}