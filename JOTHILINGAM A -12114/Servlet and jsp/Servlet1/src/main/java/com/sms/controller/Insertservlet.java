package com.sms.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.dao.Studentdao;


public class Insertservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int n=0;
        Studentdao dao=new Studentdao();
        PrintWriter out=response.getWriter();
        String action=request.getParameter("button");
        if(action.equals("Insert")) {
            RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");
            
            int id=Integer.parseInt(request.getParameter("sid"));
            String name=request.getParameter("sname");
            String city=request.getParameter("scity");
            Student stu=new Student(id,name,city);
            n=dao.insertStudent(stu);
            if(n==1) {
                rd.include(request, response);
                out.write("<h3> <font color=green> Record insertion succesfullly</font></h3>");
            }
            else {
                rd.include(request, response);
                out.write("<h1> <font color=red> Record insertion failure</font></h1>");
            }
        }
        if(action.equals("Delete")) {
            RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
            
            int id=Integer.parseInt(request.getParameter("sid"));
            
            n=dao.deleteStudent(id);
            if(n==1) {
                rd.include(request, response);
                out.write("<h3> <font color=green> Record deletion succesfullly</font></h3>");
            }
            else {
                rd.include(request, response);
                out.write("<h1> <font color=red> Record deletion failure</font></h1>");
            }
        }
        if(action.equals("Update")) {
            RequestDispatcher rd=request.getRequestDispatcher("Update.jsp");
            
            int id=Integer.parseInt(request.getParameter("sid"));
            String name=request.getParameter("sname");
            String city=request.getParameter("scity");
            Student stu=new Student(id,name,city);
            n=dao.updateStudent(stu);
            if(n==1) {
                rd.include(request, response);
                out.write("<h3> <font color=green> Record updation succesfullly</font></h3>");
            }
            else {
                rd.include(request, response);
                out.write("\"<h1> <font color=red> Record updation failure</font></h1>");
            }
        }
        else if(action.equals("Find")) {
            RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
            int id=Integer.parseInt(request.getParameter("sid"));
            Student stu=dao.findStudent(id);
            if(stu.getId()!=0) {
                rd.include(request, response);
                out.write("<br><br><br>");
                out.write("<font size= 5px color=green><table align =center border=1>"
                        +"<tr>"
                        +"<th>Stud id</th>"
                        +"<th>Stud name</th>"
                        +"<th>Stud city</th>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>"+stu.getId()+"</td>"
                        +"<td>"+stu.getName()+"</td>"
                        +"<td>"+stu.getCity()+"</td>"
                        +"</tr>"
                        +"</font>");
            }
            else {
                rd.include(request, response);
                out.write("<h3> <font color=red> Record not  found</font></h3>");
            }
            
        }
          else if(action.equals("FindAll")) {
                RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
                LinkedList<Student> stu=new LinkedList<Student>();
                stu=dao.findAllStudent();
                
                if(stu.size()>0) {
                    rd.include(request, response);
                    out.write("<br><br><br>");
                    out.write("<font size=5px color=black><table align=center border=6>"
                            +"<tr>"
                            +"<th> Stud Id </th>"
                            +"<th> Stud Name </th>"
                            +"<th>Stud city</th>"
                            +"</tr>"
                            );
                    for(Student s:stu) {
                        out.write("<tr>"
                        
                        +"<td>"+s.getId()+"</td>"
                        +"<td>"+s.getName()+"</td>"
                        +"<td>"+s.getCity()+"</td>"
                        +"</tr>");
                    }
                    out.write("</table>"+"</font>");
                }
        
        
        
        

    }
    }
}
