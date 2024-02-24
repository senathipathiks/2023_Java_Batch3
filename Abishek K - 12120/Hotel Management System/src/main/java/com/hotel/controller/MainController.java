package com.hotel.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.hotel.DAO.HotelDao;
import com.hotel.bean.Hotel;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class MainController extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		Hotel htl = new Hotel();
		HotelDao dao = new HotelDao();
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			
			
			String rmtype = request.getParameter("rmtype");
			String rmtariff = request.getParameter("rmtariff");
			String rmdesc = request.getParameter("rmdesc");
			String rmoccup = request.getParameter("rmoccup");
			
			htl.setRmtype(rmtype);
			htl.setRmtariff(rmtariff);
			htl.setRmdesc(rmdesc);
			htl.setRmoccup(rmoccup);
			
			 n= dao.insertHotel(htl);
			
			if(n>0) {
				response.sendRedirect("Success.jsp?action=Insert");
			}
			else {
				response.sendRedirect("Failure.jsp?action=Insert");
			}
			
			
	}
		else if(action.equals("Find")) {
			
		    int id  = Integer.parseInt(request.getParameter("rmid"));
		    
		    Hotel htl1 = dao.findHotel(id);
		    
		    if(htl1!=null) {
		    	request.getSession().setAttribute("bean",htl1);
		    	response.sendRedirect("Success.jsp?action=Find");
		    }
		    else{
		    	response.sendRedirect("Failure.jsp?action=Find");
		    }
			
			
		}
		
		else if(action.equals("FindAll")) {
			
			List<Hotel> list = dao.findallHotel();
			
			if(list.size()>0) {
				
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Success.jsp?action=FindAll");
			}
			else {
				response.sendRedirect("Failure.jsp?action=FindAll");
			}
			
		}
		
		else if(action.equals("Update")) {
			
			int rmid = Integer.parseInt(request.getParameter("rmid"));
			String rmtype = request.getParameter("rmtype");
			String rmtariff = request.getParameter("rmtariff");
			String rmdesc = request.getParameter("rmdesc");
			String rmoccup = request.getParameter("rmoccup");
			
			htl.setId(rmid);
			htl.setRmtype(rmtype);
			htl.setRmtariff(rmtariff);
			htl.setRmdesc(rmdesc);
			htl.setRmoccup(rmoccup);
			
			n=dao.updateHotel(htl);
			
			if(n>0) {
				response.sendRedirect("Success.jsp?action=Update");
			}
			else {
				response.sendRedirect("Failure.jsp?action=Update");
			}
			
		}
		
		else if(action.equals("Delete")) {
			
			int rmid = Integer.parseInt(request.getParameter("rmid"));
			
			Hotel temp = dao.deleteHotel(rmid);
			
			if(temp!=null) {
				response.sendRedirect("Success.jsp?action=Delete");
			}
			else {
				response.sendRedirect("Failure.jsp?action=Delete");
			}
			
		}

}
}
