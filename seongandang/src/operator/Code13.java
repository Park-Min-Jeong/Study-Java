package operator;

public class Code13 {
	public static void main(String[] args)
	{
		int a1 = 10, b1;
		int a2 = 10, b2;
		
		b1 = a1++; // post
		System.out.println("a1: " + a1); // 11
		System.out.println("b1: " + b1); // 10
		
		b2 = ++a2; // pre
		System.out.println("a2: " + a2); // 11
		System.out.println("b2: " + b2); // 11
		
		
		int n1 = 10, n2 = 20, n3 = 5, n4;
		
		n4 = n1++ + --n2 + ++n3;
		
		System.out.println("n1: " + n1); // 11
		System.out.println("n2: " + n2); // 19
		System.out.println("n3: " + n3); // 6
		System.out.println("n4: " + n4); // 35 = 10 + 19 + 6
	}
}
