package inheritance;

class Person2 {
	private String name;
	private String email;
	
	// 1
	Person2() { 
		System.out.println("default constructor of parent");
	}
	// 2
	Person2(String name) { 
		this.name = name;
		System.out.println("1 constructor of parent");
	}
	// 3
	Person2(String name, String email) { 
		this(name);
		this.email = email;
		System.out.println("2 constructor of parent");
	}
}

class Student2 extends Person2 {
	private int score;
	private int year;
	
	// 4
	Student2() {
		System.out.println("default constructor of child");
	} 
	// 5
	Student2(String name, String email) { 
		super(name, email);
		System.out.println("1 constructor of child");
	}
	// 6
	Student2(String name, String email, int score) {
		this(name, email);
		this.score = score;
		System.out.println("2 constructor of child");
	}
	// 7
	Student2(String name, String email, int score, int year) {
		this(name, email);
		this.score = score;
		this.year = year;
		System.out.println("3 constructor of child");
	}
}


public class Code65 {
	public static void main(String[] args) {
		Student2 s1 = new Student2(); 
		System.out.println("------------------");
		// 1 -> 4
		
		Student2 s2 = new Student2("Alice", "abcd@gmail.com");
		System.out.println("------------------");
		// 2 -> 3 -> 5
		
		Student2 s3 = new Student2("Bob", "efgh@gmail.com", 90);
		System.out.println("------------------");
		// 2 -> 3 -> 5-> 6
		
		Student2 s4 = new Student2("Cindy", "ijkl@gmail.com", 84, 19);
		System.out.println("------------------");
		// 2 -> 3 -> 5-> 7
		
		/* default constructor of parent
		 * default constructor of child
		 * ------------------
		 * 1 constructor of parent
		 * 2 constructor of parent
		 * 1 constructor of child
		 * ------------------
		 * 1 constructor of parent
		 * 2 constructor of parent
		 * 1 constructor of child
		 * 2 constructor of child
		 * ------------------
		 * 1 constructor of parent
		 * 2 constructor of parent
		 * 1 constructor of child
		 * 3 constructor of child
		 * ------------------ */
	}
}
