package controlstate;

public class Code23 {
	public static void main(String[] args) {
		int score = 80;
		char grade;
		
		switch(score) {
		case 90:
			grade = 'A';
			break;
		case 80:
			grade = 'B';
			break;
		case 70:
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
		}
		System.out.println("grade: " + grade);
	}
}
