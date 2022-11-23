package lambdaenumanno;

// annotation
// @Deprecated

class TestAnnotation {
	private String msg;
	
	TestAnnotation(String msg) {this.msg = msg;}
	
	@Deprecated
	String getMsg() {return msg;}
}

public class Code150 {
	public static void main(String[] args) {
		TestAnnotation t = new TestAnnotation("hello");
		System.out.println(t.getMsg());
	}
}
