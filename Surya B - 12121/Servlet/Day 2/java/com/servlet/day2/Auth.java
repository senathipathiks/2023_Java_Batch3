package practiceone;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Auth extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	HashMap<String, String> h = new HashMap<String, String>();
	
	h.put("Surya", "12345");
	h.put("Vignesh", "1234");
	h.put("Sundar", "123");
	
	String n = request.getParameter("name");
	String p = request.getParameter("pass");
	
	PrintWriter out = response.getWriter();
	
	if(p.equals(h.get(n)))
			{
		out.print("Welcome " + n);
	}
	else 
	{
		out.print("WRONG PASSWORD");
	}
	}

}
