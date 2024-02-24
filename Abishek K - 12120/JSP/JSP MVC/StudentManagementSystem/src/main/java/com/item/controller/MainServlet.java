package com.item.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.item.bean.Item;
import com.item.itemdao.ItemDao;

public class MainServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int n = 0;
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		ItemDao dao = new ItemDao();

		if (action.equals("Insert")) {

			String id1 = request.getParameter("iId");

			String name = request.getParameter("iName");
			String p1 = request.getParameter("iPrice");

			String seller = request.getParameter("iSeller");
			String buyer = request.getParameter("iBuyer");
			String status = request.getParameter("iStatus");

			int id = Integer.parseInt(id1);
			double price = Double.parseDouble(p1);

			Item itm = new Item(id, name, price, seller, buyer, status);

			n = dao.itemInsert(itm);

			if (n>0) {
				response.sendRedirect("Success.jsp?action=Insert");
			} else {
				response.sendRedirect("Failure.jsp?action=Insert");
			}

		}

		else if (action.equals("Find")) {
			String id1 = request.getParameter("iId");

			if (id1 == "") {
				response.sendRedirect("Empty.jsp?action=Find");
			} else {

				int id = Integer.parseInt(request.getParameter("iId"));

				Item itm = dao.findItem(id);

				if (itm != null) {
					request.getSession().setAttribute("bean", itm);
					response.sendRedirect("Success.jsp?action=Find");
				} else {
					response.sendRedirect("Failure.jsp?action=Find");
				}

			}

		}

		else if (action.equals("FindAll")) {

			ArrayList<Item> list = dao.findAll();

			if (list.size() > 0) {
				request.getSession().setAttribute("All", list);
				response.sendRedirect("Success.jsp?action=FindAll");
			} else {
				response.sendRedirect("Failure.jsp?action=FindAll");
			}
		}

		else if (action.equals("Delete")) {
			String id1 = request.getParameter("iId");

			if (id1 == "") {
				response.sendRedirect("Empty.jsp?action=Delete");
			} else {
				int id = Integer.parseInt(request.getParameter("iId"));
				n = dao.deleteItem(id);

				if (n > 0) {
					response.sendRedirect("Success.jsp?action=Delete");
				} else {
					response.sendRedirect("Failure.jsp?action=Delete");
				}
			}
		}

		else if (action.equals("Update")) {

			String id1 = request.getParameter("iId");

			String name = request.getParameter("iName");
			String p1 = request.getParameter("iPrice");

			String seller = request.getParameter("iSeller");
			String buyer = request.getParameter("iBuyer");
			String status = request.getParameter("iStatus");

			int id = Integer.parseInt(id1);
			double price = Double.parseDouble(p1);

			Item itm = new Item(id, name, price, seller, buyer, status);

			n = dao.updateItem(itm);

			if (n == 1) {
				response.sendRedirect("Success.jsp?action=Update");
			} else {
				response.sendRedirect("Failure.jsp?action=Update");
			}

		}

	}

}
