package iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Code111 {
	public static void main(String[] args) {
		// read one by one
		// not existing file
		FileInputStream fis1 = null;
		try {
			fis1 = new FileInputStream("input.txt");
			int x;
			while ((x = fis1.read()) != -1)
				System.out.print((char) x);
		} catch (FileNotFoundException e) {
			System.out.println("input.txt is not existing");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis1.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println("fis is null");
			}
		}
		System.out.println("==============");
		
		
		// read all bytes with array
		FileInputStream fis2 = null;
		byte b[] = new byte[50];
		
		try {
			fis2 = new FileInputStream("data1.txt");
			fis2.read(b);
			for (byte x : b) {
				System.out.print((char) x);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("input.txt is not existing");
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis2.close();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			catch (NullPointerException e) {
				System.out.println("fis is null");
			}
		}
	}
}
