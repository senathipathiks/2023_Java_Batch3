package smsApplication.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import smsApplication.bean.Student;
import smsApplication.dao.StudentDAO;

/**
 * Servlet implementation class FetchServlet
 */
public class FetchServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		StudentDAO dao = new StudentDAO();
//		PrintWriter out = resp.getWriter();
//		String action = req.getParameter("button");
//		
//		if (action.equals("Find")) {
//			RequestDispatcher rd = req.getRequestDispatcher("Fetch.jsp");
//			int sid = Integer.parseInt(req.getParameter("id"));
//			Student s = dao.fetchById(sid);
//			
//			if(s != null) {
//				rd.include(req, resp);
//				out.print("<br><br><br>"
//						+ " <div\r\n"
//						+ "      class=\"container d-flex justify-content-center align-items-center vh-100\"\r\n"
//						+ "    >\r\n"
//						+ "      <form action=\"\" method=\"post\">\r\n"
//						+ "        <table class=\"table table-bordered\">\r\n"
//						+ "          <tr>\r\n"
//						+ "            <th>Student ID</th>\r\n"
//						+ "            <th>Student name</th>\r\n"
//						+ "            <th>Student City</th>\r\n"
//						+ "          </tr>\r\n"
//						+ "          <tr>\r\n"
//						+ "            <td>"+s.getId() +"</td>\r\n"
//						+ "            <td>"+s.getName()+"</td>\r\n"
//						+ "            <td>"+s.getCity()+"</td>\r\n"
//						+ "          </tr>\r\n"
//						+ "        </table>\r\n"
//						+ "      </form>\r\n"
//						+ "    </div>");
//			}
//		}
	}

}
