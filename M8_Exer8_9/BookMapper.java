package M8_Exer8_9;

import java.util.List;

public class BookMapper {
	public static BookDTO toDTO(Book b) {
		return new BookDTO(b.getTitle(), b.getAuthor());
	}

	public static List<BookDTO> toDTOs(List<Book> books) {
		return books.stream().map(BookMapper::toDTO).toList();
	}
}
