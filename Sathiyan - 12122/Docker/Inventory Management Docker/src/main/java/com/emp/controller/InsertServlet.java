package com.emp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.emp.bean.Inventory;
import com.emp.dao.InventoryDAO;


public class InsertServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=0;
		InventoryDAO dao=new InventoryDAO();
		PrintWriter out=response.getWriter();
		String action=request.getParameter("button");
		
		if (action.equals("Insert")) {
			RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");
			
			int item_id=Integer.parseInt(request.getParameter("id"));
			String item_name=request.getParameter("name");
			String quantity=request.getParameter("stock");
			String manufacturer=request.getParameter("manufacturer");
			String mfg=request.getParameter("mfg");
			float price=Float.parseFloat(request.getParameter("price"));
			Inventory stud=new Inventory(item_id,item_name,quantity,manufacturer,mfg,price);
			n=dao.insertStudent(stud);
			
			if (n==1) {
				rd.include(request, response);
				out.write("<h1> <font color=green> Record Inserted Successfully </font> </h1>");
			} else {
				rd.include(request, response);
				out.write("<h1> <font color=red> Record Insertion Failed </font> </h1>");
			}
			
		}
		
		else if(action.equals("Find"))
		{
	    
		int id=Integer.parseInt(request.getParameter("id"));
		Inventory inv=dao.findInventory(id);
		
		if(inv!=null) {
			
			RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			request.setAttribute("bean", inv);
			rd.include(request, response);
			
			rd.include(request, response);
			out.write("<br><br><br>");
			out.write("<font size=5px color=green><table align=center border=1>"
					+"<tr>"
					+"<th>Product ID</th>"
					+"<th>Product Name</th>"
					+"<th>Quantity In Stock</th>"
					+"<th>Manufacturer</th>"
					+"<th>MFG date</th>"
					+"<th>Price</th>"
					+"</tr>"
					+"<tr>"
					+"<td>"+inv.getItemId()+"</td>"
					+"<td>"+inv.getItemName()+"</td>"
					+"<td>"+inv.getQuantityStock()+"</td>"
					+"<td>"+inv.getManufacturer()+"</td>"
					+"<td>"+inv.getMfgDate()+"</td>"
					+"<td>"+inv.getPrice()+"</td>"
					);
			
			}
		else {
			
			out.print("<h1> <font color=red> Record not found</font></h1>");
		}
		
		
	}
		
		
		else if(action.equals("Find All"))
		{
	    RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
	    
	    LinkedList<Inventory> inv=new LinkedList<Inventory>();
	    
		inv=dao.findAllInventory();
		System.out.println(inv.size());		
		
		if(inv.size()>0) {
			
			rd.include(request, response);
			out.write("<br><br><br>");
			out.write("<font size=5px color=green><table align=center border=1>"
					+"<tr>"
					+"<th> Stud ID</th>"
					+"<th> Stud Name</th>"
					+"<th> Stud City</th>"
					+"</tr>");
			
			for (Inventory i : inv) {
				out.print("<tr>"
						+"<td>"+i.getItemId()+"</td>"
						+"<td>"+i.getItemName()+"</td>"
						+"<td>"+i.getQuantityStock()+"</td>"
						+"<td>"+i.getManufacturer()+"</td>"
						+"<td>"+i.getMfgDate()+"</td>"
						+"<td>"+i.getPrice()+"</td>"
						);
			}
			out.write("</table></font>");
			
			
			}
		else {
			rd.include(request,response);
			out.print("<h1> <font color=red> Record not found</font></h1>");
		}
		}
		
		else if (action.equals("Delete")) {
			RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
			int id=Integer.parseInt(request.getParameter("id"));
			n=dao.deleteInventory(id);
			if(n==1) {
                response.sendRedirect("success.jsp?action=Delete");
            }
            else
            {
            	response.sendRedirect("failure.jsp?action=Delete");
            }
		}
		
		
		else if(action.equals("Update")){
	      	  int n1=0;
	            InventoryDAO dao1=new InventoryDAO();
	            PrintWriter out1=response.getWriter();
	            String action1=request.getParameter("button");
	            
	            if(action1.equals("Update"))
	            {
	                RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
	                
	                int item_id=Integer.parseInt(request.getParameter("id"));
	                String item_name=request.getParameter("name");
	    			String quantity=request.getParameter("stock");
	    			String manufacturer=request.getParameter("manufacturer");
	    			String mfg=request.getParameter("mfg");
	    			float price=Float.parseFloat(request.getParameter("price"));
	    			Inventory inv1=new Inventory(item_id,item_name,quantity,manufacturer,mfg,price);
	                n1=dao1.updateInventory(inv1);
	               
	                if(n1==1) {
	                    response.sendRedirect("success.jsp?action=Update");
	                }
	                else
	                {
	                	response.sendRedirect("failure.jsp?action=Update");
	                }
	            }
		
		
			}
		
		
	}

}
