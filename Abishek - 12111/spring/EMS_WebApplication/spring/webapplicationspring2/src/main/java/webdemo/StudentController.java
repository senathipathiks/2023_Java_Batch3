package webdemo;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@PostMapping(value = "addStudent")
	public ModelAndView addStudent(@ModelAttribute("student")Student student)
	{
		ModelAndView mv = new ModelAndView("Welcome");
		mv.addObject("name", student.getName());
		mv.addObject("age",student.getAge());
		mv.addObject("gender",student.getGender());
		return mv;
	}
	
}
