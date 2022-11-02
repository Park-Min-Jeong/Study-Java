package variable;

public class Code6 {
	public static void main(String[] args)
	{
		int a = 33, b = 25;
		System.out.println(a + " hello ");
		System.out.println(a + " hello " + b);
		System.out.println(a + b + " hello ");
		System.out.println(a + b + " hello " + a + b);
		System.out.println(a + b + " hello " + (a + b));
		
		/* 33 hello 
		 * 33 hello 25
		 * 58 hello 
		 * 58 hello 3325
		 * 58 hello 58 */
	}
}
