package day3.inbox;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		

		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		if (name == null) {
			name = request.getParameter("uname");
			session.setAttribute("name", name);
		}
		out.print("<h1>Welcome to inbox " + name + "</h1>");

		out.print("<a href=\"SentItemServlet\">click here to move to Sent page</a>");

	}

}
