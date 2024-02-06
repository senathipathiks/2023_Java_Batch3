package com.servlet.day1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Factorial
 */
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
        out.print("<html>");
        out.print("<body>");
        
        out.print("<table border=1>");
        out.print("<tr>");
        out.print("<td>");
        out.print("Factorial ");
        out.print("</td>");
        
        out.print("<td>");
        out.print("Result");
        out.print("</td>");
        out.print("</tr>");
        int i,fact=1;  
        int number=5;//It is the number to calculate factorial    
        
       
        for(i=1;i<=number;i++){    
            fact=fact*i;  
        }
      
        out.print("<td>"); 
        out.print("The Factorial Number is 5 !!");
        out.print("</td>");
        
       
        out.print("<td>"); 
        out.print(fact);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
		
		
		
	}

}
