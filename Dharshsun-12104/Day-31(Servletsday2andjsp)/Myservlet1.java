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
 * Servlet implementation class Myservlet1
 */
public class Myservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		String action=request.getParameter("button1");
        
        if(action.equals("Calc"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("Calculator");
            rd.forward(request, response);
        }
        else
        {
            RequestDispatcher rd=request.getRequestDispatcher("Multiplication");
            rd.forward(request, response);
        }
//		String n = "Dharshsun";
//		if(n.equals("Dharshsun")) { 
//		RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
//		rd.include(request, response);
//		out.println("<h1>welcome</h1>"+request.getParameter("fname"));
//		}else {
//		RequestDispatcher rd1 = request.getRequestDispatcher("Index.jsp");
//		rd1.include(request, response);
//		out.println("<h1>Invalid UserName/Password</h1>");
//		}
//		String name = request.getParameter("fname");
//		response.sendRedirect("Welcome.jsp?fname="+name);
//		out.print("<h1><font color=blue><center>This is my first servlet</center></font></h1>");
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<table border=1>");
////		out.println("<th>");
//		
//		out.println("<tr>");
//		out.println("<td>");
//		out.println("qualification");
//		out.println("</td>");
//		out.println("<td>");
//		out.println("name");
//		out.println("</td>");
//		out.println("</tr");
//		out.println("<tr>");
//		out.println("<td>");
//		out.println("B.Tech");
//		out.println("</td>");
//		out.println("<td>");
//		out.println("Dharshsun.S");
//		out.println("</td>");
////		out.println("</tr>");
//		out.println("</tr");
////		for(int i=0;i<10;i++) {
////			out.println("<tr>");
////			out.println("<td>");
////			out.println(i+ "X 1");
////			out.println("</td>");
////			out.println("<td>");
////			out.print(i*1);
////			
////		}
////		out.println("</th>");
//		out.println("</table>");
//		out.println("</body>");
//		out.println("</html>");
//	}

}
}
