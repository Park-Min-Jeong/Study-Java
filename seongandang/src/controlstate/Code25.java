package controlstate;

public class Code25 {
	public static void main(String[] args) {
		/* while */
		int a = 1;
		int s1 = 0;
		while (a <= 10) {
			s1 += a;
			a += 1;
		}
		System.out.println(s1);
		
		/* for */
		int i;
		int s2 = 0;
		for (i = 1; i <= 10; i++) {
			s2 += i;
		}
		System.out.println(s2);
	}
}
