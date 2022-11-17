package exceptiontest;

public class Code102 {
	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		int n[] = {1, 3, 5, 6, 10};
		
		try {
			for (int i=0; i<=5; i++) {
				System.out.println("n["+i+"] = " + n[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index is out of bounds");
		}
		
		
		for (int i=0; i<=5; i++) {
			System.out.println("n["+i+"] = " + n[i]);
		}	
		/* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		 * at hello/exceptiontest.Code102.main(Code102.java:7) */
	}
}
