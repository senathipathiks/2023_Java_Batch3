package main;

import java.io.IOException;
import java.io.PrintWriter;

import com.bean.Employee;
import com.dao.Employeedao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		Employeedao dao = new Employeedao();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			Employee e1 =  new Employee();
			
			String name = request.getParameter("ename");
			String city = request.getParameter("ecity");
			
			e1.setEname(name);
			e1.setEcity(city);
			System.out.println("Jeeva");
			n = dao.insertEmployee(e1);
			System.out.println("Java Jeeva");
			if(n>0) {
				response.sendRedirect("insertsuccess.jsp");
			}
		}
		
	}

}
