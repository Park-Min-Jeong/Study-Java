package operator;

public class Code12 {
	public static void main(String[] args)
	{
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		
		/* byte rb;    error! 
		 * rb = b + b; type mismatch: cannot convert from int to byte
		 * rb = b + s;
		 * rb = s + i; */

		/* short rs;   error! 
		 * rs = b + s; type mismatch: cannot convert from int to short
		 * rs = s + s;
		 * rs = s + i;
		 * rs = i + l; type mismatch: cannot conver from long to short */
		
		int ri;
		ri = b + s;
		System.out.println(ri); // 30
		ri = s + i;
		System.out.println(ri); // 50
		ri = i + i;
		System.out.println(ri); // 60
		/* ri = i + l; type mismatch: cannot convert from long to int */
		
		
		long rl;
		rl = b + s;
		System.out.println(rl); // 30
		rl = s + i;
		System.out.println(rl); // 50
		rl = i + l;
		System.out.println(rl); // 70
		rl = l + l;
		System.out.println(rl); // 80
	}
}
