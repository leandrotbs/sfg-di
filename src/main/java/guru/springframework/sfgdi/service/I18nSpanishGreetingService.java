package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({ "ES", "default" }) 	/*  @Profile indicates which profile this bean belongs to. It will be injected
								 *  only if the profile specified has been set as active. By using @Profiler you
								 *  can have multiple beans with the same name, but only one active in runtime.
								 *  
								 *  A list of profile names can be provide by using curly braces {}
								 *  
								 *  In order to set a default profile, one of the profiles names has to be "default"
								 */ 
								
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hola Mundo!!!";
	}

}
