
public class Book {
    private String title, author, isbn;
    private int numCopies;
    
    public Book(String title, String author, String isbn, int numCopies) {
    	this.title = title;
    	this.author = author;
    	this.isbn = isbn;
    	this.numCopies = numCopies;
    }
    public void display() {
    	System.out.println("Title: " + title);
    	System.out.println("Author: " + author);
    	System.out.println("ISBN: " + isbn);
    	System.out.println("Number of copies: " + numCopies);
    }
    public void borrow() {
    	numCopies--;
    }
    public void returnBook() {
    	numCopies++;
    }
    public String getTitle() {
    	return title;
    }
}
