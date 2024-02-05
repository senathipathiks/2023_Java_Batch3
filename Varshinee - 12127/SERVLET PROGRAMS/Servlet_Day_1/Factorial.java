package com.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Servlet implementation class Factorial
 */
public class Factorial extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<html>");
        out.print("<body>");
        
        out.print("<table border=1>");
        out.print("<tr>");
        out.print("<td>");
        out.print("Factorial");
        out.print("</td>");
        
        out.print("<td>");
        out.print("Result");
        out.print("</td>");
        out.print("</tr>");
        
        
        
        int i,fact=1;  
        int number=5;  
        for(i=1;i<=number;i++) {
            out.println("<tr>");
            out.println("<td>");
            out.print("Factorial of  "+i);
            out.println("</td>");
            out.println("<td>");
            fact=fact*i;   
            out.print(fact);
        out.println("</td>"); 
        out.println("</tr>");
        
        }
        

        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
			
	}

}
