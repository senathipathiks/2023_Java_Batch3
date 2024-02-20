package com.Ass.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.Ass.bean.Petition;
import com.Ass.dao.PetitionDAO;

@WebServlet("/PetiController")
public class PetiController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static PetitionDAO dao = new PetitionDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n=0;
		String action = request.getParameter("button");
  		
		if(action.equals("Insert")) {
			
			if(request.getParameter("pid")=="" || request.getParameter("category")=="" || request.getParameter("desc")=="" || request.getParameter("priority")=="" || request.getParameter("raised")==""  || request.getParameter("assingned")=="" || request.getParameter("status")=="" ) {
				response.sendRedirect("Empty.jsp?action=Insert");

			}
			else {
				
				Petition pet = new Petition(Integer.parseInt(request.getParameter("pid")), request.getParameter("category"), request.getParameter("desc"), request.getParameter("priority"), request.getParameter("raised"), request.getParameter("assingned"), request.getParameter("status"));
				n = dao.insertPetition(pet);	
				
				if(n==1) {
					response.sendRedirect("Sucess.jsp?action=Insert");

				}else {
					response.sendRedirect("Failure.jsp?action=Insert");
				}
			}
		}
		
		else if(action.equals("Delete")) {
			if(request.getParameter("pid")=="") {
				response.sendRedirect("Empty.jsp?action=Delete");
			}else {
				int id = Integer.parseInt(request.getParameter("pid"));
				n = dao.deletePetition(id);
				if(n==1) {
					response.sendRedirect("Sucess.jsp?action=Delete");
				}else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
			}
		}
		
		else if(action.equals("Update")) {
			if(request.getParameter("pid")=="" || request.getParameter("category")=="" || request.getParameter("desc")=="" || request.getParameter("priority")=="" || request.getParameter("raised")==""  || request.getParameter("assingned")=="" || request.getParameter("status")=="" ) {
					response.sendRedirect("Empty.jsp?action=Update");

			}
			else {
				Petition pet1 = new Petition(Integer.parseInt(request.getParameter("pid")), request.getParameter("category"), request.getParameter("desc"), request.getParameter("priority"), request.getParameter("raised"), request.getParameter("assingned"), request.getParameter("status"));
					n = dao.updatePetition(pet1);
				if(n==1) {
					response.sendRedirect("Sucess.jsp?action=Update");

				}else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
			}
		}
		
		else if(action.equals("Find")) {
			if(request.getParameter("pid")=="") {
				response.sendRedirect("Empty.jsp?action=Search");
			}else {
				int id = Integer.parseInt(request.getParameter("pid"));
				Petition pet = dao.findPetition(id);
				if(pet==null) {
					response.sendRedirect("Failure.jsp?action=Find");
				}else {
					request.getSession().setAttribute("bean", pet);
					response.sendRedirect("Sucess.jsp?action=Find");
				}
			}
		}
		
		else if(action.equals("FindAll")) {
			List<Petition> list = dao.findAllPetition();
			if(list.isEmpty()) {
				response.sendRedirect("Failure.jsp?action=FindAll");
			}else {
				request.getSession().setAttribute("list", list);
				response.sendRedirect("Sucess.jsp?action=FindAll");
			}
		}
	}
}
