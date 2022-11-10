package interfaceprev;

// implements vs. extends

public class Code84 {
	public static void main(String[] args) {
		/* implements
		 * interface: Data
		 * class: ChildData 
		 * Data <- ChildData */
		Data x = new ChildData();
		x.print();
		System.out.println("count: " + Data.count);
		
		
		/* extends & implements
		 * interface: Things, Book
		 * class: ChildrenBook 
		 * Things <- Book <- ChildrenBook */
		ChildrenBook b = new ChildrenBook("Little Mermaid", "Andersen");
		b.printInfo();
		b.showTitle();
	}
}
