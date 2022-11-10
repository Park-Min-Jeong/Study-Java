package interfaceprev;

class ChildrenBook implements Book {
	private String title;
	private String author;
	
	ChildrenBook() {}
	ChildrenBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void printInfo() {
		System.out.println("** Info for books **");
	}
	
	public void showTitle() {
		System.out.println("title: " + title);
		System.out.println("author: " + author);
	}
}
