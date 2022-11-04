package controlstate;

public class Code30 {
	public static void main(String[] args) {
		int r1, r2, c1, c2;
		
		/* while */
		System.out.println("***** while *****");
		r1 = 1;
		while (r1 <= 10) {
			c1 = 1;
			while (c1 <= 10) {
				System.out.print(r1 * c1 + " ");
				c1++;
			}
			r1++;
			System.out.println();
		}
		
		
		/* for */
		System.out.println("***** for *****");
		for (r2=1; r2<=10; r2++) {
			for (c2=1; c2<=10; c2++) {
				System.out.print(r2 * c2 + " ");
			}
			System.out.println();
		}
	}
}
