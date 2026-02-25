package M8_Activity5;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeService {

	public PrototypeService() {
		System.out.println("Prototype Service Created!");
	}

}
