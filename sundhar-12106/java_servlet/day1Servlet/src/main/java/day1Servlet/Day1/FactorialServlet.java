package day1Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FactorialServlet
 */
public class FactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.print("<html>" + "<title>Factorial</title>"
				+"<style>"
				+ "table,\r\n"
				+ "      th,\r\n"
				+ "      tr,\r\n"
				+ "      td {\r\n"
				+ "        border: 1px solid black;\r\n"
				+ "        border-collapse: collapse;\r\n"
				+ "        padding: 10px;\r\n"
				+ "      }"
				+"th{"
				+ "font-weight : bold;}"
				+ "</style>"
				+ "<body>"
				+ "<table border=1>"
				+ "<tr>" + "<th>Number</th>"
				+ "<th>Factorial</th>" + "<tr>");
		int fact = 1;
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= i; j++) {

				fact *= j;
			}
			out.print("<tr>" + "<td>" + i + "</td>" + "<td>" + fact + "</td>" + "<tr>");
			fact = 1;
		}

		out.print("</table></body></html>");

	}

}
