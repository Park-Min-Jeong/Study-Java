package operator;

public class Code17 {
	public static void main(String[] args)
	{
		int a = 10, b = 20;
		
		boolean t1 = a < b, t2 = a != b;
		boolean f1 = a > b, f2 = a == b;
		System.out.println(t1 + " "+ t2);
		System.out.println(f1 + " "+ f2);
		
		
		boolean ra1 = t1 && t2;
		boolean ra2 = t1 && f1;
		boolean ra3 = f1 && f2;
		System.out.println(ra1 + " "+ ra2 + " " + ra3);
		
		boolean ro1 = t1 || t2;
		boolean ro2 = t1 || f1;
		boolean ro3 = f1 || f2;
		System.out.println(ro1 + " "+ ro2 + " " + ro3);
		
		boolean rn1 = !t1;
		boolean rn2 = !f2;
		System.out.println(rn1 + " "+ rn2);
	}
}
