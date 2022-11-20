package iotest;

import java.io.IOException;

public class Code109 {
	public static void main(String[] args) {
		System.out.print("Enter one character: ");
		int x;
		try {
			x = System.in.read();
			System.out.println("You entered " + x);
			System.out.println("You entered " + (char)x);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("Enter string: ");
		int y;
		try {
			while ((y = System.in.read()) != -1) {
				System.out.print((char)y);
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
