package day1Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class TableServlet
 */
public class TableServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print("<table border=1>"
				+ "      <h3>Student Details</h3>\r\n"
				+ "      <tr>\r\n"
				+ "        <th>ID</th>\r\n"
				+ "        <th>Name</th>\r\n"
				+ "        <th>City</th>\r\n"
				+ "      </tr>\r\n"
				+ "      <tr>\r\n"
				+ "        <td>101</td>\r\n"
				+ "        <td>Sundhar Raj</td>\r\n"
				+ "        <td>Chennai</td>\r\n"
				+ "      </tr>\r\n"
				+ "    </table>");
	}

}
