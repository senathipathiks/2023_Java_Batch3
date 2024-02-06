package day1Servlet.Day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class ValidateServlet
 */
public class ValidateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sundhar1120");
		al.add("kirubs123");
		al.add("joe987");
		al.add("srinivas4567");
		
		String pass = "jackDaniels@5999";
		
		String user_inp = req.getParameter("usr_name");
		String pass_inp = req.getParameter("pass");
		boolean res = false;
		
		for (String s : al) {
			if(s.equals(user_inp) && pass_inp.equals(pass))
				res = true;
		}
		
		if(res)
			resp.getWriter().print("<h1>Username validated successfully...!</h1>");
		else
			resp.getWriter().print("<h1>Entered user id not present</h1>");
	   
	}

}
