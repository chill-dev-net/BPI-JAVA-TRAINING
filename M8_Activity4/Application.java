package M8_Activity4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		BookService book = new BookService();
		LoggerService logService = new LoggerService(book);
		SpringApplication.run(Application.class, args);
		
		logService.displayService();
	}

}
