package iotest;

//try with resource
import java.io.*;

public class Code112 {
	public static void main(String[] args) {
		int x, y;
		
		// read not existing file
		try (FileInputStream fis = new FileInputStream("data.txt");) {
			do {
				x = fis.read();
				if (x != -1) System.out.print((char) x);
			} while (x != -1);
		} catch (IOException e) {
			System.out.println("Error reading");
		}
		
		
		// read and write file
		String inFile = "data1.txt";
		String outFile = "output.txt";
		
		try (FileInputStream fin = new FileInputStream(inFile);
			 FileOutputStream fout = new FileOutputStream(outFile)) {
			do {
				y = fin.read();
				if (y != -1) fout.write(y);
				System.out.print((char)y);
			} while (y != -1);
		}
		catch (IOException e) {
			System.out.println("File IO error: " + e);
		}
	}
}
