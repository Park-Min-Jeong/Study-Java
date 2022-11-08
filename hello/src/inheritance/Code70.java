package inheritance;

class Parent6 {
	void print() {
		System.out.println("Parent - print method");
	}
	void test() {
		System.out.println("Parent - test method");
	}
}

class Child6 extends Parent6 {
	void print() { // overriding
		System.out.println("Child - print method");
	}
	void check() {
		System.out.println("Child - check method");
	}
}

public class Code70 {
	public static void main(String[] args) {
		Parent6 p = new Parent6();
		p.print(); // Parent - print method
		p.test();  // Parent - test method
		// p.check(); error! undefined
		
		Child6 c = new Child6();
		c.print(); // Child - print method
		c.check(); // Child - check method
		c.test();  // Parent - test method
		
		Parent6 x = new Child6(); // polymorphism
		x.print(); // Child - print method
		x.test();  // Parent - test method
		// x.check(); error! undefined
	}
}
