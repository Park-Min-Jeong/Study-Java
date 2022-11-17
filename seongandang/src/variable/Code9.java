package variable;

public class Code9 {
	public static void main(String[] args)
	{
		byte b1 = 126;
		System.out.println(b1); // 126
		b1++;
		System.out.println(b1); // 127
		b1++;
		System.out.println(b1); // -128
		
		byte b2 = -127;
		System.out.println(b2); // -127
		b2--;
		System.out.println(b2); // -128
		b2--;
		System.out.println(b2); // 127
		
		// byte b = 200; error! out of range
		
		
		short s1 = 32766;
		System.out.println(s1); // 32766
		s1++;
		System.out.println(s1); // 32767
		s1++;
		System.out.println(s1); // -32768
		
		short s2 = -32767;
		System.out.println(s2); // -32767
		s2--;
		System.out.println(s2); // -32768
		s2--;
		System.out.println(s2); // 32767
		
		// short s = 40000; error! out of range
		
		
		int i1 = 2147483647;
		System.out.println(i1); // 2147483647
		i1++;
		System.out.println(i1); // -2147483648
		
		int i2 = -2147483648;
		System.out.println(i2); // -2147483648
		i2--;
		System.out.println(i2); // 2147483647
		
		
		long lng1 = 500;
		long lng2 = 700L;
		long lng3 = 1000l;
		System.out.println(lng1); // 500
		System.out.println(lng2); // 700
		System.out.println(lng3); // 1000
		
		long lng4 = 123412341234L;
		long lng5 = -123412341234l;
		System.out.println(lng4); // 123412341234
		System.out.println(lng5); // -123412341234
		
		long lng6 = 2147483647;
		System.out.println(lng6); // 2147483647
		lng6++;
		System.out.println(lng6); // 2147483648
		
		// long lng = 2147483648; error! out of int range! must have L or l
		// long lng = -2147483649; error! out of int range! must have L or l
	}
}
