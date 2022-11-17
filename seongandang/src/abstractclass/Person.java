package abstractclass;
// abstract class

public abstract class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	
	public void print() {
		System.out.println("=== Person print ===");
	}
	public abstract void show(); // abstract method
}
