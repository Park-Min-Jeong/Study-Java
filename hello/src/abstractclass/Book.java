package abstractclass;

public abstract class Book {
	public int code;
	public String title;
	
	Book() {}
	Book(int code, String title) {
		this.code = code;
		this.title = title;
	}
	
	int getCode() {return code;}
	String getTitle() {return title;}
	
	abstract void printInfo();
}
