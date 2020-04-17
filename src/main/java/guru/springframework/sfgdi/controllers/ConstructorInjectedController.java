package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;
	
	// @Autowired is not mandatory for constructor injected beans 
	// @Qualifier is used to indicate which bean should be injected
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
