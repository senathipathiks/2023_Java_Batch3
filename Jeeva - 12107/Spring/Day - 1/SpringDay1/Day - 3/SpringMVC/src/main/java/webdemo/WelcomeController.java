package webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// controller handle all the user http requests
@Controller
public class WelcomeController {

	
	// the view page(welcome) mapped with the display method using request mapping
	@RequestMapping("Welcome")
	public String display() {
		
		return "Welcome";
		// return back to welcome page
	}
}
