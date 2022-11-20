package iotest;

// FileOutputStream
// write(byte[] b)
import java.io.FileOutputStream;
import java.io.IOException;

public class Code117 {
	public static void main(String[] args) {
		String content = "Hello Java Programming";
		byte[] bytes = content.getBytes();
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("data3.txt");
			fos.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
