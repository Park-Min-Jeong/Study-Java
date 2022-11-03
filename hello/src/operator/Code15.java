package operator;

public class Code15 {
	public static void main(String[] args)
	{
		int x1 = 20, x2 = -20;
		
		int a = 2;
		
		int r1 = x1 >> a;
		int r2 = x1 >>> a;
		int r3 = x1 << a;
		System.out.println("20 >> 2: " + r1);  // 20 >> 2: 5
		System.out.println("20 >>> 2: " + r2); // 20 >>> 2: 5
		System.out.println("20 << 2: " + r3);  // 20 << 2: 80
		
		int r4 = x2 >> a;
		int r5 = x2 >>> a;
		int r6 = x2 << a;
		System.out.println("-20 >> 2: " + r4);  // -20 >> 2: -5
		System.out.println("-20 >>> 2: " + r5); // -20 >>> 2: 1073741819
		System.out.println("-20 << 2: " + r6);  // -20 << 2: -80
		
		/* checking binary */
		System.out.println("\n=== checking binary ===");
		System.out.println(Integer.toBinaryString(x1));
		System.out.println(Integer.toBinaryString(x1>>1));
		System.out.println(Integer.toBinaryString(x1>>>1));
		System.out.println(Integer.toBinaryString(x1<<1));
		
		System.out.println(Integer.toBinaryString(x2));
		System.out.println(Integer.toBinaryString(x2>>1));
		System.out.println(Integer.toBinaryString(x2>>>1));
		System.out.println(Integer.toBinaryString(x2<<1));
	}
}
