package genericscollection;

// Set -> TreeSet -> Comparable
import java.util.Iterator;
import java.util.TreeSet;

class PersonA implements Comparable<PersonA> {
	private int id;
	private int score;
	
	PersonA() {}
	PersonA(int id, int score) {this.id = id; this.score = score;}
	
	public String toString() {return "[id=" + id + ", score=" + score + "]";}
	public int compareTo(PersonA p) {
		return this.id - p.id;
	}
}

class PersonB implements Comparable<PersonB> {
	private int id;
	private int score;
	
	PersonB() {}
	PersonB(int id, int score) {this.id = id; this.score = score;}
	
	public String toString() {return "[id=" + id + ", score=" + score + "]";}
	public int compareTo(PersonB p) {
		return this.score - p.score;
	}
}

public class Code132 {
	public static void main(String[] args) {
		// sort by id
		System.out.println("=== sort by id ===");
		TreeSet<PersonA> tsA = new TreeSet<>();
		
		tsA.add(new PersonA(3, 83));
		tsA.add(new PersonA(5, 90));
		tsA.add(new PersonA(1, 93));
		tsA.add(new PersonA(2, 88));
		tsA.add(new PersonA(4, 70));
		
		Iterator<PersonA> iterA = tsA.iterator();
		
		while (iterA.hasNext())
			System.out.println(iterA.next());
		
		
		// sort by score
		System.out.println("=== sort by score ===");
		TreeSet<PersonB> tsB = new TreeSet<>();
		
		tsB.add(new PersonB(3, 83));
		tsB.add(new PersonB(5, 90));
		tsB.add(new PersonB(1, 93));
		tsB.add(new PersonB(2, 88));
		tsB.add(new PersonB(4, 70));
		
		Iterator<PersonB> iterB = tsB.iterator();
		
		while (iterB.hasNext())
			System.out.println(iterB.next());
	}
}
