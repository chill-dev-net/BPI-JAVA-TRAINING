package M8_Exer8_8;

public class Book {
	private String ID;
	private String title;
	private String author;
	
	public Book() {
		
	}

	public Book(String ID, String title, String author) {
		this.ID = ID;
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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}
