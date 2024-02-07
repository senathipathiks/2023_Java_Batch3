package com.servlet.day2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

/**
 * Servlet implementation class Fileuploader
 */

@MultipartConfig(
		  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		  maxFileSize = 1024 * 1024 * 10,      // 10 MB
		  maxRequestSize = 1024 * 1024 * 100   // 100 MB
		)
public class Fileuploader extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		
		
		Part filePart = request.getPart("fname");
		
//		String name=request.getParameter("fname");
		
		  String fileName = filePart.getSubmittedFileName();
		  
		  File file=new File("D:\\JavaPrograms\\"+fileName);
		 
		  if(file.exists()) {
			  
				    response.getWriter().print("File already exists");
				  
		  }
		  else {
		    for (Part part : request.getParts()) {
		    	
	    	
		      part.write("D:\\JavaPrograms\\"+fileName);
		    
		      response.getWriter().print("The file uploaded sucessfully.");
		    }
		  }     
	}
}


