package genericscollection;

// Set -> HashSet
import java.util.HashSet;

class PersonC {
	String name;
	int age;
	
	PersonC(String name, int age) {this.name = name; this.age = age;}
	
	public String toString() {return name + ":" + age;}
	
	public boolean equals(Object obj) {
		if (obj instanceof PersonC) {
			PersonC tmp = (PersonC) obj;
			return name.equals(tmp.name) && age==tmp.age;
		}
		return false;
	}
	
	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class Code135 {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		
		set.add(new String("Alice"));
		set.add(new String("Alice"));
		set.add(new PersonC("Robert", 10));
		set.add(new PersonC("Robert", 10));
		
		System.out.println(set);
	}
}
