package abstractclass;

public abstract class SchoolMember {
	private int no;
	private String name;
	
	SchoolMember() {}
	SchoolMember(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	int getNo() {return no;}
	String getName() {return name;}
	
	abstract void show();
}
