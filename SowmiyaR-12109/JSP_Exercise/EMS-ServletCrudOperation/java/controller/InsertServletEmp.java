package com.Ems.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.Ems.bean.Employee;
import com.Ems.dao.EmployeeDAO;






/**
 * Servlet implementation class InsertServletEmp
 */
public class InsertServletEmp extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int n=0;
          EmployeeDAO dao=new EmployeeDAO();
        PrintWriter out=response.getWriter();
        String action=request.getParameter("button");
        
        if(action.equals("INSERT"))
        {
            
            int id=Integer.parseInt(request.getParameter("id"));
            String name=request.getParameter("name");
            String city=request.getParameter("city");
            int deptid=Integer.parseInt(request.getParameter("deptid"));
            String deptname=request.getParameter("deptname");
            String phno=request.getParameter("phno");
            Employee Emp=new Employee(id,name,city, deptid, deptname, phno);
            n=dao.insertEmployee(Emp);
            if(n==1) {
                response.sendRedirect("insertSuccess.jsp"); 
            }
            else
            {
                response.sendRedirect("insertfailure.jsp"); 
            }
        }
//        ---------------------------------------------------------
        else if(action.equals("UPDATE")){
      	  int n1=0;
            EmployeeDAO dao1=new EmployeeDAO();
            PrintWriter out1=response.getWriter();
            String action1=request.getParameter("button");
            
            if(action1.equals("UPDATE"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
                
                int id=Integer.parseInt(request.getParameter("id"));
//                Student stud=dao.UpdateStudent(id);
                String name=request.getParameter("name");
                String city=request.getParameter("city");
                int deptid=Integer.parseInt(request.getParameter("deptid"));
               String deptname=request.getParameter("deptname");
               String phno=request.getParameter("phno");
                Employee Emp1=new Employee(id,name,city, deptid, deptname, phno);
                n1=dao1.UpdateEmployee(Emp1);
                if(n1==1) {
                    rd.include(request, response);
                    out.write("<h1> <font color=green><center> Record Update Successfully</center> </font></h1>");
                }
                else
                {
                    rd.include(request, response);
                    out.write("<h1> <font color=red> Record updation Failure </font></h1>");
                }
            }
        }
//        ---------------------------------------------------------
        else if(action.equals("DELETE")) {
       	 RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
           int id=Integer.parseInt(request.getParameter("id"));
           n=dao.deleteEmployee(id);
			if(n==1) {
				response.sendRedirect("DeleteSuccess.jsp");
//				rd.include(request, response);
//					out.write("<h1> <font color=green><center> Record deleted Successfully</center> </font></h1>");
			}
				else
					response.sendRedirect("DeleteFail.jsp");
//					out.write("<h1> <font color=red><center> Record deleted Failure</center> </font></h1>");
//				 
			}
//        --------------------------------------------------------------
        else if(action.equals("FIND"))
        {
        	
        	int id=Integer.parseInt(request.getParameter("id"));
        	
			Employee Emp=dao.FindEmployee(id);
        	if(Emp!=null) {
        		RequestDispatcher rd=request.getRequestDispatcher("FindSuccess.jsp");
        		request.setAttribute("bean", Emp);
        		rd.include(request, response);
        	}
        	else {
//        		rd.include(request, response);
//        		out.write("<h1><font color=red>Record Not Found</font></h1>");
        		response.sendRedirect("FindFail.jsp");
        	}
        }
//        -------------------------------------------------------
        else if(action.equals("FINDALL"))
        {
        	
        	LinkedList<Employee> Emp=new LinkedList<Employee>();
        	Emp=dao.FindallEmployee();
        	
        	if(Emp.size()>0)
        	{
        	RequestDispatcher rd1=request.getRequestDispatcher("FindAllSuccess.jsp");
        	request.setAttribute("bean",Emp);
        	rd1.include(request, response);
        }
        	else {
        		response.sendRedirect("FindAllFail.jsp");
        	}
        
        
        
        }
        
	}
}




