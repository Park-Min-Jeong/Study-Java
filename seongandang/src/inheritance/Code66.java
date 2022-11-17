package inheritance;

class Parent3 {
	int data = 10;
	private int data2 = 50;
	
	int getData2() {return data2;}
	
	
	void printParent() {
		System.out.println("print from Parent");
	}
	
	void printData() { // method overriding
		System.out.println("Parent -- " + data + "," + data2);
	}
	
	void print() {
		System.out.println("----------------");
	}
}

class Child3 extends Parent3{
	int data = 20;
	
	void printData() {
		System.out.println("data from Parent: " + super.data);
		// System.out.println("data2 from Parent: " + super.data2); error! invisible
		System.out.println("data2 from Parent: " + super.getData2());
		System.out.println("data from Child: " + this.data);
		System.out.println("data: " + data);
	}
	
	void print() {
		super.print();
	}
}

public class Code66 {
	public static void main(String[] args) {
		Child3 c = new Child3();
		c.printData();
		c.printParent();
		c.print();
	}
}
