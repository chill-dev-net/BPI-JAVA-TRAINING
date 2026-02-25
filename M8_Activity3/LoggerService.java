package M8_Activity3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerService {

	private final BookService bookService;
	
	@Autowired
	public LoggerService(BookService bookService) {
		this.bookService = bookService;
	}
	
	public void displayService() {
		bookService.log("Implements Setter Injection");
	}

}
