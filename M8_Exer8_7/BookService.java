package M8_Exer8_7;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	public void log(String msg) {
		System.out.println("Message: " + msg);
	}

}
