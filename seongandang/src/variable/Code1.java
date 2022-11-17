package variable;

public class Code1 {
	public static void main(String[] args)
	{
		int a = 10, b = 20;
		System.out.println(a);
		System.out.println(b);
		
		a = a + 1;
		b = a + b;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		/* 10
		 * 20
		 * 11
		 * 31
		 * a = 11
		 * b = 31 */
	}
}
