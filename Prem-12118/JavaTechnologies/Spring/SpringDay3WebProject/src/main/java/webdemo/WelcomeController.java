package webdemo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("Welcome")
	//@RequestMapping(method="Post")
	@PostMapping
	public String display() {
		return "Welcome";
	}
}
