package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.service.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
