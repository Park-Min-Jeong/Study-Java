package inheritance;

class Person3 {
	private String name;
	
	Person3() {}
	Person3(String name) {
		this.name = name;
	}
	
	String getName() {return name;}
	
	void print() {
		System.out.println("I am " + name);
	}
}

class Teacher extends Person3 {
	private String subject;
	
	Teacher() {}
	Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	void print() {
		System.out.println("I am " + getName() + " and I teach " + subject);
	}
}

class Student3 extends Person3 {
	private String year;
	
	Student3() {}
	Student3(String name, String year) {
		super(name);
		this.year = year;
	}
	
	void print() {
		System.out.println("I am " + getName() + " an I am " + year);
	}
}

public class Code71 {
	public static void main(String[] args) {
		Person3 p1 = new Teacher("Alice", "Math");
		Person3 p2 = new Student3("David", "Sophomore");
		
		p1.print();
		p2.print();
	}
}
