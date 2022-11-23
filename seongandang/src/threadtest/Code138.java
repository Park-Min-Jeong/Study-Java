package threadtest;

// Thread

class NumThreadBasic extends Thread {
	public void run() {
		for (int i=1; i<=26; i++) {
			System.out.print(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class ChrThreadBasic extends Thread {
	public void run() {
		for (char ch='a'; ch<='z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Code138 {
	public static void main(String[] args) {
		// 1 thread
		System.out.println("=== 1 thread ===");
		Thread t = new NumThreadBasic();
		t.start();
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		// 2 thread
		System.out.println("\n=== 2 thread ===");
		Thread t1 = new NumThreadBasic();
		Thread t2 = new ChrThreadBasic();
		t1.start();
		t2.start();
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
