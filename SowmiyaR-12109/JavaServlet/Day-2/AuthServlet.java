package com.servlet.day2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
      private static final long serialVersionUID = 1L;
        private HashMap<String, String> userCredentials;

        public AuthServlet() {
            super();
            // Initialize HashMap with dummy username-password pairs
            userCredentials = new HashMap<>();
            userCredentials.put("Sowmiya", "Sowmiya@123");
            userCredentials.put("SowmiyaRamu", "SowmiyaRamu@123");
            userCredentials.put("Sowmi", "Sowmi@123");
        }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
                String username = request.getParameter("username");
                String password = request.getParameter("password");

                PrintWriter out = response.getWriter();
                response.setContentType("text/html");

                if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
                    out.println("<h2>Name/Password Match</h2>");
                } else {
                    out.println("<h2>Name/Password Does Not Match</h2>");
                }
    }

}
