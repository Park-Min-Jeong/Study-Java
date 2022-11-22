package genericscollection;

// Set -> TreeSet -> Comparator
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Person {
	private int id;
	private int score;
	
	Person() {}
	Person(int id, int score) {this.id = id; this.score = score;}
	
	int getId() {return id;}
	int getScore() {return score;}
	public String toString() {return "[id=" + id + ", score=" + score + "]";}
}

class PersonComparatorId implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		return o1.getId() - o2.getId();
	}
}

class PersonComparatorScore implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		return o1.getScore() - o2.getScore();
	}
}

public class Code133 {
	public static void main(String[] args) {
		// sort by id
		System.out.println("=== sort by id ===");
		TreeSet<Person> tsA = new TreeSet<>(new PersonComparatorId());
		
		tsA.add(new Person(3, 83));
		tsA.add(new Person(5, 90));
		tsA.add(new Person(1, 93));
		tsA.add(new Person(2, 88));
		tsA.add(new Person(4, 70));
		
		Iterator<Person> iterA = tsA.iterator();
		
		while (iterA.hasNext())
			System.out.println(iterA.next());
		
		
		// sort by score
		System.out.println("=== sort by score ===");
		TreeSet<Person> tsB = new TreeSet<>(new PersonComparatorScore());
		
		tsB.add(new Person(3, 83));
		tsB.add(new Person(5, 90));
		tsB.add(new Person(1, 93));
		tsB.add(new Person(2, 88));
		tsB.add(new Person(4, 70));
		
		Iterator<Person> iterB = tsB.iterator();
		
		while (iterB.hasNext())
			System.out.println(iterB.next());
	}
}
