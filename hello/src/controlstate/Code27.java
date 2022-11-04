package controlstate;

import java.util.Scanner;

public class Code27 {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scin.nextInt();
		
		int count = 0;
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) 
				count++;
		}
		
		if (count == 2)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is composite number");
		
		scin.close();
	}
}
