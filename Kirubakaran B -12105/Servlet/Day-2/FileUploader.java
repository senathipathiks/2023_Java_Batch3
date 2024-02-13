package com.servlet.day2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

/**
 * Servlet implementation class FileUploader
 */
public class FileUploader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
         Part part = request.getPart("file");
        
        String file1 = part.getSubmittedFileName();
        
        for (Part p1 : request.getParts()) {
            
            p1.write("D:\\"+file1);
            
            
        }
        
        response.getWriter().print("file upload Successfully");
        
        

	}
}
