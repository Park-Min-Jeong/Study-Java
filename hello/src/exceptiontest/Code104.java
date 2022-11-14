package exceptiontest;

public class Code104 {
	public static void main(String[] args) {
		int a = 5, b = 0, c;
		int A[] = new int[3];
		
		try {
			c = a / b;
			A[3] = 100;
		} catch (ArithmeticException e) {
			System.out.println("cannot be divided with 0");
		} catch (Exception e) {
			System.out.println("invalid index");
		} finally {
			System.out.println("finally block");
		}
		
		/* cannot be divided with 0
		 * finally block */
		
		try {
			A[3] = 100;
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("cannot be divided with 0");
		} catch (Exception e) {
			System.out.println("invalid index");
		} finally {
			System.out.println("finally block");
		}
		
		/* invalid index
		 * finally block */
		
		try {
			A[3] = 100;
			c = a / b;
		} catch (Exception e) {
			System.out.println("invalid index");
		//} catch (ArithmeticException e) { error! unreachable catch block
			// System.out.println("cannot be divided with 0");
		} finally {
			System.out.println("finally block");
		}
	}
}
