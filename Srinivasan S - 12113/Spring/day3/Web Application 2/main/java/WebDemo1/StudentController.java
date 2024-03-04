package WebDemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@RequestMapping(value = "addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student")Student student) {
		ModelAndView mv=new ModelAndView("Welcome");
		mv.addObject("id",student.getId());
		mv.addObject("name",student.getName());
		mv.addObject("age",student.getAge());
		
		return mv;
		
	}

}
