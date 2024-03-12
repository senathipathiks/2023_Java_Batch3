package WebDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	//@RequestMapping("Welcome")
	@RequestMapping(method = RequestMethod.POST)

	public String display() {
		return "Welcome";
	}
}
