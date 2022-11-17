package inheritance;

class GrandParent {
	int a = 10;
	void show1() {
		System.out.println("I am grandparent show1");
	}
}

class Parent5 extends GrandParent{
	int b = 20;
	void show2() {
		System.out.println("I am parent show2");
	}
}

class Children1 extends Parent5{
	int c = 30;
	void show3() {
		System.out.println("I am children1 show3");
	}
}

class Children2 extends Parent5{
	int d = 40;
	void show4() {
		System.out.println("I am children2 show4");
	}
}

public class Code69 {
	public static void main(String[] args) {
		Children1 c1 = new Children1();
		Children2 c2 = new Children2();
		
		System.out.println("c1.a: " + c1.a);
		System.out.println("c1.b: " + c1.b);
		System.out.println("c1.c: " + c1.c);
		
		System.out.println("c2.a: " + c2.a);
		System.out.println("c2.b: " + c2.b);
		System.out.println("c2.d: " + c2.d);
		
		c1.show1();
		c1.show2();
		c1.show3();
		
		c2.show1();
		c2.show2();
		c2.show4();
		
		
		/* c1.a: 10
		 * c1.b: 20
		 * c1.c: 30
		 * c2.a: 10
		 * c2.b: 20
		 * c2.d: 40
		 * I am grandparent show1
		 * I am parent show2
		 * I am children1 show3
		 * I am grandparent show1
		 * I am parent show2
		 * I am children2 show4 */
	}
}
