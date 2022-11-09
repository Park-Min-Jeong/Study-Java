package packageobject;
import testpkg.Book;

public class Code76 {
	public static void main(String[] args) {
		/* case 1 */
		testpkg.Book bk1 = new testpkg.Book(101, "JAVA", 19800);
		bk1.printBookInfo();
		
		
		/* case 2 */
		Book bk2 = new Book(201, "algorithm", 25000);
		bk2.printBookInfo();
	}
}
