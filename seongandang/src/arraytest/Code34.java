package arraytest;

public class Code34 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		/* equals */
		if (s1 == s2)
			System.out.println("same");
		else
			System.out.println("different");
		
		if (s1.equals(s2))
			System.out.println("same");
		else
			System.out.println("different");
		
		
		/* length */
		String name = "Alice";
		String emptyString = "";
		String space = " ";
		
		System.out.println(name.length());
		System.out.println(emptyString.length());
		System.out.println(space.length());
		
		
		/* + */
		String s3 = "Hello";
		String s4 = "World";
		
		String str1;
		str1 = s3 + s4;
		System.out.println(str1);
		
		String str2;
		str2 = s3 + " " + s4;
		System.out.println(str2);
	}
}
