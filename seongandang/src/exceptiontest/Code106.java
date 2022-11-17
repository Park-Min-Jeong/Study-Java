package exceptiontest;

public class Code106 {
	public static void makeArrayTryCatch() {
		int A[] = new int[3];
		try {
			A[0] = 10;
			A[1] = 20;
			A[2] = 30;
			A[3] = 40;
			A[4] = 50;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void makeArrayThrows() throws ArrayIndexOutOfBoundsException {
		int A[] = new int[3];
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		A[3] = 40;
		A[4] = 50; 
	}
	
	public static void makeArray() {
		int A[] = new int[3];
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		A[3] = 40;
		A[4] = 50;
	}
	
	public static void main(String[] args) {
		System.out.println("main starts");
		
		makeArrayTryCatch();
		System.out.println("main done try ~ catch");
		
		try {
			makeArrayThrows();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main done throws");
		
		makeArray();
		System.out.println("main ends");
		
		/* main starts
		 * Index 3 out of bounds for length 3
		 * main done try ~ catch
		 * Index 3 out of bounds for length 3
		 * main done throws
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		 * 			at hello/exceptiontest.Code106.makeArray(Code106.java:9)
		 * 			at hello/exceptiontest.Code106.main(Code106.java:14) */
	}
}
