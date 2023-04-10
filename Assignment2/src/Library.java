public class Library {
    private Book[] books;
    private Student[] students;
    private int numBook;
    private int numStudent;
    
    public Library() {
    	books = new Book[20];
    	students = new Student[20];
    	numBook= 0;
    	numStudent = 0;
    }
    public void addBook(Book book) {
    	books[numBook] = book;
    	numBook++;
    }
    public void addStudent(Student student) {
    	students[numStudent] = student;
    	numStudent++;
    }
    public void displayBooks() {
    	System.out.println("Info about Books: ");
    	for(int i=0; i<numBook; i++) {
    		books[i].display();
    		System.out.println();
    	}
    }
    public Book findBook(String title) {
    	for(int j=0; j<numBook; j++) {
    		if(books[j].getTitle()== title) {
    			System.out.println("book found.");
    			return books[j];
    		}
    	}
    	System.out.println("book not found.");
		return null;
    }
     public void borrowBook(String title, Student student) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println("Book unavailable.");
            return;
        }
        book.borrow();
        student.borrowBook(book);
    }

    public void returnBook(String title, Student student) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println("Book was not borrowed.");
            return;
        }
        student.returnBook(book);
        book.returnBook();
    }
    	