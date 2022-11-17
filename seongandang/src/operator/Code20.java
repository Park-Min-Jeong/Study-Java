package operator;

public class Code20 {
	public static void main(String[] args)
	{
		/* assigning */
		byte bi, bj;
		int i = 100, j = 300;
		
		bi = (byte) i;
		System.out.println(bi); // 100
		
		bj = (byte) j;
		System.out.println(bj); // 44 -> 300 is out of byte range
		
		
		/* arithmetic - single type */
		int a;
		double x = 10.5, y = 2.8;
		
		a = (int) (x/y);
		System.out.println(a); // 3
		
		
		/* arithmetic - multiple type */
		byte b1 = 10, b2;
		int b = 5;
		
		b2 = (byte) (b1 + b);
		System.out.println(b2); // 15
	}
}
