package com.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sb.bean.MyBean;

@Controller
public class MyController {
	
	@RequestMapping("start")
	public ModelAndView loadStart() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}
	
	@RequestMapping("hello")
	public ModelAndView loadHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}

	@RequestMapping("logIn")
	public ModelAndView loadLogIn() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("logIn");
		return mv;
	}
	
	@RequestMapping("form")
	public ModelAndView doLogIn(MyBean bean) {
		
		bean.getUid();
		bean.getUname();
		String id = "7" ;
		String name = "Hema";
		
		if(bean.getUid().equals(id)  && bean.getUname().equals(name))
			return new ModelAndView("logIn").addObject("msg", "success");
		
		return new ModelAndView("logIn").addObject("msg", "Failure");
		
	}

	private Object ModelAndView(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
