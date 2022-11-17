package basicapi;

public class Code95 {
	public static void main(String[] args) {
		/* append */
		StringBuffer sb1 = new StringBuffer("Good morning");
		sb1.append("!");
		sb1.append(" Alice!");
		System.out.println(sb1);
		// Good morning! Alice!
		
		/* charAt, compareTo */
		StringBuffer sb2 = new StringBuffer("water");
		StringBuffer sb3 = new StringBuffer("wafer");
		System.out.println("sb2.charAt(2): " + sb2.charAt(2));
		// sb2.charAt(2): t
		System.out.println("sb2.compareTo(sb3): " + sb2.compareTo(sb3));
		// sb2.compareTo(sb3): 14
		
		/* delete */
		StringBuffer sb4 = new StringBuffer("Java Programming Language");
		sb4.delete(5, 8);
		System.out.println("sb4.delete(5, 8): " + sb4);
		// sb4.delete(5, 8): Java gramming Language
		
		/* capacity, substring, trimToSize */
		StringBuffer sb5 = new StringBuffer("Hello World");
		System.out.println("sb5: " + sb5);
		// sb5: Hello World
		System.out.println("sb5.substring(7): " + sb5.substring(7));
		// sb5.substring(7): orld
		System.out.println("sb5: " + sb5);
		// sb5: Hello World
		System.out.println("sb5.capacity(): " + sb5.capacity());
		// sb5.capacity(): 27
		sb5.trimToSize();
		System.out.println("after trim: " + sb5.capacity());
		// after trim: 11
		
		StringBuffer x = new StringBuffer("Hello World");
		StringBuffer y = new StringBuffer("Hello World");
		
		/* toString is overriden */
		System.out.println(x);
		// Hello World
		
		/* equals is not overriden */
		if (x.equals(y))
			System.out.println("x equals y");
		else
			System.out.println("x not equals y");
		// x not equals y
	}
}
