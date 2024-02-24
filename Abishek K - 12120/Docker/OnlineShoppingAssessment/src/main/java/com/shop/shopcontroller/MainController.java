package com.shop.shopcontroller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.shop.ShopDao.ShopDao;
import com.shop.bean.Shop;


public class MainController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int n=0;
		ShopDao dao = new ShopDao();
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("button");
		
		if(action.equals("Insert")) {
			
			int shopID = Integer.parseInt(request.getParameter("shid"));
			String shopName = request.getParameter("shname");
			String shopLocation = request.getParameter("shlocation");
			String shopPHNo = request.getParameter("shph");
			
			
			Shop htl = new Shop(shopID, shopName, shopLocation, shopPHNo);
		    n= dao.shopInsert(htl);
			
			if(n>0) {
				response.sendRedirect("Success.jsp?action=Insert");
			}
			else {
				response.sendRedirect("Failure.jsp?action=Insert");
			}
		}
			
			else if(action.equals("Find")) {
				
				int id = Integer.parseInt(request.getParameter("shid"));
				
				Shop htl = dao.shopFind(id);
				
				if(htl!=null) {
					request.getSession().setAttribute("bean", htl);
					response.sendRedirect("Success.jsp?action=Find");
				}
				else {
					response.sendRedirect("Failure.jsp?action=Find");
				}
				
			}
			
			else if(action.equals("FindAll")) {
				
				ArrayList<Shop> list = new ArrayList<Shop>();
				list = dao.shopFindall();
				
				if(list.size()!=0) {
					request.getSession().setAttribute("list", list);
					response.sendRedirect("Success.jsp?action=FindAll");
				}
				else {
					response.sendRedirect("Failure.jsp?action=FinAll");
				}
				
			}
			
			else if(action.equals("Update")) {
				
				int shopID = Integer.parseInt(request.getParameter("shid"));
				String shopName = request.getParameter("shname");
				String shopLocation = request.getParameter("shlocation");
				String shopPHNo = request.getParameter("shph");
				
				
				Shop htl = new Shop(shopID, shopName, shopLocation, shopPHNo);
				n= dao.shopUpdate(htl);
				
				if(n>0) {
					response.sendRedirect("Success.jsp?action=Update");
				}
				else {
					response.sendRedirect("Failure.jsp?action=Update");
				}
				
			}
			
			else if(action.equals("Delete")) {
				
				int id = Integer.parseInt(request.getParameter("shid"));
				
				n=dao.shopDelete(id);
				
				if(n>0) {
					response.sendRedirect("Success.jsp?action=Delete");
				}
				else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
				
			}
			
			
			
		}
		
		
	}


