package com.servlet.day1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//out.println("hello world");
		//out.print("<h1><font color=orange><center>Hello abishek!!</center></font>");
//		String u="Abishek";
//        String p="Abishek@1234";
//        
//                String user=request.getParameter("usename");
//                String Pass=request.getParameter("pass");
//                
//                if(user.equals(u)&&Pass.equals(p)) {
//                	response.sendRedirect("Welcome.jsp?user=" +user);
		
//		
//                }
//                else {
//                	response.sendRedirect("Invalid.jsp");
//                }
		
		
		
		//RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
				//rd.forward(request, response);
		
		
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<table border = 2>");
//		out.println("<tr>");
//		out.println("<td>");
//		out.println("Name");
//		out.println("</td>");
//		out.println("<td>");
//		out.println("Qualification");
//		out.println("</td>");
//		out.println("</tr>");
//		out.println("<tr>");
//		out.println("<td>");
//		out.println("Abishek");
//		out.println("</td>");
//		out.println("<td>");
//		out.println("Devops");
//		out.println("</td>");
//		out.println("</tr>");
//		out.println("</table>");
//		out.println("</body>");
//		out.println("</html>");
//		out.println("Welcome " + request.getParameter("fname"));
		
//		RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
//		rd.include(request, response);
//		out.println("<h1>Invalid Username/password</h1>");
		
		
		String action = request.getParameter("button1");
		if(action.equals("add"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("add");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("multiply");
			rd.forward(request, response);
		}
		
		
		
		
		
		
		
		
//        String num1 = request.getParameter("n1");
//        String num2 = request.getParameter("n2");
//        //int n1 = parseInt(num1);
//        
//        int nu1 = Integer.parseInt(num1);
//        int nu2 = Integer.parseInt(num2);
//        
//        int sum = nu1 + nu2;
//        
//        out.print("Sum of the Two Number: "+sum);
			
		
	}

}
