package threadtest;

// thread with join

class ChrThreadWithJoin extends Thread {
	public void run() {
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
	}
}

public class Code142 {
	public static void main(String[] args) {
		Thread th = new ChrThreadWithJoin();
		th.start();
		
		for (int i=1; i<=26; i++) {
			System.out.print(i);
		}
		
		try {
			th.join();
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println(" -> end"); // always at final
	}
}
