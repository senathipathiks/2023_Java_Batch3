package Servlet_Day_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookieEx
 */
public class CookieEx extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
		    
		    
		    String name=request.getParameter("name");
		    
		    out.print( "<h1>Welcome to "
		            + name
		            +" Inbox Page</h1>"
		            );
		    
		    out.print( "<a href='SentItem'> Click here to move to SentItem</a>");
		    
		        HttpSession session=request.getSession();
		        session.setAttribute("name", name);
		    
	}

}
