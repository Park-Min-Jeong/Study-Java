package testpkg;

public class Student {
	public String name;
	public int age;
	
	public Student() {}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	
	public void printStudentInfo() {
		System.out.println("name: " + name + ", age: " + age);
	}
}
