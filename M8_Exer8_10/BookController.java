package M8_Exer8_10;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/books")
public class BookController {

	private final BookService service;

	public BookController(BookService service) {
		this.service = service;
	}

	// List and search
	@GetMapping
	public ResponseEntity<List<BookDTO>> getAll(@RequestParam(required = false) String name) {
		List<BookDTO> books = (name != null && !name.isBlank()) ? service.searchByName(name) : service.getAll();
		return ResponseEntity.ok(books);
	}

	// Single by ID
	@GetMapping("/{id}")
	public ResponseEntity<BookDTO> getById(@PathVariable Long id) {
		return service.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<BookDTO> create(@Valid @RequestBody BookDTO book) {
		BookDTO created = service.create(book);
		return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}

}
