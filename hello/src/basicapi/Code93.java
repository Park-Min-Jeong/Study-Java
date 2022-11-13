package basicapi;

public class Code93 {
	public static void main(String[] args) {
		String str = new String("Java Programming");
		System.out.println("str.charAt(7): " + str.charAt(8));
		// str.charAt(7): g
		
		String temp = new String("Java Coding");
		System.out.println("str.compareTo(temp): " + str.compareTo(temp));
		// str.compareTo(temp): 13
		
		String temp2 = new String("Study");
		System.out.println("str.concat(temp2): " + str.concat(temp2));
		// str.concat(temp2): Java ProgrammingStudy
		
		String temp3 = new String("gram");
		String temp4 = new String("coding");
		System.out.println("str.contains(temp3): " + str.contains(temp3));
		// str.contains(temp3): true
		System.out.println("str.contains(temp4): " + str.contains(temp4));
		// str.contains(temp4): false
		
		System.out.println("str.indexOf('a'): " + str.indexOf('a'));
		// str.indexOf('a'): 1
		System.out.println("str.lastIndexOf('a'): " + str.lastIndexOf('a'));
		// str.lastIndexOf('a'): 10
		System.out.println("str.indexOf('u'): " + str.indexOf('u'));
		// str.indexOf('u'): -1
		
		System.out.println("str.length(): " + str.length());
		// str.length(): 16
		
		String str2 = str.replace('a', 'A');
		System.out.println("str.replace('a', 'A'): " + str2);
		// str.replace('a', 'A'): JAvA ProgrAmming
		
		
		String x = new String("Hello World");
		String y = new String("Hello World");
		
		if (x == y)
			System.out.println("x == y");
		else
			System.out.println("x != y");
		// x != y
		
		if (x.equals(y))
			System.out.println("x equals y");
		else
			System.out.println("x not equals y");
		// x equals y
		
		String z = new String("Hello world");
		/* toString is overriden */
		System.out.println(z);
		// Hello world
		System.out.println(z.toString());
		// Hello world
	}
}
