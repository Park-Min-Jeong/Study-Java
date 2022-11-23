package threadtest;

// Runnable class

class NumThreadRunnable implements Runnable {
	public void run() {
		for (int i=1; i<=26; i++) {
			System.out.print(i);
		}
	}
}

public class Code139 {
	public static void main(String[] args) {
		Thread t = new Thread(new NumThreadRunnable());
		t.start();
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
	}
}
