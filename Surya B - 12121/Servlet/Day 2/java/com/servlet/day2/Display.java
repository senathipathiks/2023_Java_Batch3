package practiceone;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Display extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String n = request.getParameter("uname");
		String p = request.getParameter("upass");
		
//		RequestDispatcher rd = request.getRequestDispatcher("page.jsp");
//		rd.forward(request, response);
		
		PrintWriter out = response.getWriter();
		
		out.println(n);
		out.print(p);
//		request.setAttribute(n, n);
//		request.setAttribute(p, p);
		
		
		
	}

}
