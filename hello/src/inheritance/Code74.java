package inheritance;

class Parent7 {
	void print() {
		System.out.println("Parent: print()");
	}
	void show() {
		System.out.println("Parent: show()");
	}
}

class ChildA extends Parent7 {
	void print() {
		System.out.println("Child-A: print()");
	}
	void showA() {
		System.out.println("Child-A: show()");
	}
}

class ChildB extends Parent7 {
	void print() {
		System.out.println("Child-B: print()");
	}
	void showB() {
		System.out.println("Child-B: show()");
	}
}


public class Code74 {
	static void doWork(Parent7 p) {
		// parameter -> Parent7
		// argument -> Parent7, ChildA, ChildB
		if (p instanceof ChildA) {
			ChildA ca = (ChildA) p;
			ca.print();
			ca.show();
			ca.showA();
		}
		else if (p instanceof ChildB) {
			ChildB ca = (ChildB) p;
			ca.print();
			ca.show();
			ca.showB();
		}
		else {
			p.print();
			p.show();
		}
	}
	
	public static void main(String[] args) {
		Parent7 p = new Parent7();
		ChildA a = new ChildA();
		ChildB b = new ChildB();
		
		doWork(p);
		/* Parent: print()
		 * Parent: show() */
		
		doWork(a);
		/* Child-A: print()
		 * Parent: show()
		 * Child-A: show() */
		
		doWork(b);
		/* Child-B: print()
		 * Parent: show()
		 * Child-B: show() */
	}
}
