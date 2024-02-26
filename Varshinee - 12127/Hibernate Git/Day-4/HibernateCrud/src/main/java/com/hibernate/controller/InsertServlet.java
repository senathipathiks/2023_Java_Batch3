package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.hibernate.DAO.StudentDAO;
import com.hibernate.bean.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public InsertServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int n = 0;
		StudentDAO dao = new StudentDAO();
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");

		if (action.equals("Insert")) {
			int id = Integer.parseInt(request.getParameter("Id"));
			String name = request.getParameter("Name");
			String city = request.getParameter("City");
			Student stud = new Student(id, name, city);
			n = dao.insertStudent(stud);
			if (n == 1) {
				response.sendRedirect("insertSuccess.jsp");
			} else {
				response.sendRedirect("insertFailure.jsp");
			}

		}
//------------------------------------------------------------------------------------------------------------------------------------
		else if(action.equals("Update")){
            int n1=0;
            StudentDAO dao1=new StudentDAO();
            PrintWriter out1=response.getWriter();
            String action1=request.getParameter("button");
            
            if(action1.equals("Update"))
            {
                
                
                int id=Integer.parseInt(request.getParameter("Id"));
//                Student stud=dao.UpdateStudent(id);
                String name=request.getParameter("Name");
                int deptId=Integer.parseInt(request.getParameter("Id"));
                String deptName=request.getParameter("Name");
                String city=request.getParameter("City");
                
               
                Student stud1=new Student(id,name,city);
                n1=dao1.updateStudent(stud1);
                if(n1==1) {
                	response.sendRedirect("updateSuccess.jsp?action=Update");
//                    out.write("<h1> <font color=green><center> Record Update Successfully</center> </font></h1>");
                }
                else
                {
                	response.sendRedirect("updateFailure.jsp?action=Update");
//                    out.write("<h1> <font color=red> Record updation Failure </font></h1>");
                }
            
		}

	}
		
	}

}
