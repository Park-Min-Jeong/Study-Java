package abstractclass;

public abstract class Parent {
	private int dataA;
	
	Parent() {}
	Parent(int dataA) {
		this.dataA = dataA;
	}
	
	void show() {
		System.out.println("parent show: " + dataA);
	}
	
	abstract void call(); // abstract method
}
