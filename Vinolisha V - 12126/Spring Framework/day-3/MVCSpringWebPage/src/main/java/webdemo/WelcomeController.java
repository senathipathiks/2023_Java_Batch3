package webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //it handles all the http request
public class WelcomeController {
	
//	@RequestMapping("Welcome") //http request comes from the jsp file
//	public String display() {
//		return "Welcome";
//	}
	
	
	//for post method
	@PostMapping("Welcome") //http request comes from the jsp file
	public String display() {
		return "Welcome";
	}
	

}
