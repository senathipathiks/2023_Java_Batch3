package com.servlet.day2;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/*Create a servlet and name it as FileUploader.
Create an html/jsp file with a form with fields for uploading a file and a check box for allowing overwrite.
Uploads folder should be named uploads and should be immediately under the WEB-INF folder.
The FileUploader servlet should check if there is already a file with the name specified in the uploads folder first.
If there is a file and Overwrite is checked, then write, and return message 'File is Overwritten'.
If there is a file and Overwrite is NOT checked, return a message that 'File already exist and Overwrite not checked.'
If there is no file with same name, write the file and return a message that 'File Written.'*/
public class FileUploader extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();	
		
		
		File ref = new File("D:\\WorkSpace\\ServletProject\\src\\main\\webapp\\WEB-INF\\uploads");
		
		boolean b=ref.exists();
		
		if(b==false) {
			ref.mkdir();
			pw.write("File Created");
		}else {
			pw.write("File Exits");
		}
		
		
	
	}

}
