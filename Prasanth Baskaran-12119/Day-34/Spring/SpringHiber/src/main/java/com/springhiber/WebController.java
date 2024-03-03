package com.springhiber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
	@RequestMapping("register")
	public ModelAndView display(@ModelAttribute("login") LoginPage log,ModelMap m) {
		
		String name = log.getName();
		String email = log.getEmail();
		String password = log.getPassword();
		
		//System.out.println(log);
		
		String r = new MainHiber().repo(log);
		
		if(r.equals("Yes")) {
		     System.out.println("Backend Value Added");
		}
		
		
		
		ModelAndView mv = new ModelAndView("Success");
		
		m.addAttribute("log",log);
		
		
		
		return mv;
		}

}
