package day3.inbox;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SentItemServlet
 */
public class SentItemServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		HttpSession session = req.getSession();

		String name = (String) session.getAttribute("name");

		if (name != null) {
			out.print("<h1>Welcome to sent " + name + "</h1>");

			out.print("<a href=\"ProfileServlet\">click here to move to Profile page</a>");
		} else {
			RequestDispatcher ds = req.getRequestDispatcher("/Login.jsp");
			ds.include(req, resp);
		}
	}

}
