package interfaceprev;

// abstract class vs. interface

public class Code85 {
	public static void main(String[] args) {
		/* abstract class */
		PersonA t1 = new TeacherA();
		PersonA s1 = new StudentA();
		t1.print();
		s1.print();
		
		/* interface */
		PersonB t2 = new TeacherB();
		PersonB s2 = new StudentB();
		t2.print();
		s2.print();
	}
}
