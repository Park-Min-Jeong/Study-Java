package iotest;

// BufferedReader
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code121 {
	public static void main(String[] args) {
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("data1.txt")));
			int x = 0;
			while ((x = reader.read()) != -1)
				System.out.print((char) x);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
