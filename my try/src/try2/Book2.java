package try2;

public class Book2 {
	
	String title;
	String author;
	String ISBN;
	int numCopies;
	
	Book2(String title, String author, String ISBN, int numCopies){
		this.title = title;
		this.author= author;
		this.ISBN = ISBN;
		this.numCopies = numCopies;
	}
	Book2(){}
	void display() {
		System.out.println("Title              "+ title);
		System.out.println("Author             "+ author);
		System.out.println("ISBN               "+ ISBN);
		System.out.println("Number of Copies   "+ numCopies);
	}
	void borrow() {
		this.numCopies--;
	}
	void returnBook() {
		this.numCopies++;
	}
	
	public String getTitle() {
        return title;
    }

}
