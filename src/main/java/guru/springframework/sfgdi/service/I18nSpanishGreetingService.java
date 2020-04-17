package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES") 	// @Profile indicates which profile this bean belongs to. It will be injected
				// only if the profile specified has been set as active. By using @Profiler you
				// can have multiple beans with the same name, but only one active in runtime
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hola Mundo!!!";
	}

}
