package genericscollection;

// Map -> HashMap
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Code136 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("david", "1234");
		map.put("cindy", "0987");
		map.put("alice", "5678");
		map.put("paul", "0000");
		map.put("mary", "5757");
		
		// keyset
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		System.out.println("--------------------------------");
		
		
		// all entry
		for (Map.Entry<String, String> e: map.entrySet()) {
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key + ":" + value);
		}
		System.out.println("--------------------------------");
		
		// get
		String val = (String) map.get("alice");
		System.out.println("Value for key alice is: " + val);
	}
}
