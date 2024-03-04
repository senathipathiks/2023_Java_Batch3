package webDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping(value = "addEmployee", method =RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employee")Employee employee) {
		ModelAndView mv= new ModelAndView("Welcome");
		mv.addObject("id",employee.getId());
		mv.addObject("name",employee.getName());
		mv.addObject("age",employee.getAge());
		return mv;
		}
}
