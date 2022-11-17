package controlstate;

public class Code24 {
	public static void main(String[] args) {
		int a = 10, b = 30;
		int m1, m2;
		
		/* if */
		if (a > b) m1 = a;
		else m1 = b;
		
		/* ternary operator */
		m2 = (a > b) ? a : b;
		
		System.out.println(m1);
		System.out.println(m2);
	}
}
