package M8_Exer8_9;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/books")
public class BookController {

	public BookController() {
	}

	private final List<Book> books = new CopyOnWriteArrayList<>(
			List.of(new Book("1", "Clean Code", "Robert C. Martin"), new Book("2", "Effective Java", "Joshua Bloch"),
					new Book("3", "Design Patterns: Elements of Reusable Object-Oriented Software",
							"Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides")));

	// Start the counter at the current max numeric id
	private final AtomicLong idCounter = new AtomicLong(
			books.stream().map(Book::getID).filter(this::isNumeric).mapToLong(Long::parseLong).max().orElse(0L));

//	NO DTO
//	@GetMapping
//	public List<Book> getBooks() {
//		return books;
//	}
//
//	@GetMapping("/{id}")
//	public Book getOne(@PathVariable String id) {
//		return books.stream().filter(x -> x.getID().equals(id)).findFirst()
//				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found"));
//	}

	@GetMapping
	public List<BookDTO> getBooks() {
		return BookMapper.toDTOs(books);
	}

	@GetMapping("/{id}")
	public BookDTO getOne(@PathVariable String id) {
		Book book = books.stream().filter(x -> x.getID().equals(id)).findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found"));

		return BookMapper.toDTO(book);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Book create(@RequestBody Book incoming) {
		if (incoming == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request body is required");
		}
		if (isBlank(incoming.getTitle()) || isBlank(incoming.getAuthor())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Title and Author are required");
		}

		String nextId = String.valueOf(idCounter.incrementAndGet());
		Book toSave = new Book(nextId, incoming.getTitle(), incoming.getAuthor());
		books.add(toSave);
		return toSave;
	}

	record DeleteResponse(String id, String message) {
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<DeleteResponse> delete(@PathVariable String id) {
		boolean removed = books.removeIf(b -> b.getID().equals(id));
		if (!removed) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found");
		}
		return ResponseEntity.ok(new DeleteResponse(id, "Book deleted successfully."));
	}

	private static boolean isBlank(String s) {
		return s == null || s.trim().isEmpty();
	}

	private boolean isNumeric(String s) {
		if (s == null || s.isEmpty())
			return false;
		for (char c : s.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

}
