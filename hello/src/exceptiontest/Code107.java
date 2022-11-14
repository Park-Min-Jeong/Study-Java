package exceptiontest;

class MyException extends Exception {
	int x;
	
	MyException(int x) {
		this.x = x;
	}
	
	public String toString() {
		return "I am " + x + " in MyException class";
	}
}

public class Code107 {
	public static void main(String[] args) {
		MyException me = new MyException(10);
		
		try {
			System.out.println("beore throw MyException");
			throw me;
		} catch (MyException e) {
			System.out.println(e);
		}
		System.out.println("main ends");
		
		/* beore throw MyException
		 * I am 10 in MyException class
		 * main ends
 */
	}
}
