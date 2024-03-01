package webappdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
//@RequestMapping("Welcome")
	@PostMapping("Welcome")
public String Display() {
	return "Welcome";
}
}
