package day2.jsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class AuthServlet extends HttpServlet {
	HashMap<String, String> hm = new HashMap<String, String>();

	public AuthServlet() {
		hm.put("sundhar1120", "Dhanu@1702");
		hm.put("srinivas123", "SriEnter@16");
		hm.put("Kirubakaran@0987", "Kiru@1702");
		hm.put("joe@678", "Joe@1702");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usr_name = req.getParameter("uname");
		String usr_pass = req.getParameter("pass");
	

		
		RequestDispatcher rs1 = req.getRequestDispatcher("Welcome.jsp?uname=" + usr_name);
		PrintWriter out = resp.getWriter();
		
		
		boolean pass_err= false;
		boolean usr_err= false;
		boolean cred_err= false;
		
			if (hm.containsKey(usr_name)&&hm.containsKey(usr_pass)) {
				if (hm.containsKey(usr_name)) {
					if (hm.containsValue(usr_pass)) {
						rs1.forward(req, resp);
					} else {
						pass_err = true;
					}
				} else {
					usr_err = true;
				}
			} else {
				cred_err = true;
			}
		
		if(pass_err == true) {
			RequestDispatcher rs = req.getRequestDispatcher("index.jsp");
			rs.include(req, resp);
			out.print("<span>entered password invalid</span>");
		}
		if(usr_err == true){
			RequestDispatcher rs = req.getRequestDispatcher("index.jsp");
			rs.include(req, resp);
			out.print("<span>Entered username is invalid</span>");
		}
		if(cred_err == true) {
			RequestDispatcher rs = req.getRequestDispatcher("index.jsp");
			rs.include(req, resp);
			out.print("<span>entered password invalid</span>");
		}

	}

}
