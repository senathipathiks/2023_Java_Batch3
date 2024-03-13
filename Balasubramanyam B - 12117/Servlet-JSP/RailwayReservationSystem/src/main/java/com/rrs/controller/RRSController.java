package com.rrs.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.rrs.bean.RailwayReservationSystem;
import com.rrs.dao.RRSDAO;

public class RRSController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static RRSDAO dao = new RRSDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			if(request.getParameter("TrainID")=="" || request.getParameter("TrainName")=="" || request.getParameter("TrainType")=="" || request.getParameter("No_of_seats")=="" || request.getParameter("Source")=="" || request.getParameter("Destination")==""|| request.getParameter("Fare")=="" ) {
				response.sendRedirect("Empty.jsp?action=Insert");

			}
			else {
				RailwayReservationSystem rrs = new RailwayReservationSystem(Integer.parseInt(request.getParameter("TrainID")), request.getParameter("TrainName"),request.getParameter("TrainType"), Integer.parseInt(request.getParameter("No_of_seats")),request.getParameter("Source"),request.getParameter("Destination"), Float.parseFloat(request.getParameter("Fare")));
				n = dao.insertRailwayReservationSystem(rrs);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		}
		
		else if(action.equals("Delete")) {
			if(request.getParameter("TrainID")=="") {
				response.sendRedirect("Empty.jsp?action=Delete");
			}else {
				int TrainId = Integer.parseInt(request.getParameter("TrainID"));
				n = dao.deleteRailwayReservationSystem(TrainId);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Delete");
				}else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
			}
		}
		
		else if(action.equals("Update")) {
			if(request.getParameter("TrainID")=="" || request.getParameter("TrainName")=="" || request.getParameter("TrainType")=="" || request.getParameter("No_of_seats")=="" || request.getParameter("Source")=="" || request.getParameter("Destination")==""|| request.getParameter("Fare")=="" ) {
				response.sendRedirect("Empty.jsp?action=Update");

			}
			else {
				RailwayReservationSystem rrs = new RailwayReservationSystem(Integer.parseInt(request.getParameter("TrainID")), request.getParameter("TrainName"),request.getParameter("TrainType"), Integer.parseInt(request.getParameter("No_of_seats")),request.getParameter("Source"),request.getParameter("Destination"), Float.parseFloat(request.getParameter("Fare")));
				n = dao.updateRailwayReservationSystem(rrs);
				if(n==1) {
					response.sendRedirect("Success.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
			}
		}
		
		else if(action.equals("Search")) {
			if(request.getParameter("TrainID")=="") {
				response.sendRedirect("Empty.jsp?action=Search");
			}else {
				int TrainId = Integer.parseInt(request.getParameter("TrainID"));
				RailwayReservationSystem rrs = dao.searchRailwayReservationSystem(TrainId);
				if(rrs==null) {
					response.sendRedirect("Failure.jsp?action=Search");
				}else {
					request.getSession().setAttribute("bean", rrs);
					response.sendRedirect("Success.jsp?action=Search");
				}
			}
		}
		
		else if(action.equals("ViewAll")) {
			List<RailwayReservationSystem> list = dao.viewAll();
			if(list==null) {
				response.sendRedirect("Failure.jsp?action=View");
			}else {
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Success.jsp?action=View");
			}
		}
	}}