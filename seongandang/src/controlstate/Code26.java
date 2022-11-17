package controlstate;

import java.util.Scanner;

public class Code26 {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scin.nextInt();
		
		/* aliquot */
		int a = 1;
		while (a <= n) {
			if (n % a == 0) 
				System.out.print(a + " ");
			a += 1;
		}
		System.out.println("");
		
		/* digits */
		while (n > 0) {
			int m = n % 10;
			System.out.println(m);
			n /= 10;
		}
		
		scin.close();
	}
}
