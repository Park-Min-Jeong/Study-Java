package operator;

public class Code16 {
	public static void main(String[] args)
	{
		int a = 50, b = 30, c = 50;
		
		boolean b1 = a > b;
		boolean b2 = b > a;
		
		boolean b3 = a >= c;
		boolean b4 = b >= c;
		
		boolean b5 = a < b;
		boolean b6 = b < a;
		
		boolean b7 = a <= c;
		boolean b8 = b <= c;
		
		boolean b9 = a == b;
		boolean b10 = a == c;
		
		boolean b11 = a != b;
		boolean b12 = a != c;
		
		System.out.println(">  " + b1 + " " + b2);
		System.out.println(">= " + b3 + " " + b4);
		System.out.println("<  " + b5 + " " + b6);
		System.out.println("<= " + b7 + " " + b8);
		System.out.println("== " + b9 + " " + b10);
		System.out.println("!= " + b11 + " " + b12);
		
		/* >  true false
		 * >= true false
		 * <  false true
		 * <= true true
		 * == false true
		 * != true false */
	}
}
