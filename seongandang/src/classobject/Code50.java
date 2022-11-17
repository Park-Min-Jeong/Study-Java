package classobject;

class Friend2 {
	String name;
	int age;
	
	Friend2() {} // default constructor
	Friend2(String n, int a) { // parameter constructor
		name = n;
		age = a;
	}
	
	void printFriend() {
		System.out.println("name: " + name + ", age: " + age);
	}
}

class Friend3 {
	String name;
	int age;
	
	// no default constructor
	Friend3(String n, int a) { // parameter constructor
		name = n;
		age = a;
	}
	
	void printFriend() {
		System.out.println("name: " + name + ", age: " + age);
	}
}

public class Code50 {
	public static void main(String[] args) {
		/* default + parameter */
		Friend2 f1 = new Friend2();
		f1.printFriend(); // name: null, age: 0
		
		Friend2 f2 = new Friend2("Alice", 20);
		f2.printFriend(); // name: Alice, age: 20
		
		
		/* only parameter*/
		// Friend3 f3 = new Friend3(); // constructor Friend3() is undefined
		Friend3 f3 = new Friend3("David", 23);
		f3.printFriend();
	}
}
