package helloworld;

public class Code8 {
	public static void main(String[] args)
	{
		char c1 = 'A', c2 = 'a', c3 = 'B', c4 = 'b';
		System.out.println((int)(c1)); // 65
		System.out.println((int)(c2)); // 97
		System.out.println((int)(c3)); // 66
		System.out.println((int)(c4)); // 98
		
		char ch = '가'; // run configuration encoding MS949
		System.out.println(ch);        // 가
		System.out.println((int)(ch)); // 44032
		
		char x = 'A';
		x++;
		System.out.println(x); // B
		
		// char x = 'A ' error!	no space
		// char a = ''   error! must have a character
		
	}
}
