package basicapi;

// equals()

class Thing extends Object {
	private String name;
	private int count;
	
	Thing() {}
	Thing(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	void print() {
		System.out.println("name: " + name + ", count: " + count);
	}
}

class Thing2 extends Object {
	private String name;
	private int count;
	
	Thing2() {}
	Thing2(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	void print() {
		System.out.println("name: " + name + ", count: " + count);
	}
	
	public boolean equals(Object obj) {
		if (this.name.equals(((Thing2)obj).name) && this.count==((Thing2)obj).count)
			return true;
		else
			return false;
	}
}


public class Code90 {
	public static void main(String[] args) {
		Thing th1 = new Thing("desk", 5);
		Thing th2 = new Thing("desk", 5);
		Thing2 th3 = new Thing2("desk", 5);
		Thing2 th4 = new Thing2("desk", 5);
		
		
		/* "==" operator */
		System.out.println("***** == operator *****");
		if (th1 == th2)
			System.out.println("Same");
		else
			System.out.println("Different");
		
		System.out.println(th1);
		System.out.println(th2);
		/* ***** == operator *****
		 * Different
		 * basicapi.Thing@506e1b77
		 * basicapi.Thing@4fca772d */
		
		
		/* equals() method X overriding */
		System.out.println("***** equals() method *****");
		if (th1.equals(th2))
			System.out.println("Same");
		else
			System.out.println("Different");
		
		System.out.println(th1);
		System.out.println(th2);
		/* ***** equals() method *****
		 * Different
		 * basicapi.Thing@506e1b77
		 * basicapi.Thing@4fca772d */
		
		
		/* equals method overriding */
		System.out.println("***** equals() method overriding *****");
		if (th3.equals(th4))
			System.out.println("Same");
		else
			System.out.println("Different");
		
		th3.print();
		th4.print();
		/* ***** equals() method overriding *****
		 * Same
		 * name: desk, count: 5
		 * name: desk, count: 5 */
	}
}
