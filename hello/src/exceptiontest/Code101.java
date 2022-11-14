package exceptiontest;

public class Code101 {
	public static void main(String[] args) {
		// ArithmeticException
		
		int a = 5, b = 0, c;
		
		try {
			c = a / b;
			System.out.println("c: " + c);
		} catch (ArithmeticException e) {
			System.out.println("cannot be divided with 0");
		}
		
		c = a / b;
		System.out.println("c: " + c);
		/* Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * at hello/exceptiontest.Code101.main(Code101.java:6) */
	}
}
