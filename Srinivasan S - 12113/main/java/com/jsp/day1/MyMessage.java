package com.jsp.day1;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyMessage extends TagSupport {
	
	public int doStartTag() throws JspException{
		JspWriter out=pageContext.getOut();//returns the object or instance of Jsp Writer
		super.doStartTag();
		try {
			out.println("Welcome User");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;//This element has no attached source and the Javadoc could not be found in the attached Javadoc.
		//will not evaluate the body content of the tag	
	}
}
