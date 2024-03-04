package webdemoday4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //it handles all the http request
public class StudentController {
	
	@RequestMapping("addStudent")
	public ModelAndView addStudent(@ModelAttribute("student")Student student) {
		
		
		ModelAndView mv = new ModelAndView("Welcome");
		
		mv.addObject("result",student);
		
		
		
		return mv;
		
		
	}
	
}
