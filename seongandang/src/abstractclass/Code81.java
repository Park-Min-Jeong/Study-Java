package abstractclass;
// abstract: Book
// child: ComputerBook, EnlishBook

public class Code81 {
	public static void main(String[] args) {
		Book book[] = {new ComputerBook(1123, "Java", 15),
					   new EnglishBook(2000, "Toefl", 2019),
					   new EnglishBook(2001, "Toeic", 2018),
					   new ComputerBook(1150, "Python", 17),
					   new EnglishBook(2010, "Gre", 2020)};
		
		for (Book bk : book) {
			bk.printInfo();
		}
		
		/* Computer Book Information
		 * -------------------------
		 * code:      1123
		 * title:     Java
		 * stock:     15
		 * 
		 * English Book Information
		 * -------------------------
		 * code:      2000
		 * title:     Toefl
		 * published: 2019
		 * 
		 * English Book Information
		 * -------------------------
		 * code:      2001
		 * title:     Toeic
		 * published: 2018
		 * 
		 * Computer Book Information
		 * -------------------------
		 * code:      1150
		 * title:     Python
		 * stock:     17
		 * 
		 * English Book Information
		 * -------------------------
		 * code:      2010
		 * title:     Gre
		 * published: 2020 */
	}
}
