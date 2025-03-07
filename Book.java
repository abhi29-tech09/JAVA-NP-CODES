public class Book {
	public String title;
	public String author;
	public int year;

	Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
}

public void displayDetails() {
	System.out.println("Title: " +title);
	System.out.println("Author: " +author);
	System.out.println("Year of Publication" +year);
}

public static void main(String[] args) {
	Book b1 = new Book("Math", "Ramanujan", 1950);
	Book b2 = new Book("Physics", "CV Raman", 1960);

	b1.displayDetails();
	b2.displayDetails();
}
}
