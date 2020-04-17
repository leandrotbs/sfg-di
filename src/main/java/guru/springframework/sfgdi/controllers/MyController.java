package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	// @Autowired is not mandatory for constructor injected beans 
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
