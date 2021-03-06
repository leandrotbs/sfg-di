package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SfgDiApplication.class, args);


		
		System.out.println();
		System.out.println("############ I18n");
		
		var i18nController = (I18nController)ctx.getBean("i18nController");
		
		System.out.println(i18nController.sayHello());
		
		
		System.out.println();
		System.out.println("############ Primary bean");
		
		var myController = (MyController) ctx.getBean("myController");
		
		System.out.println(myController.sayHello());
		
		
		
		System.out.println();
		System.out.println("############ Property");
		
		var propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		
		
		System.out.println();
		System.out.println("############ Setter");
		
		var setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
	
		
		System.out.println();
		System.out.println("############ Constructor");
		
		var constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreeting());
	}

}
