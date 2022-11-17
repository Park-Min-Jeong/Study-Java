package classobject;

class Dog {
	String name;
	int age;
}

public class Code47 {
	public static void main(String[] args) {
		Dog happy = new Dog();
		Dog bella = new Dog();
		
		happy.name = "Happy";
		happy.age = 3;
		
		bella.name = "Bella";
		bella.age = 2;
		
		System.out.println(happy); // classobject.Dog@506e1b77
		System.out.println(bella); // classobject.Dog@4fca772d
		
		
		System.out.println("I have two dogs");
		System.out.println("One is " + happy.name + " whose age is " + happy.age);
		System.out.println("The other is " + bella.name + " whose age is " + bella.age);
	}
}
