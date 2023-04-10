public class Student {
    private String name;
    private int id, i;
    private Book[] borrowedBooks = new Book[20];
    
    public Student(String name, int id)
    {
    	this.name = name;
    	this.id = id;
    	i = 0;
    }
    public void display() {
    	System.out.println("Student name: " + name);
    	System.out.println("Student ID: " + id);
    	System.out.println("List of borrowed books: ");
    	for(int j=0; j<i; j++)
    		System.out.println(borrowedBooks[j].getTitle());
    }
    public void borrowBook(Book book) {
    	if(i<20) {
    	book.borrow();
    	borrowedBooks[i] = book;
    	i++;}
    	else
    		System.out.println("The book is not available.");
    }
    public void returnBook(Book book) {
    	int flag= 0;
    	for(int j=0; j<i; j++) {
    		if(borrowedBooks[j]==book) {
    			book.returnBook();
    			borrowedBooks[j]=null;
    			for(int k=j; k<i; k++) {
    				borrowedBooks[k]= borrowedBooks[k+1];
    			}
    			i--;
    			flag = 1;
    			System.out.println("The book " + book.getTitle() + " was returned.");
    			break;
    		}
    	}
    	if(flag==0) {
    		System.out.println("The book was not borrowed.");
    	}
    }
    
}
