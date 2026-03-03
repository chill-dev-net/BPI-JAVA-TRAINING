package M8_Exercise6;

import org.springframework.stereotype.Component;

@Component
public class SingletonService {

	public SingletonService() {
		System.out.println("Singleton Service Created!");
	}

}
