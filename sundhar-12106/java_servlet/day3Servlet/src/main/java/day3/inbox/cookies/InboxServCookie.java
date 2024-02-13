package day3.inbox.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InboxServCookie
 */
public class InboxServCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Cookie cookie[] = request.getCookies();
		
		out.print("<h1>Welcome to inbox " + cookie[1].getValue() + "</h1>");

		out.print("<a href=\"Login.jsp\">click here to move to Sent page</a>");
	}

}
