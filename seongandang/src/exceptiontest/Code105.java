package exceptiontest;

public class Code105 {
	public static void main(String[] args) {
		int A[] = new int[5];
		
		try {
			A[7] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			/* Index 7 out of bounds for length 5 */
			System.out.println("==============");
			
			e.printStackTrace();
			/* java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
			 * at hello/exceptiontest.Code105.main(Code105.java:8) */
			System.out.println("==============");
		}
		
		A[7] = 100;
		/* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
		 * at hello/exceptiontest.Code105.main(Code105.java:6) */
	}
}
