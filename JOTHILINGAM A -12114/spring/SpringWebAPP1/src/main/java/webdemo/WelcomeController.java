package webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WelcomeController {
	
	@PostMapping("Welcome")
	public String display() {
		return "Welcome";
		
	}

}
