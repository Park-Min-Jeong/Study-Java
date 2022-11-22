package genericscollection;

class Data<T> {
	T obj;
	
	Data(T obg) {
		this.obj = obg;
	}
	
	T getObj() {return obj;}
	void showType() {
		System.out.println("Type of T: " + obj.getClass().getName());
	}
}

public class Code123 {
	public static void main(String[] args) {
		Data<Integer> d1 = new Data<Integer>(100);
		System.out.println(d1.getObj());
		d1.showType();
		
		Data<String> d2 = new Data<String>("JAVA");
		System.out.println(d2.getObj());
		d2.showType();
		
		// if (d1 == d2) error! Incompatible operand types
	}
}
