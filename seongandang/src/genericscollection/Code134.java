package genericscollection;

// Set -> HashSet
import java.util.HashSet;

public class Code134 {
	public static void main(String[] args) {
		Integer[] a = {2, 3, 1, 4, 4, 1, 1, 2, 2, 2, 3, 1, 4, 4, 1};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i=0; i<a.length; i++)
			set.add(a[i]);
		
		System.out.println(set);
		// [1, 2, 3, 4]
	}
}
