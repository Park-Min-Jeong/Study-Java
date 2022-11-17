package abstractclass;
// abstract: SchoolMember
// child: Teacher, Pupil

public class Code80 {
	public static void main(String[] args) {
		SchoolMember t1 = new Teacher(112, "Alice", "Math");
		SchoolMember t2 = new Teacher(115, "Paul", "Emglish");
		SchoolMember p1 = new Pupil(5, "David", 2);
		SchoolMember p2 = new Pupil(7, "Cindy", 1);
		
		t1.show();
		t2.show();
		p1.show();
		p2.show();
		
		/* Teacher Information
		 * -------------------------
		 * number:  112
		 * name:    Alice
		 * subject: Math
		 * 
		 * Teacher Information
		 * -------------------------
		 * number:  115
		 * name:    Paul
		 * subject: Emglish
		 * 
		 * Pupil Information
		 * -------------------------
		 * number:  5
		 * name:    Alice
		 * year: 2
		 * 
		 * Pupil Information
		 * -------------------------
		 * number:  7
		 * name:    Alice
		 * year: 1 */
	}
}
