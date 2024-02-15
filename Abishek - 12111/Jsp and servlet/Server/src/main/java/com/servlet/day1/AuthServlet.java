
package com.servlet.day1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class AuthServlet extends HttpServlet {
    private HashMap<String, String> users;

    public void AuthServlet () {
        users = new HashMap<>();
        users.put("abishek", "abishek1");
        users.put("moulee", "chandra");
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        AuthServlet a = new AuthServlet ();
        
        if (users.containsKey(name) && users.containsValue(password)) {
            out.println("Name/Password Match");
        } else {
            out.println("Name/Password Does Not Match");
        }
    }
}
