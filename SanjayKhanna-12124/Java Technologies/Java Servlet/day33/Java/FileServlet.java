package com.servlet.day2;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletInputStream;
//import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.MultipartConfig;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.Part;

import java.io.*;


public class FileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("FileUploader.jsp");
		PrintWriter out = response.getWriter();
		String filename = request.getParameter("file");
		String checkedStatus = request.getParameter("box");
		
		String path = "D:\\Work Space\\ServletProject\\src\\main\\webapp\\WEB-INF\\Uploads\\";
		
		File newFile = new File(path+filename);
		
		if(newFile.exists() && checkedStatus == null) {
			rd.include(request, response);
			out.println("<h1>File already exist and Overwrite not checked.</h1>");
		}
		
		else if(newFile.exists()) {
			FileOutputStream fout = new FileOutputStream(new File(path+filename));
			InputStream fin = request.getInputStream();
			int byteRead = 0;
			byte[] buffer = new byte[1024];
			while((byteRead = fin.read(buffer))!= -1)
				fout.write(buffer, 0, byteRead);
			rd.include(request, response);
			out.println("<h1>File is Overwritten</h1>");
			fin.close();
			fout.close();
		}
		else {
			FileOutputStream fout = new FileOutputStream(new File(path+filename));
			InputStream fin = request.getInputStream();
			int byteRead = 0;
			byte[] buffer = new byte[1024];
			while((byteRead = fin.read(buffer) )!= -1)
				fout.write(buffer, 0, byteRead);
			rd.include(request, response);
			out.println("<h1>File is written</h1>");
			fin.close();
			fout.close();
		}
	}
		
}
