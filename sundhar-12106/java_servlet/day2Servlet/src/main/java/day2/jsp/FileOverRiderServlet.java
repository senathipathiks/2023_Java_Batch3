package day2.jsp;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

/**
 * Servlet implementation class FileOverRiderServlet
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024
		* 100)
public class FileOverRiderServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Part part = request.getPart("file1");

		System.out.println(part.getHeader("file1"));

		String fname = part.getSubmittedFileName();

		File file = new File(
				"D:\\hands-on\\sundhar-12106\\java_servlet\\day2Servlet\\src\\main\\webapp\\WEB-INF\\" + fname);
//		System.out.println(file.getAbsolutePath());
		if (file.exists()) {

			response.getWriter().print("file is already exists");

		} else {

//			for (Part part1 : request.getParts()) {
//
//				part1.write(
			part.write("D:\\hands-on\\sundhar-12106\\java_servlet\\day2Servlet\\src\\main\\webapp\\WEB-INF\\" + fname);

			response.getWriter().print("file upload Successfully");
//			}
		}

	}

}