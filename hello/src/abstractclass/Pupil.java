package abstractclass;

public class Pupil extends SchoolMember {
	private int year;
	
	Pupil() {}
	Pupil(int no, String name, int year) {
		super(no, name);
		this.year = year;
	}
	
	void show() {
		System.out.println("Pupil Information");
		System.out.println("-------------------------");
		System.out.println("number:  " + getNo());
		System.out.println("name:    " + getName());
		System.out.println("year: " + this.year + "\n");
	}

}
