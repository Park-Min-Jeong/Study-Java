package genericscollection;

// List -> Queue
import java.util.LinkedList;
import java.util.Queue;

public class Code130 {
	static void printQueue(Queue<Integer> qu) {
		for (Integer x: qu)
			System.out.print(x + " ");
		System.out.println(" -> " + qu.size());
	}
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		// add
		q.add(10);
		q.add(20);
		q.add(30);
		printQueue(q);                                                                                                                                                                                                                                                      
		
		// poll
		System.out.println("You polled: " + q.poll());
		printQueue(q);
		
		while (!q.isEmpty())
			System.out.println(q.poll());
	}
}
