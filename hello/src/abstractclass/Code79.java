package abstractclass;
// abstract: Parent
// child: Child

public class Code79 {
	public static void main(String[] args) {
		Child x = new Child(10, 20);
		x.show();  // super
		x.print(); // only child
		x.call();  // abstract method
		/* parent show: 10
		 * child show: 20 
		 * child print
		 * child call <- abstract method */
		
		// Parent y = new Parent(); error! cannot instantiate the type Parent
	}
}
