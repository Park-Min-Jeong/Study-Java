package basicapi;

public class Code92 {
	public static void main(String[] args) {
		String s1 = new String("Hello world");
		String s2 = new String("Hello world");
		String s3 = "Hello world";
		String s4 = "Hello world";
		
		if (s1 == s2)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		if (s3 == s4)
			System.out.println("s3 == s4");
		else
			System.out.println("s3 != s4");
		
		if (s1 == s3)
			System.out.println("s1 == s3");
		else
			System.out.println("s1 != s3");
		
		/* s1 != s2
		 * s3 == s4
		 * s1 != s3 */
	}
}
