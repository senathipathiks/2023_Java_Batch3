package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

/**
 * Servlet implementation class FileUploader
 */

@MultipartConfig(
		  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		  maxFileSize = 1024 * 1024 * 10,      // 10 MB
		  maxRequestSize = 1024 * 1024 * 100   // 100 MB
		)
public class FileUploader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part part=request.getPart("file1");
		String Filename=part.getSubmittedFileName();
		
		File nfile=new File("D:\\"+Filename);
		System.out.println(nfile.getAbsolutePath());
		
		if(nfile.exists()) {
			response.getWriter().print("<h1>File is already exists</h1>");
		}
		else {
			for(Part part1:request.getParts()) {
				part1.write("D:\\"+Filename);
				response.getWriter().print("<h1>File uploaded Successfully</h1>");
			}
		}
		
	}

}
