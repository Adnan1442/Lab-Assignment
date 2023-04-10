package try2;

import java.util.ArrayList;

public class Library2 {
	ArrayList<Book2> books = new ArrayList<Book2>();
	ArrayList<Student2> students = new ArrayList<Student2>();

	public Library2(ArrayList<Book2> b, ArrayList<Student2> s) {
		books = b;
		students = s;
	}

	public void addBook(Book2 book) {
		books.add(book);
	}

	public void addStudent(Student2 student) {
		students.add(student);
	}
	
	public void displayBooks() {
		for(Book2 b: books) {
			b.display();
		}
	}

	public Book2 findBook(String title) {
		// Book2 b= new Book2();
		// return b;
		for (Book2 b : books) {
			if (b.title == title) {
				return b;
			}

		}
		return null;
	}
	
	public void borrowBook(String title, Student2 student) {
		Book2 book =findBook(title);
		if(book == null) {
			System.out.println("No book here with this name :3");
			return;
		}
		book.borrow();
		student.borrowBook(book);
	}
	
	public void returnBook(String title, Student2 student) {
		Book2 book = findBook(title);
		if(book == null) {
			System.out.println("no book here with this title:3");
			return;
		}
		book.returnBook();
	}
	

	
}
