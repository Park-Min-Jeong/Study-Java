package operator;

public class Code19 {
	public static void main(String[] args)
	{
		char x = 'a';
		int y;
		
		long a = 10000L;
		float b;
		double d;
		
		System.out.println("***** int = char *****");
		y = x;
		System.out.println(y); // 97
		System.out.println((char)y); // a
		
		System.out.println("***** float = long *****");
		b = a;
		System.out.println(b); // 10000.0
		
		System.out.println("***** double = long *****");
		d = a;
		System.out.println(d); // 10000.0
		
		/* long ln;
		 * float f = 108F;
		 * ln = f; error! type mismatch: cannot convert float into long
		 * */
	}
}
