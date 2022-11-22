package genericscollection;

// List -> ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class Code126 {
	public static void main(String[] args) {
		ArrayList<String> number = new ArrayList<String>();
		
		number.add("one");
		number.add("two");
		number.add("three");
		number.add("four");
		
		// using for
		System.out.println("=== for ===");
		for (int i=0; i<number.size(); i++)
			System.out.println(number.get(i)); // number[i] -> error!
		
		// using for-each
		System.out.println("=== for-each ===");
		for (String x: number)
			System.out.println(x);
		
		// using Iterator
		System.out.println("=== Iterator ===");
		Iterator<String> iter = number.iterator();
		while (iter.hasNext()) {
			String t = iter.next();
			System.out.println(t);
		}
	}
}
