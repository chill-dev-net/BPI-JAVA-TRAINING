package M8_Activity5;

import org.springframework.stereotype.Component;

@Component
public class SingletonService {

	public SingletonService() {
		System.out.println("Singleton Service Created!");
	}

}
