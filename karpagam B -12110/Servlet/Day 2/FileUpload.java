package com.servlet.Day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

/**
 * Servlet implementation class FileUpload
 */

@MultipartConfig(
		  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		  maxFileSize = 1024 * 1024 * 10,      // 10 MB
		  maxRequestSize = 1024 * 1024 * 100   // 100 MB
		)
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           Part part = request.getPart("file1");
		
		String fname = part.getSubmittedFileName();
		
		
		
		
		File file = new File("D:\\demo\\"+fname);
		//System.out.println(file.getAbsolutePath());
		if(file.exists()){
			
			response.getWriter().print("<h1>file is already exists</h1>");
		    
		}
		else {

			for (Part part1 : request.getParts()) {
				
				part1.write("D:\\demo\\"+fname);
				
				response.getWriter().print("<h1>file upload Successfully</h1>");
			}
		}	}

}
