package M8_Exer8_10;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<BookDTO> getAll() {
        return repo.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public List<BookDTO> searchByName(String name) {
        return repo.findByTitleContainingIgnoreCase(name).stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Optional<BookDTO> getById(Long id) {
        return repo.findById(id).map(this::toDto);
    }

    public BookDTO create(BookDTO dto) {
        Book entity = new Book(dto.getTitle(), dto.getAuthor());
        Book saved = repo.save(entity);
        return toDto(saved);
    }

    private BookDTO toDto(Book b) {
        BookDTO dto = new BookDTO();
//        dto.setId(b.getId());
        dto.setTitle(b.getTitle());
        dto.setAuthor(b.getAuthor());
        return dto;
    }
}