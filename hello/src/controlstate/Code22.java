package controlstate;

import java.util.Scanner;

public class Code22 {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		
		// case 1
		System.out.print("Enter a: ");
		int a = scin.nextInt();
		System.out.print("Enter b: ");
		int b = scin.nextInt();
		
		int m1 = 0;
		if (a > b) m1 = a;
		else m1 = b;
		
		System.out.println("max: " + m1);
		
		
		// case 2
		System.out.print("Enter three numbers: ");
		int x = scin.nextInt();
		int y = scin.nextInt();
		int z = scin.nextInt();
		
		int m2 = 0;
		if (x > y) m2 = x;
		else m2 = y;
		if (z > m2) m2 = z;
		
		System.out.println("max: " + m2);
		
		scin.close();
	}
}
