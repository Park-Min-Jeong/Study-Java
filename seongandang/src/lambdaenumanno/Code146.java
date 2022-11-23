package lambdaenumanno;

// multi line lambda expression

interface MyValue5 {
	int getSum(int n);
}

public class Code146 {
	public static void main(String[] args) {
		MyValue5 t = (n) -> {
			int result = 0;
			for (int i=1; i<=n; i++)
				result += i;
			return result;
		}; // must have semicolon
		
		System.out.println("sum from 1 to 10 is " + t.getSum(10));
		System.out.println("sum from 1 to 20 is " + t.getSum(20));
		System.out.println("sum from 1 to 30 is " + t.getSum(30));
		/* sum from 1 to 10 is 55
		 * sum from 1 to 20 is 210
		 * sum from 1 to 30 is 465 */
	}
}
