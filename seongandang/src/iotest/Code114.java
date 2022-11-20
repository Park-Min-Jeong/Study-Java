package iotest;

// FileReader
import java.io.FileReader;
import java.io.IOException;

public class Code114 {
	public static void main(String[] args) {
		// int read()
		System.out.println("***** using read() *****");
		
		FileReader fis1 = null;
		try {
			fis1 = new FileReader("data1.txt");
			int x;
			while ((x = fis1.read()) != -1) 
				System.out.print((char) x);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis1.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
		// int read(char[] cbuf)
		System.out.println("\n" + "***** using read(char[] cbuf) *****");
		FileReader fis2 = null;
		char data[] = new char[50];
		try {
			fis2 = new FileReader("data1.txt");
			fis2.read(data);
			for (int x : data)
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
