package com.servlet.day1;

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
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	 PrintWriter out= response.getWriter();
	 out.print("<h1><font color=purple><center>Factorial table</center></font></h1>");
	 out.println("<html>");
     out.println("<body>");
     out.println("<table border=1>");
     out.println("<tr>");
     out.println("<td>");
     out.print("Number");
     out.println("</td>");
     out.println("<td>");
     out.print("Value");
     out.println("</td>");
     out.println("</tr>");
     int i,fact=1;  
     int number=10;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the number");
//     int sc=next
     for(i=1;i<=number;i++) {
    	 out.println("<tr>");
    	 out.println("<td>");
    	 out.print(i+"! is ");
    	 out.println("</td>");
    	 out.println("<td>");
    	 fact=fact*i;   
    	 out.print(fact);
         out.println("</td>"); 
	     out.println("</tr>");
     
     }
     out.println("</table>");
	 out.println("</body>");
	 out.println("</html>");
	}

}
