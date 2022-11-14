package exceptiontest;

public class Code103 {
	public static void main(String[] args) {
		try {
			System.out.println("hello world");
			System.out.println("inside try");
		} catch (Exception e) {
			System.out.println("I am catch");
		} finally {
			System.out.println("finally block"); 
		}
		
		/* hello world
		 * inside try
		 * finally block */
	}
}
