package M8_Exer8_9;

public class BookDTO {
	String title;
	String author;

	public BookDTO() {

	}

	public BookDTO(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
