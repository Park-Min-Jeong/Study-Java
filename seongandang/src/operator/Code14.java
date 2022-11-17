package operator;

public class Code14 {
	public static void main(String[] args)
	{
		int x = 11, y = 13;
		
		int z1 = x & y;
		System.out.println(z1); // 9
		/* x : 1011
		 * y : 1101
		 * z : 1001 */
		
		int z2 = x | y;
		System.out.println(z2); // 15
		/* x : 1011
		 * y : 1101
		 * z : 1111 */
		
		int z3 = x ^ y;
		System.out.println(z3); // 6
		/* x : 1011
		 * y : 1101
		 * z : 0110 */
	}
}
