package abstractclass;

public class Professor extends Person {
	private String department;
	
	public Professor(int id, String name, String department) {
		super(id, name);
		this.department = department;
	}
	
	public void show() {
		System.out.println("=== Professor show ===");
		System.out.println("id: " + getId() + ", name: " + getName() + ", department: " + department);
	}
}
