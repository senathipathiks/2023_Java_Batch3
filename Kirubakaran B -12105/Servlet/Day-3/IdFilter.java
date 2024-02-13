package com.servlet.day3;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet Filter implementation class IdFilter
 */

public class IdFilter  implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
   
		PrintWriter out=response.getWriter();
		int aid=Integer.parseInt(request.getParameter("aid"));
	    String aname=request.getParameter("aname");
		if(aid>1)
		chain.doFilter(request, response);
		 if(aname.length()>3) {
		chain.doFilter(request, response);
		}
		else
		{
			out.print("Invalid page");
		}
	}
	
	 

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(jakarta.servlet.FilterChain fConfig) throws jakarta.servlet.ServletException {
		// TODO Auto-generated method stub
	}

}
