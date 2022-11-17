package basicapi;

public class Code97 {
	public static void main(String[] args) {
		String s = new String("computer");
		String new_s = s.substring(0, 5) + 't' + s.substring(5);
		System.out.println("new_s: " + new_s);
		
		StringBuffer sb = new StringBuffer("computer");
		sb.insert(5, 't');
		System.out.println("sb: " + sb);
	}
}
