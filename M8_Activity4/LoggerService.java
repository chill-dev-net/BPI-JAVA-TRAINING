package M8_Activity4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerService {

	@Autowired
	private final BookService bookService;
	
	public LoggerService(BookService bookService) {
		this.bookService = bookService;
	}
	
	public void displayService() {
		bookService.log("Implements Field Injection");
	}

}
