package lambdaenumanno;

// generic functional interface
interface TestGeneric<T> {
	boolean test(T n, T m);
}

public class Code147 {
	public static void main(String[] args) {
		TestGeneric<Integer> x = (n, m) -> n < m;
		if (x.test(3, 5)) System.out.println("3 is less than 5");
		else System.out.println("3 is bigger than 5");
		
		TestGeneric<String> z = (a, b) -> a.equals(b);
		String str = "java";
		if (z.test(str,  "java")) System.out.println("same string");
		else System.out.println("different string");
	}
}
