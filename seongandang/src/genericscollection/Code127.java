package genericscollection;

// List -> ArrayList
import java.util.ArrayList;

public class Code127 {
	static void printList(ArrayList<String> al) {
		for (String x: al)
			System.out.print(x + " ");
		System.out.println(" -> " + al.size());
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		// add
		list.add("C");
		list.add("Java");
		list.add("HTML5");
		list.add("Python");
		list.add("Java");
		printList(list);
		
		// add with index
		list.add(1, "C++");
		printList(list);
		
		// change
		list.set(0, "Fortran");
		printList(list);
		
		// remove
		list.remove(2);
		printList(list);
		list.remove("C++");
		printList(list);
	}
}
