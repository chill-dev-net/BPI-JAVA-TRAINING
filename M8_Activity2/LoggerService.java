package M8_Activity2;

import org.springframework.stereotype.Component;

@Component
public class LoggerService {

	private final BookService bookService;
	
	public LoggerService(BookService bookService) {
		this.bookService = bookService;
	}
	
	public void displayService() {
		bookService.log("Displaying log in Book Service Class...");
	}

}
