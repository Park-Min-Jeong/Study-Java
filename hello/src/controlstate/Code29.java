package controlstate;

public class Code29 {
	public static void main(String[] args) {
		/* break */
		// while
		int a = 1;
		while (a <= 10) {
			if (a == 5)
				break;
			System.out.println(a);
			a++;
		}
		
		// for
		for (int b=1; b<=10; b++) {
			if (b == 5)
				break;
			System.out.println(b);
		}
		
		
		/* continue */
		// while
		int x = 0;
		while (x < 10) {
			x++;
			System.out.println("before continue: " + x);
			if (x % 3 == 0)
				continue;
			System.out.println("after  continue: " + x);
		}
		
		// for
		for (int y=1; y<=10; y++) {
			System.out.println("before continue: " + y);
			if (y % 3 == 0)
				continue;
			System.out.println("after  continue: " + y);
		}
	}
}
