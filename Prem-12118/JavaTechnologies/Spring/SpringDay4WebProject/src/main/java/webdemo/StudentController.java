package webdemo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value="addStudent", method=RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student")Student student) {
		
		ModelAndView mv =new ModelAndView("Welcome");
		mv.addObject("name",student.getName());
		mv.addObject("age",student.getAge());
		mv.addObject("city",student.getCity());
		 
		//System.out.println("Name: "+student.getName());
		
		return mv;
		

	}
}
