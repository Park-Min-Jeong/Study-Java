package threadtest;

// named thread

class NumThreadWithName extends Thread {
	String name;
	
	NumThreadWithName(String name) {this.name = name;}
	
	public void run() {
		System.out.println(name + " starting");
		try {
			for (int i=0; i<10; i++) {
				Thread.sleep(200);
				System.out.println("In " + name + ": " + i);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name + " terminating");
	}
}

class ChrThreadWithName implements Runnable {
	String name;
	
	ChrThreadWithName(String name) {this.name = name;}
	
	public void run() {
		System.out.println(name + " starting");
		try {
			for (char i='A'; i<='J'; i++) {
				Thread.sleep(200);
				System.out.println("In " + name + ": " + i);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name + " terminating");
	}
}

public class Code140 {
	public static void main(String[] args) {
		// one thread
		System.out.println("main starting");
		Thread th = new Thread(new NumThreadWithName("Number Thread"));
		
		th.start();
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(200);
				System.out.println("In main: " + i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("main ending");
		
		System.out.println("=============================================");
		
		// two thread
		System.out.println("main starting");
		Thread th1 = new Thread(new NumThreadWithName("Number Thread"));
		Thread th2 = new Thread(new ChrThreadWithName("Charater Thread"));
		
		th1.start();
		th2.start();
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(200);
				System.out.println("In main: " + i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("main ending");
	}
}
