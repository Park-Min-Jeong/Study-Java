package controlstate;

public class Code21 {
	public static void main(String[] args)
	{
		/* if */
		int s1 = 95;
		if (s1 >= 90) {
			System.out.println("s1 -- PASS!!");
		}
		
		int s2 = 85;
		if (s2 >= 90) {
			System.out.println("s2 -- PASS!!");
		}
		
		
		/* if ~ else */
		int s3 = 95;
		if (s3 >= 90) {
			System.out.println("s3 -- PASS!!");
		}
		else {
			System.out.println("s3 -- FAIL!!");
		}
		
		int s4 = 85;
		if (s4 >= 90) {
			System.out.println("s4 -- PASS!!");
		}
		else {
			System.out.println("s4 -- FAIL!!");
		}
		
		
		/* if ~ else if ~ else */
		int s5 = 95;
		if (s5 >= 90) {
			System.out.println("s5 -- Excellent!!");
		}
		else if (s5 >= 80) {
			System.out.println("s5 -- Good!!");
		}
		else if (s5 >= 70) {
			System.out.println("s5 -- OK!!");
		}
		else {
			System.out.println("s5 -- Not ok!!");
		}
		
		int s6 = 85;
		if (s6 >= 90) {
			System.out.println("s6 -- Excellent!!");
		}
		else if (s6 >= 80) {
			System.out.println("s6 -- Good!!");
		}
		else if (s6 >= 70) {
			System.out.println("s6 -- OK!!");
		}
		else {
			System.out.println("s6 -- Not ok!!");
		}
		
		int s7 = 75;
		if (s7 >= 90) {
			System.out.println("s7 -- Excellent!!");
		}
		else if (s7 >= 80) {
			System.out.println("s7 -- Good!!");
		}
		else if (s7 >= 70) {
			System.out.println("s7 -- OK!!");
		}
		else {
			System.out.println("s7 -- Not ok!!");
		}
		
		int s8 = 65;
		if (s8 >= 90) {
			System.out.println("s8 -- Excellent!!");
		}
		else if (s8 >= 80) {
			System.out.println("s8 -- Good!!");
		}
		else if (s8 >= 70) {
			System.out.println("s8 -- OK!!");
		}
		else {
			System.out.println("s8 -- Not ok!!");
		}
		
		System.out.println("ending... program");
	}
}
