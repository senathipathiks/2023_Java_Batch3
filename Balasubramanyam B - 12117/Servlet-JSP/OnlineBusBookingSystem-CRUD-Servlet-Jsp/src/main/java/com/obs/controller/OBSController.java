package com.obs.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.obs.bean.*;
import com.obs.dao.*;

@WebServlet("/OBSController")
public class OBSController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static OnlineBusBookingSystemDAO dao = new OnlineBusBookingSystemDAO();

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int n = 0;
        String action = request.getParameter("button");

        if (action.equals("Insert")) {
            if (request.getParameter("BusNo").isEmpty() || request.getParameter("BusName").isEmpty() || request.getParameter("RouteFrom").isEmpty() || request.getParameter("RouteTo").isEmpty() || request.getParameter("BusType").isEmpty() 
                    || request.getParameter("dep").isEmpty() || request.getParameter("arrival").isEmpty() || request.getParameter("totalSeats").isEmpty() || request.getParameter("AvailableSeats").isEmpty() || request.getParameter("fare").isEmpty()) {
                response.sendRedirect("Empty.jsp?action=Insert");
            } else {
                OnlineBusBookingSystem obs = new OnlineBusBookingSystem(Integer.parseInt(request.getParameter("BusNo")), request.getParameter("BusName"),request.getParameter("RouteFrom"),request.getParameter("RouteTo"),request.getParameter("BusType"),request.getParameter("dep"),request.getParameter("arrival"),Integer.parseInt(request.getParameter("totalSeats")),Integer.parseInt(request.getParameter("AvailableSeats")), Integer.parseInt(request.getParameter("fare")));
                n = dao.insertOnlineBusBookingSystem(obs);
                if (n == 1) {
                    response.sendRedirect("Success.jsp?action=Insert");
                } else {
                    response.sendRedirect("Failure.jsp?action=Insert");
                }
            }
        }
        
        else if (action.equals("Delete")) {
            if (request.getParameter("BusNo").isEmpty()) {
                response.sendRedirect("Empty.jsp?action=Delete");
            } else {
                int id = Integer.parseInt(request.getParameter("BusNo"));
                n = dao.deleteOnlineBusBookingSystem(id);
                if (n == 1) {
                    response.sendRedirect("Success.jsp?action=Delete");
                } else {
                    response.sendRedirect("Failure.jsp?action=Delete");
                }
            }
        }
        
        else if (action.equals("Update")) {
            if (request.getParameter("BusNo").isEmpty() || request.getParameter("BusName").isEmpty() || request.getParameter("RouteFrom").isEmpty() || request.getParameter("RouteTo").isEmpty() || request.getParameter("BusType").isEmpty() 
                    || request.getParameter("dep").isEmpty() || request.getParameter("arrival").isEmpty() || request.getParameter("totalSeats").isEmpty() || request.getParameter("AvailableSeats").isEmpty() || request.getParameter("fare").isEmpty()) {
                response.sendRedirect("Empty.jsp?action=Update");
            } else {
                OnlineBusBookingSystem obs = new OnlineBusBookingSystem(Integer.parseInt(request.getParameter("BusNo")), request.getParameter("BusName"),request.getParameter("RouteFrom"),request.getParameter("RouteTo"),request.getParameter("BusType"),request.getParameter("dep"),request.getParameter("arrival"),Integer.parseInt(request.getParameter("totalSeats")),Integer.parseInt(request.getParameter("AvailableSeats")), Integer.parseInt(request.getParameter("fare")));
                n = dao.updateOnlineBusBookingSystem(obs);
                if (n == 1) {
                    response.sendRedirect("Success.jsp?action=Update");
                } else {
                    response.sendRedirect("Failure.jsp?action=Update");
                }
            }
        }
        
        
        if (action.equals("Search")) {
            if (request.getParameter("BusNo").isEmpty()) {
                response.sendRedirect("Empty.jsp?action=Search");
            } else {
                int id = Integer.parseInt(request.getParameter("BusNo"));
                OnlineBusBookingSystem obs = dao.searchOnlineBusBookingSystem(id);
                if (obs == null) {
                    response.sendRedirect("Failure.jsp?action=Search");
                } else {
                    request.getSession().setAttribute("bean", obs);
                    response.sendRedirect("Success.jsp?action=Search");
                }
            }
        }
        
        else if (action.equals("Viewall")) {
            List<OnlineBusBookingSystem> list = dao.viewAll();
            if (list.isEmpty()) {
                response.sendRedirect("Failure.jsp?action=View");
            } else {
                request.getSession().setAttribute("list", list);
                response.sendRedirect("Success.jsp?action=View");
            }
        }
    }
}
