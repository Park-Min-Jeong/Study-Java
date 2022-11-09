package abstractclass;

public class Child extends Parent{
	private int dataB;
	
	Child() {}
	Child(int dataA, int dataB) {
		super(dataA);
		this.dataB = dataB;
	}
	
	void show() {
		super.show();
		System.out.println("child show: " + dataB);
	}
	
	void print() {
		System.out.println("child print");
	}
	
	void call() {
		System.out.println("child call <- abstract method");
	}
}
