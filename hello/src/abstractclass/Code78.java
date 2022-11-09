package abstractclass;
// abstract: Person
// child: Professor, Student

public class Code78 {
	public static void main(String[] args) {
		Professor prof = new Professor(1, "Edda", "Psychology");
		prof.print();
		prof.show();
		/* === Person print ===
		 * === Professor show ===
		 * id: 1, name: Edda, department: Psychology */
		
		Student stud = new Student(11, "Kelly", 3);
		stud.print();
		stud.show();
		
		/* === Person print ===
		 * === Student show ===
		 * id: 11, name: Kelly, year: 3 */
	}
}
