package classobject;

class Student2 {
	int no;
	String name;
	double score;
	
	Student2() {}
	Student2(int n) {
		no = n;
	}
	Student2(int n, String nm) {
		no = n;
		name = nm;
	}
	Student2(int n, String nm, double s) {
		no = n;
		name = nm;
		score = s;
	}
	
	void printStudent() {
		System.out.println("no: " + no + ", name: " + name + ", score: " + score);
	}
}

public class Code51 {
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2(10);
		Student2 s3 = new Student2(15, "David");
		Student2 s4 = new Student2(20, "Paul", 92.5);
		
		s1.printStudent(); // no: 0, name: null, score: 0.0
		s2.printStudent(); // no: 10, name: null, score: 0.0
		s3.printStudent(); // no: 15, name: David, score: 0.0
		s4.printStudent(); // no: 20, name: Paul, score: 92.5
	}
}
