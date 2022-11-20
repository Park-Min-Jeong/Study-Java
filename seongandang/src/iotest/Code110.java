package iotest;

import java.io.FileInputStream;
import java.io.IOException;

public class Code110 {
	public static void main(String[] args) {
		// read by character
		FileInputStream fis1 = null;
		try {
			fis1 = new FileInputStream("data1.txt");
			System.out.println((char)fis1.read());
			System.out.println((char)fis1.read());
			System.out.println((char)fis1.read());
			System.out.println((char)fis1.read());
			System.out.println((char)fis1.read());
			System.out.println((char)fis1.read());
			System.out.println((char)fis1.read());
			System.out.println((char)fis1.read());
			System.out.println((char)fis1.read());
			
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis1.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("======================");
		
		
		// read all characters
		FileInputStream fis2 = null;
		try {
			fis2 = new FileInputStream("data1.txt");
			int x;
			while ((x = fis2.read()) != -1)
				System.out.print((char) x);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis2.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
