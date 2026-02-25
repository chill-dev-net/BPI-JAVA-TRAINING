package M8_Exer8_4;

import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

	public BookController() {
	}

	@GetMapping
	public List<Book> getBooks() {
		return List.of(new Book(1, "Title 1", "Author 1"), new Book(2, "Title 2", "Author 2"),
				new Book(3, "Title 3", "Author 3"));
	}

	@GetMapping("/search")
	public Book getOne(@RequestParam int id) {

		return getBooks().stream().filter(x -> x.getID() == id).findFirst().orElse(null);

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Book create(@RequestBody Book book) {
		return book;
	}

}
