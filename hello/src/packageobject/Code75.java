package packageobject;

import java.util.Scanner;

public class Code75 {
	public static void main(String[] args) {
		java.lang.String name = "Alice";
		int age = 10;
		java.lang.System.out.println(name + " is " + age + " years old");
		
		
		// specifying package name in body
		java.util.Scanner scin = new java.util.Scanner(System.in);
		System.out.print("Enter your name: ");
		String name2 = scin.next();
		
		
		// using import
		Scanner scin2 = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age2 = scin2.nextInt();
		
		
		System.out.println("You are " + name2 + " and " + age2 + " years old"); 
		// not specifying package java.lang
		
		scin.close();
		scin2.close();
		
	}
}
