package threadtest;

// thread with priority
class PriorityChange implements Runnable {
	Thread thread;
	static String currentName;
	int count;
	static boolean stop = false;
	
	PriorityChange(String name) {
		thread = new Thread(this, name);
		count = 0;
		currentName = name;
	}
	
	public void run() {
		System.out.println(thread.getName() + " starting");
		do {
			count++;
		} while (stop==false && count<2147483647);
		stop = true;
		System.out.println(thread.getName() + " terminating >> " + thread.getPriority());
	}
}

public class Code144 {
	public static void main(String[] args) {
		PriorityChange mt1 = new PriorityChange("MAX");
		PriorityChange mt2 = new PriorityChange("MIN");
		PriorityChange mt3 = new PriorityChange("NORM");
		
		mt1.thread.setPriority(Thread.MAX_PRIORITY);
		mt2.thread.setPriority(Thread.MIN_PRIORITY);
		mt3.thread.setPriority(Thread.NORM_PRIORITY);
		
		mt1.thread.start();
		mt2.thread.start();
		mt3.thread.start();
		
		try {
			mt1.thread.join();
			mt2.thread.join();
			mt3.thread.join();
		} catch (InterruptedException e) {
			System.out.println("main interrupted");
		}
		
		System.out.println("\nMax priority count: " + mt1.count);
		System.out.println("Min priority count: " + mt2.count);
		System.out.println("Norm priority count: " + mt3.count);
		/* Max priority count: 2147483647
		 * Min priority count: 109049
		 * Norm priority count: 2147483647 */
	}
}
