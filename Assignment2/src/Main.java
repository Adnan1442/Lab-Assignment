public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Harry potter", "JK Rowlings", "2355", 15);
		Book b2 = new Book("Sherlock Holmes", "Arthur Conan", "2345", 20);
		Book b3 = new Book("Great Gatsby", "F. Scott", "4355", 55);
		Student s1 = new Student("Sami", 1345);
		Student s2 = new Student("Adnan", 4698);
		Student s3 = new Student("Tashrif", 2698);
		s1.borrowBook(b2);
		s3.borrowBook(b1);
		s1.display();
		s3.display();
		s2.returnBook(b3);
		s1.returnBook(b2);
		System.out.println(b1.getNumCopies());
		
	}

}
