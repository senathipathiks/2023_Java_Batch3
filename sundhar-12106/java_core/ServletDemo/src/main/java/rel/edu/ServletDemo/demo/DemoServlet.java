package rel.edu.ServletDemo.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DemoServlet() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"UTF-8\" />\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n"
				+ "    <title>ServletPage</title>\r\n"
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "    <h1>Hello this my first servlet page</h1>\r\n"
				+ "    <p>\r\n"
				+ "      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Totam cum\r\n"
				+ "      aliquid quo aspernatur quidem aperiam natus deleniti enim doloribus!\r\n"
				+ "      Beatae deserunt assumenda omnis amet earum veniam, nihil culpa quos\r\n"
				+ "      voluptatem mollitia magni. Voluptas ab eius illum vitae consectetur\r\n"
				+ "      impedit odio labore omnis recusandae quis distinctio nobis culpa, dicta\r\n"
				+ "      facere ut?\r\n"
				+ "    </p>\r\n"
				+ "  </body>\r\n"
				+ "</html>");
	}

}
