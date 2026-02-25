package M8_Exer8_4;

public class Book {
	private int ID;
	private String title;
	private String author;

	public Book() {

	}

	public Book(int ID, String title, String author) {
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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
