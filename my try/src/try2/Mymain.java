package try2;
import java.util.ArrayList;
import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Book2 b1 = new Book2("The Object-Oriented Thought Process","Matt Weisfeld,","08385347",5);
		Book2 b2 = new Book2("Java: The Complete Reference,", "Herbert Schildt,", "3825754",3);
		Book2 b3 = new Book2("Java: How to Program,","Paul Deitel,","984759",2);
		
		Student2 s1 = new Student2("Adnan ",1442);
		Student2 s2 = new Student2("Wahid",072);
		
		ArrayList<Book2> b= new ArrayList<Book2>();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		ArrayList<Student2> s= new ArrayList<Student2>();
		s.add(s1);
		s.add(s2);
		
		Library2 l = new Library2(b,s);
		l.displayBooks();
		
//		System.out.println("Do you want to search any book?(y/n)");
//		System.out.println("Search by its title..");
//	    String title= sc.nextLine();
//	    Book2 f= l.findBook(title);
//	    
//	    if(f != null) {
//	    	f.display();
//	    }
//	    else {
//	    	System.out.println("No book here with this title:3");
//	    }
		
		
		
		
//		char choice = sc.next().charAt(0);
//		if(choice == 'y') {
//			System.out.println("Search by its title..");
//			String garbage= sc.next();
//		    String title= sc.nextLine();
//		    Book2 f= l.findBook(title);
//		    
//		    if(f != null) {
//		    	f.display();
//		    }
//		    else {
//		    	System.out.println("No book here with this title:3");
//		    }
//		}
		Book2 f= l.findBook("Java: How to Program,");
		f.display();
		
		f.borrow();
		f.display();
		f.returnBook();
		f.display();
		System.out.println(f.getTitle());
		l.returnBook("The Alchemist",s1);
		f.display();
		l.borrowBook("The Alchemist", s1);
		f.display();
		s1.display();
		s1.borrowBook(b2);
		s1.borrowBook(b3);
		s1.display();
		s1.returnBook(b2);
		s1.display();
		
		
		
	}

}
