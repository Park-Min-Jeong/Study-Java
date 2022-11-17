package classobject;

class Circle {
	static double PI = 3.141592; // static variable
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	double area() {
		return this.radius * this.radius * PI;
	}
	
	double perimeter() {
		return 2 * this.radius * PI;
	}
	
	static void printPI() { // static method
		System.out.println("PI: " + PI);
		
		//System.out.println(radius); 
		// error! cannot make a static reference to non-static field radius
	}
	
	static void testPrint() {
		printPI();
		// perimeter();
		// error! cannot make a static reference to non-static method perimeter() from the type Circle
	}
}

public class Code56 {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(100.0);
		
		System.out.println("area of c1: " + c1.area());
		System.out.println("perimeter of c1: " + c1.perimeter());
		System.out.println("area of c2: " + c2.area());
		System.out.println("perimeter of c2: " + c2.perimeter());
		
		Circle.printPI();
		Circle.testPrint();
	}
}
