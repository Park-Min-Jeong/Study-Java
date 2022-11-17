package method;

public class Code44 {
	static void overMethod() {
		System.out.println("No parameters");
	}
	static void overMethod(int x) {
		System.out.println("One parameter: " + x);
	}
	static void overMethod(int x, int y) {
		System.out.println("Two integer parameters: " + x + ", " + y);
	}
	static void overMethod(int x, double y) {
		System.out.println("One integer " + x + " and the other double " + y);
	}
	
	public static void main(String[] args) {
		overMethod();
		overMethod(10);
		overMethod(5, 7);
		overMethod(100, 25.5);
		
		/* No parameters
		 * One parameter: 10
		 * Two integer parameters: 5, 7
		 * One integer 100 and the other double 25.5 */
	}
}
