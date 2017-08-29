package net.guani.playground.springboot.hello_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//Adding Changes
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
