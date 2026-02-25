package M8_Exer8_3;

import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

	public BookController() {
	}

	@GetMapping
	public List<Book> getBooks() {
		return List.of(new Book("1", "Title 1", "Author 1"), new Book("2", "Title 2", "Author 2"),
				new Book("3", "Title 3", "Author 3"));
	}

	@GetMapping("/{id}")
	public Book getOne(@PathVariable String id) {

		return getBooks().stream().filter(x -> x.getID().equals(id)).findFirst().orElse(null);

	}

}
