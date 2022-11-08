package classobject;

class Student4 {
	private String name;
	private int score;
	
	Student4(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
	
	void printStudent() {
		System.out.println(name + "(" + score + ")");
	}
}

public class Code60 {
	public static void main(String[] args) {
		// case 1
		Student4 st1[] = new Student4[5];
		st1[0] = new Student4("Alice", 88);
		st1[1] = new Student4("Tom", 98);
		st1[2] = new Student4("Jenny", 80);
		st1[3] = new Student4("Betty", 79);
		st1[4] = new Student4("Daniel", 91);
		
		int total = 0;
		for (int i=0; i<st1.length; i++) {
			total += st1[i].getScore();
		}
		
		double average = (double) total / st1.length;
		System.out.println("average: " + average);
		
		
		// case 2
		Student4 st2[] = {new Student4("Alice", 88),
				new Student4("Tom", 98),
				new Student4("Jenny", 80),
				new Student4("Betty", 79),
				new Student4("Daniel", 91)};
		
		int total2 = 0;
		for (Student4 s : st2)
			total2 += s.getScore();
		
		double average2 = (double) total2 / st2.length;
		System.out.println("average: " + average2);
	}
}
