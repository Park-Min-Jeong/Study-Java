package abstractclass;

public class Teacher extends SchoolMember {
	private String subject;
	
	Teacher() {}
	Teacher(int no, String name, String subject) {
		super(no, name);
		this.subject = subject;
	}
	
	void show() {
		System.out.println("Teacher Information");
		System.out.println("-------------------------");
		System.out.println("number:  " + getNo());
		System.out.println("name:    " + getName());
		System.out.println("subject: " + this.subject + "\n");
	}
}
