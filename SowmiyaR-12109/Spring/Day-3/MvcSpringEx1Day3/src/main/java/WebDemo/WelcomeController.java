package WebDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WelcomeController {

	@PostMapping("Welcome")
	public String display() {
		return "Welcome";
	}
}
