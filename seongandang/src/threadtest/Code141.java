package threadtest;

// thread with isAlive

class ChrThreadWithIsAlive extends Thread {
	public void run() {
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
	}
}

public class Code141 {
	public static void main(String[] args) {
		Thread th = new ChrThreadWithIsAlive();
		th.start();
		
		do {
			System.out.print("*");
		} while (th.isAlive());
	}
}
