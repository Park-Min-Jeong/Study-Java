package genericscollection;

// List -> LinkedList
import java.util.LinkedList;
import java.util.Iterator;

public class Code128 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("red");
		list.add("blue");
		list.add("purple");
		list.add("yellow");
		list.add("green");
		
		for (String s: list)
			System.out.println(s);
		
		System.out.println("---------------");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String t = iter.next();
			System.out.println(t);
		}
	}
}
