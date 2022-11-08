package inheritance;

class Parent {
	int x = 10;
	int y = 20;
	
	Parent() {
		System.out.println("parent constructor is called");
	}
	
	void show() {
		System.out.println("I am parent show");
	}
	void print() {
		System.out.println("I am parent print");
	}
}

class Child extends Parent {
	int y = 30;
	int z = 40;
	
	Child() {
		System.out.println("child constructor is called");
	}
	
	void show() {
		System.out.println("I am child show");
	}
	void check() {
		System.out.println("I am child check");
	}
}

public class Code64 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("c.x: " + c.x);
		System.out.println("c.y: " + c.y);
		System.out.println("c.z: " + c.z);
		
		c.show();
		c.print();
		c.check();
	}
}
