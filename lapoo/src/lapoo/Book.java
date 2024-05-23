package lapoo;

public class Book {
	String title;
	String author;
	int numberOfPages;
	String publisher = "OC";

	public Book(String title, String author, int numberOfPages, String publisher) {
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.publisher = publisher;
	}
}
