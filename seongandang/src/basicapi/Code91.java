package basicapi;

// toString()

class Thing3 {
	private String name;
	private int price;
	
	Thing3(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void show() {
		System.out.println("name: " + name + ", price: " + price);
	}
}

class Thing4 {
	private String name;
	private int price;
	
	Thing4(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return "name: " + name + ", price: " + price;
	}
}

public class Code91 {
	public static void main(String[] args) {
		/* toString() */
		System.out.println("***** toString() *****");
		Thing3 t1 = new Thing3("book", 20000);
		String s1 = t1.toString();
		System.out.println(s1);
		System.out.println(t1);
		t1.show();
		/* ***** toString() *****
		 * basicapi.Thing3@506e1b77
		 * basicapi.Thing3@506e1b77
		 * name: book, price: 20000 */
		
		
		/* toString() overriding */
		System.out.println("***** toString() overriding *****");
		Thing4 t2 = new Thing4("book", 20000);
		String s2 = t2.toString();
		System.out.println(s2);
		System.out.println(t2);
		/* ***** toString() overriding *****
		 * name: book, price: 20000
		 * name: book, price: 20000 */
	}
}

