package abstractclass;

public class EnglishBook extends Book{
	private int publishedYear;
	
	EnglishBook() {}
	EnglishBook(int code, String title, int publishedYear) {
		super(code, title);
		this.publishedYear = publishedYear;
	}
	
	void printInfo() {
		System.out.println("English Book Information");
		System.out.println("-------------------------");
		System.out.println("code:      " + getCode());
		System.out.println("title:     " + getTitle());
		System.out.println("published: " + this.publishedYear + "\n");
	}
}
