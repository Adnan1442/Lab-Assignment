
package try2;
import java.util.ArrayList;

public class Student2 {
	String name;
	int ID;
	ArrayList<Book2>borrowedBooks = new ArrayList<Book2>();
	
	Student2(String name, int ID){
		this.name = name;
		this.ID = ID;
	}
	void display(){
		System.out.println(this.name);
		System.out.println(this.ID);
		for(Book2 x: borrowedBooks) {
			System.out.println(x.title);
		}
	}
	void borrowBook(Book2 book) {
		borrowedBooks.add(book);
	}
	void returnBook(Book2 book) {
		borrowedBooks.remove(book);
	}
	
}
