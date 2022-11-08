package classobject;

class Book2 {
	private String title;
	private int price;
	
	Book2() {}
	Book2(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	// accessor
	String getTitle() {
		return title;
	}
	int getPrice() {
		return price;
	}
	
	// mutator
	void setTitle(String title) {
		this.title = title;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	void printBook() {
		System.out.println("title: " + title + ", price: " + price);
	}
}

public class Code58 {
	public static void main(String[] args) {
		Book2 bk = new Book2("Java Program", 25000);
		bk.printBook();
		// bk.price = 27000; error! The field Book2.price is not visible.
		
		bk.setPrice(27000);
		bk.setTitle("Java Program 2");
		System.out.println("title: " + bk.getTitle() + ", price: " + bk.getPrice());
	}
}
