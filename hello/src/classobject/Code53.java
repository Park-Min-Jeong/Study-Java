package classobject;

class Student3 {
	static int numberOfStudent;
	String name;
	double score;
	
	Student3() {
		numberOfStudent++;
	}
	Student3(String n, double s) {
		numberOfStudent++;
		name = n;
		score = s;
	}
	void printStudent() {
		System.out.println("name: " + name + ", score: " + score);
		System.out.println("numberOfStudent: " + numberOfStudent);
	}
}

public class Code53 {
	public static void main(String[] args) {
		Student3 s1 = new Student3("Alice", 90.5);
		s1.printStudent();
		
		Student3 s2 = new Student3("Paul", 88.3);
		s2.printStudent();
		
		Student3 s3 = new Student3("Cindy", 77.1);
		s3.printStudent();
	}
}
