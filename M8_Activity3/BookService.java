package M8_Activity3;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	public void log(String msg) {
		System.out.println("Message: " + msg);
	}

}
