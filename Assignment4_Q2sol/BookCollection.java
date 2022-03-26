package pgm1;
import java.util.*;
public class BookCollection {
	private String ownerName;
	private List<Book> books;
	public BookCollection(String ownerName) {
		this.ownerName = ownerName;
		this.books=new ArrayList<Book>();
		init();
	}
	private void init() {
		books.add(new Book(10, "The Secret", "Ronda Byrne"));
		books.add(new Book(213, "Let US C", "YK"));
		books.add(new Book(18, "Javs the complete refrence", "xyz"));
	}
	
	public boolean hasBook(Book b) {
		return true;
	}
}