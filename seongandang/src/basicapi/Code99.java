package basicapi;

import java.util.Random;

public class Code99 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		
		for (int i=0; i<3; i++)
			System.out.print(rand1.nextInt() + " ");
		// -1180976682 2084135387 186851227 
		
		System.out.println();
		
		for (int i=0; i<3; i++)
			System.out.print(rand2.nextInt(100) + " ");
		// 65 76 22 
	}
}
