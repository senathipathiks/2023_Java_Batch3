package day1jsp;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AbcServlet extends HttpServlet{
	
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			Enumeration<String> na = getInitParameterNames();
			while(na.hasMoreElements())
				resp.getWriter().print(na.nextElement());
		}
}
