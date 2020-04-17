package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.service.ConstructorGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new SetterInjectedController();
		
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
