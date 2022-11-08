package classobject;

class Book {
	String title;
	double price;
	int sell;
	static int count;
	
	Book() {}
	Book(String title) {
		this.title = title;
		count++;
	}
	Book(String title, double price) {
		this(title); // this.title = title;
		this.price = price;
	}
	Book(String title, double price, int sell) {
		this(title, price);
		this.sell = sell;
	}
	
	void printCount() {
		System.out.println("count of books: " + count);
	}
	
	void printBook() {
		System.out.println("title: " + title + ", price: " + price + ", sell: " + sell);
		this.printCount(); // call other method in same class
		
	}
}

public class Code55 {
	public static void main(String[] args) {
		Book b1 = new Book("Java", 25.5, 3);
		b1.printBook();
		
		Book b2 = new Book("R", 21.2);
		b2.printBook();
		
		Book b3 = new Book("Python");
		b3.printBook();
	}
}
