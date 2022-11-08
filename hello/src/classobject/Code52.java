package classobject;

class PersonalInfo {
	String name;
	int age;
	double height;
	
	PersonalInfo() {}
	PersonalInfo(String n, int a, double h) {
		name = n;
		age = a;
		height = h;
	}
	
	void printPersonalInfo() {
		System.out.println("name: " + name + ", age: " + age + ", height: " + height);
	}
}

public class Code52 {
	public static void main(String[] args) {
		PersonalInfo p1 = new PersonalInfo();
		PersonalInfo p2 = new PersonalInfo("Alice", 10, 115.5);
		
		p1.printPersonalInfo();
		p2.printPersonalInfo();
		
		System.out.println("p2.name: " + p2.name + ", p2.age: " + p2.age + ", p2.height: " + p2.height);
	}
}
