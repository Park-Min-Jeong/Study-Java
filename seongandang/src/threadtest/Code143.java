package threadtest;

// class with priority
// getPriority

class Priority extends Thread {
	String name;
	
	Priority(String name) {this.name = name;}
	
	public void run() {
		System.out.println(name + " starting");
		try {
			for (int i=0; i<5; i++) {
				Thread.sleep(200);
				System.out.println("In " + name + ": " + i + " (priority: " + getPriority() + ")");
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name + " terminating");
	}
}

public class Code143 {
	public static void main(String[] args) {
		System.out.println("main starting");
		Thread th = new Thread(new Priority("Priority Thread"));
		th.start();
		for (int i=0; i<5; i++) {
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
