package inheritance;

class Parent4 {
	void show() {
		System.out.println("I am parent show");
	}
	
	void show(int data) {
		System.out.println("I am prarent show - data: " + data);
	}
	
	void show(String msg) {
		System.out.println("I am parent: " + msg);
	}
}


class Child4 extends Parent4{
	void show(int data) {
		System.out.println("I am child show - data: " + data);
	}
}


public class Code67 {
	public static void main(String[] args) {
		Child4 c = new Child4();
		c.show();
		c.show(100); // method overriding
		c.show("Hello");
	}
}
