package classobject;

class Friend {
	String name;
	int age;
	
	void printFriend() {
		System.out.println("name: " + name + ", age: " + age);
	}
}

class Dog2 {
	String name;
	String color;
	
	Dog2() { // default constructor
		System.out.println("Default constructor is called");
	}
	void printDog() {
		System.out.println("name: " + name + ", color: " + color);
	}
}

class Point {
	int x;
	int y;
	
	Point() { // default constructor
		x = 10;
		y = 20;
	}
	void printPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

public class Code49 {
	public static void main(String[] args) {
		/* not having any constructor */
		Friend f = new Friend();
		f.printFriend();  // name: null, age: 0
		
		f.name = "Alice";
		f.age = 20;
		f.printFriend();  // name: Alice, age: 20
		
		
		/* having default constructor with println code */
		Dog2 d = new Dog2(); // Default constructor is called
		d.printDog();        // name: null, color: null
		
		d.name = "happy";
		d.color = "white";
		d.printDog();        // name: happy, color: white
		
		
		/* having default constructor with default value */
		Point p = new Point();
		p.printPoint();
		
		p.x = 30;
		p.y = 70;
		p.printPoint();
	}
}
