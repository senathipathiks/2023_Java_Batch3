package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login2
 */
public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out = response.getWriter();
	
	RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
	RequestDispatcher ds=request.getRequestDispatcher("Login2.jsp");
        
        String uname = request.getParameter("username");
        String pass=request.getParameter("password");
        
         if(uname.equals("Deepika") && pass.equals("DeepikaSai@123"))
         {  
                rd.forward(request, response);
          }  
            else
            {  
            	ds.include(request, response);
                out.print("<h1>"+"Invalid User name or password "+"</h1>");  
                  
           }
	}

}
