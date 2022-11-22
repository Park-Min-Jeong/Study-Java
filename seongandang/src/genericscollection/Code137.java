package genericscollection;

// Map -> TreeMap
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class PersonD {
	private String name;
	private int score;
	
	PersonD(String name, int score) {this.name = name; this.score = score;}
	
	public String toString() {return "(" + name + "," + score + ")";}
}

public class Code137 {
	public static void main(String[] args) {
		TreeMap<Integer, PersonD> map = new TreeMap<>();
		map.put(3, new PersonD("David", 80));
		map.put(1, new PersonD("Bob", 90));
		map.put(2, new PersonD("Alice", 88));
		map.put(5, new PersonD("Cindy", 77));
		map.put(4, new PersonD("Jenny", 93));
		
		// keySet
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		System.out.println("--------------------------------");
		
		// all entry
		for(Map.Entry<Integer, PersonD> e: map.entrySet()) {
			Integer key = e.getKey();
			PersonD value = e.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println("--------------------------------");
		
		// get
		PersonD val = (PersonD)map.get(3);
		System.out.print("key 3 -> ");
		System.out.println(val);
	}
}
