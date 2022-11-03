package operator;

public class Code18 {
	public static void main(String[] args)
	{
		int a = 30, b = 11, c = 7, d = 10;
		
		a += b + c - d;
		System.out.println(a); // 38
		/* 1. b + c - d -> 8
		 * 2. a + {1} -> 38 
		 * 3. a = {2} -> 38 */
		
		a %= b - c;
		System.out.println(a); // 2
		/* 1. b - c -> 4
		 * 2. a % {1} -> 2
		 * 3. a = {2} -> 2 */
	}
}
