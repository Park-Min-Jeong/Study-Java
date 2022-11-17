package packageobject;
// import testpkg.Book;
// import testpkg.Student;
import testpkg.*;

public class Code77 {
	public static void main(String[] args) {
		Book bk = new Book(301, "programming", 23400);
		bk.printBookInfo();
		
		Student st = new Student("Alice", 19);
		st.printStudentInfo();
	}
}
