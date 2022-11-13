package basicapi;

import java.util.Scanner;

public class Code100 {
	public static void main(String[] args) {
		int computerChoice, guess = 0;
		int count = 0;
		
		computerChoice = (int) (Math.random() * 100);
		System.out.println("Computer choose a integer from 1 to 100");
		System.out.println("** Guess a number chosen by computer **");
		System.out.println("---------------------------------------");
		while (computerChoice != guess) {
			System.out.print("Enter the number from 1 to 100: ");
			count += 1;
			Scanner scin = new Scanner(System.in);
			guess = scin.nextInt();
			
			if (guess > computerChoice)
				System.out.println("Enter smaller number");
			if (guess < computerChoice)
				System.out.println("Enter bigger number");
		}
		
		System.out.println("You got the anwer");
		System.out.println("You tried " + count + " times");
	}
}
